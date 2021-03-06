## For Looping
##### Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

- <samp>For Looping is a programming technique used to repeat the process until a condition is not met. However, in the 'For' loop,</samp>

  <samp>there are 3 statements, namely: Initialization, a condition, Increment/decrement.</samp>
  
    <samp>  Format :</samp>
 
    ```java
    for (Initialization; condition; Increment/decrement) {

        // Code will be executed.
    }
    ```
  
    <samp>  Example :</samp>

    ```java
    int y = 5;

    for (int x = 1; y >= x ; x++) {

        System.out.println("number "+x);
    }    
    ```
  
- <samp>Nested For is the same as 'for loop' which is a programming technique used to loop through the process until a condition </samp> 

  <samp>is not met. However, in 'nested for' there is a loop in the loop.</samp>
        
    <samp>  Format :</samp>
    
    ```java
    for (Initialization; condition; Increment/decrement) {

        for(Initialization; condition; Increment/decrement){

        // Code will be executed.

        }
    }
    ```
    
    <samp>  Example :</samp>

    ```java
    int i,n;

      for (i = 0; i < 6; i++){

        for (n = 0; n < 6; n++){

          System.out.print("* ");

        }
    System.out.println();
    }
    ```
      
- <samp>For more details, please open [Main.java](https://github.com/suardi26/Java-Basic/blob/main/For%20Looping/src/com/practice/Main.java) in repositories suardi26/Java-Basic/For Looping/src/com/practice/</samp>

- <samp>Have a nice day.</samp>

---

##### Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

- <samp>For Looping adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan sampai suatu kondisi tidak terpenuhi.</samp>

  <samp>Namun pada perulangan 'For' terdapat 3 statement yaitu : Pemberian nilai awal (inisialisasi), suatu kondisi, Increment/decrement.</samp>
  
  <samp>  Format :</samp>
 
    ```java
    for (inisialisasi; kondisi; Increment/decrement) {
        
        // Kode akan dieksekusi.
    }
    ```
  
    <samp>  Contoh :</samp>

    ```java
    int y = 5;
        
    for (int x = 1; y >= x ; x++) {

        System.out.println("number "+x);
    } 
    ```
- <samp>Nested For / For bersarang sama seperti 'for loop' yang merupakan teknik pemrograman yang digunakan untuk melakukan proses</samp> 

  <samp>perulangan sampai suatu kondisi tidak terpenuhi. namun pada 'nested for' terdapat perulangan dalam perulangan.</samp>
        
    <samp>  Format :</samp>
    
    ```java
    for (inisialisasi; kondisi; Increment/decrement) {
        
        for (inisialisasi; kondisi; Increment/decrement) {

         // Kode akan dieksekusi.

        }
    }
    ```
    
    <samp>  Contoh :</samp>

    ```java
    int i,n;
    
    for (i = 0; i < 6; i++){

      for (n = 0; n < 6; n++){

          System.out.print("* ");

        }

        System.out.println();
    }
    ```
      
- <samp>Untuk lebih jelasnya, silahkan buka [Main.java](https://github.com/suardi26/Java-Basic/blob/main/For%20Looping/src/com/practice/Main.java) di repositori suardi26/Java-Basic/For Looping/src/com/practice/</samp>

- <samp>Semoga harimu menyenangkan.</samp>
