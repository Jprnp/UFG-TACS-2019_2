# Guia do Desenvolvedor 1.0

Este guia busca descrever padrões aceitos na Engenharia de Software para diversas situações da área do desenvolvimento, se baseando em grandes nomes da literatura como *Clean Code*, por Robert C. Martin.

## Índice

[Nomeação](#nomeação)

[Funções](#funções)



## Nomeação

Esta seção se baseia no **capítulo 2** do livro *Clean Code*, de *Robert C. Martin*.

+ Use nomes que revelem a intenção da variável/função/método/parâmetro/classe.
  

Ex.: 

  ```java
  class FileHandler {
      
      public static final String EXTENSION_PDF = "pdf";
      
      public static File readFile(String filePath) {
          (...)
      }
  }
  ```

O exemplo acima deixa claro que existe uma classe responsável por manusear arquivos que contém um método que lê um arquivo dado seu caminho e também possui uma constante que representa a extensão *.pdf*.

+ Evite concatenar palavras, letras, números ou símbolos sem sentido nos nomes a fim de distinguir variáveis.
  

Mau exemplo:

  ```java
  (...)
  private Date date1;
  private Date date2;
  (...)
  ```

Bom exemplo:

  ```java
  (...)
  private Date startDate;
  private Date finalDate;
  (...)
  ```

+ Use nomes legíveis. 
  Um nome de variável comprido, porém compreensível sempre será melhor para manutenibilidade do código do que um nome reduzido, porém confuso.
  

Mau exemplo:

  ```java
  (...)
  private Date genTmstp;
  private Date modTmstp;
  (...)
  ```

Bom exemplo:

  ```java
  (...)
  private Date generationTimestamp;
  private Date modificationTimestamp;
  (...)
  ```

+ Dê preferência para substantivos em nomes de classes e verbos (ou frases verbais) para nomes de métodos.

+ Escolha uma palavra para representar cada conceito.
  

Mau exemplo:

  ```java
  (...)
  private Customer fetchCustomer(Long customerId) {
  	(...)    
  }
  
  private Vendor retrieveVendor(Long vendorId) {
     (...)  
  }
  (...)
  ```

Bom exemplo:

  ```java
  (...)
  private Customer fetchCustomer(Long customerId) {
  	(...)    
  }
  
  private Vendor fetchVendor(Long vendorId) {
      (...) 
  }
  (...)
  ```



## Funções

Esta seção se baseia no **Capítulo 3** do livro *Clean Code*, de *Robert C. Martin*.

+ Os métodos e funções criadas devem buscar realizar somente uma ação, que deverá ser indicada de forma clara através de seu nome.

Mau exemplo:

```java
public float compute(float firstNumber, float secondNumber, char operation) {
    switch(operation) {
        case '+':
            return firstNumber + secondNumber;
        case '*':
            return firstNumber * secondNumber;
        
        (...)
    }
}
```

Bom exemplo:

```java
public float sum(float firstNumber, float secondNumber) {
    return firstNumber + secondNumber;
}

public float multiply(float firstNumber, float secondNumber) {
    return firstNumber * secondNumber;
}

public float subtract(float firstNumber, float secondNumber) {
    return firstNumber - secondNumber;
}

public float divide(float firstNumber, float secondNumber) {
    return firstNumber / secondNumber;
}
```

+ Para o exemplo acima, se aplica também outra dica importante: evite sempre utilizar parâmetros para indicar se a função deverá executar um passo a mais ou a menos. Nestes casos, busque sempre dividir a função/método em outras funções/métodos.

​	