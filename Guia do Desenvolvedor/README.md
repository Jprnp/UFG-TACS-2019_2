# Guia do Desenvolvedor 1.0

Este guia busca descrever padrões aceitos na Engenharia de Software para diversas situações da área do desenvolvimento, se baseando em grandes nomes da literatura como Clean Code, por Robert C. Martin.

## Índice

[Nomeação](#nomeação);



## Nomeação

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
  Date date1;
  Date date2;
  (...)
  ```

  Bom exemplo:

  ```java
  (...)
  Date startDate;
  Date finalDate;
  (...)
  ```

+ Use nomes legíveis. 
  Um nome de variável comprido, porém compreensível sempre será melhor para manutenibilidade do código do que um nome reduzido, porém confuso.
  Mau exemplo:

  ```java
  (...)
  Date genTmstp;
  Date modTmstp;
  (...)
  ```

  Bom exemplo:

  ```java
  (...)
  Date generationTimestamp;
  Date modificationTimestamp;
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
