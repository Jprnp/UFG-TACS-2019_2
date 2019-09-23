package com.github.jprnp.tacs.converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RomanNumeralHandler handler = new RomanNumeralHandler();

        System.out.println("Insira o numeral romano a ser convertido:");
        String numeralRomano = scanner.nextLine();

        int result = handler.romanToInt(numeralRomano);
        System.out.println("Resultado: " + result);
    }
}
