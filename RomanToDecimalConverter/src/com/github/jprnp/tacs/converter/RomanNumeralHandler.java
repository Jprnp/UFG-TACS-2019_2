package com.github.jprnp.tacs.converter;

import java.util.HashMap;

public class RomanNumeralHandler {

    private final HashMap<Character, Integer> romanValues = new HashMap<>();

    RomanNumeralHandler() {
        this.romanValues.put('I', 1);
        this.romanValues.put('V', 5);
        this.romanValues.put('X', 10);
        this.romanValues.put('L', 50);
        this.romanValues.put('C', 100);
        this.romanValues.put('D', 500);
        this.romanValues.put('M', 1000);
    }

    public int romanToInt(String roman) {
        int decimal = 0;

        roman = roman.toUpperCase();

        for (int index = 0; index < roman.length(); index++) {
            int actualValue = this.romanValues.get(roman.charAt(index));

            if (index == roman.length() - 1) {
                decimal += actualValue;
                break;
            }

            int nextValue = this.romanValues.get(roman.charAt(index + 1));

            if (actualValue >= nextValue) {
                decimal += actualValue;
            } else {
                decimal += nextValue - actualValue;
                index++;
            }
        }

        return decimal;
    }
}
