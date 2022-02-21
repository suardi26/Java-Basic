## Arithmetic Operators And Numeric Data Type Conversion
##### Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

- <samp>Arithmetic operations consist of addition, subtraction, multiplication, division and modulus.</samp>

- <samp>Multiplication and division operators will be performed first, then addition and subtraction operations.</samp>

- <samp>If the multiplication and division operators are combined they will be executed from left to right, as well as addition </samp>
  
  <samp>and subtraction, will be executed from left to right.</samp>

- <samp>When you want to perform an addition or subtraction operation first, you can use the '( )' symbol.</samp> 
  
- <samp>For example : </samp>
   <samp>
  ```java
  int result = (2 + 3) * 5;
  ```
  </samp>
  
- <samp>There are two types of primitive data type casting, namely implicit and explicit casting.</samp>

    - <samp>Implicit casting is casting that is done without any additional code. Implicit casting is used to change the</samp> 
      
      <samp>data type of a value, from a small-capacity data type to a large-capacity data type. example :</samp>
            
      ```java
      int number1 = 5;
      
      long number2 = number1;
      ``` 
      
    - <samp>Explicit casting is casting that is done when we want to change a value's data type. from large-capacity data types</samp> 
      
      <samp>to small-capacity data types or data types that have decimal number values to data types that have integer values. example :</samp>
      
      ```java
      int number3 = 6;
      
      byte number4 = (byte) number3;
      //
      double number5 = 5.0;
      
      int number6 = (int) number5;
      ```
     
- <samp>And for the conversion/casting of numeric data types in java, must be considered is when converting from data types</samp> 
  
  <samp>that have a large interval capacity to data types that have a small interval capacity.</samp>

- <samp>For example : </samp>
  
  ```java
    int i = 257;
               
    bytes bt = (bytes) i;
  
  ```  
  
- <samp>Note: The variable 'bt' with byte data type will not be the same as the value of variable 'i' of type Integer, because the capacity </samp>

  <samp>of the byte data type is 8 bits, with intervals ranging from -128 to 127 while the value of the variable 'i' is integer</samp> 
  
  <samp>data type is 257.</samp>

- <samp>For more details, please open [Main.java](https://github.com/suardi26/Java-Basic/blob/main/Arithmetic%20Operators%20And%20Numeric%20Data%20Type%20Conversion/src/com/practice/Main.java) in repositories suardi26/Java-Basic/Arithmetic Operators And Numeric Data Type Conversion</samp>
  
  <samp>/src/com/practice/<samp>

- <samp>Have a nice day.</samp>

  ---

##### Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

- <samp>Operasi aritmatika terdiri dari penjumlahan, pengurangan, perkalihan,pembagian serta modulus. </samp>

- <samp>Operasi Perkalian dan pembagian akan dikerjakan terlebih dahulu, kemudian Operasi penjumlahan dan pengurangan.</samp>
  
- <samp>Jika Operator perkalian dan pembagian digabung maka akan dikerjakan dari kiri ke kanan, begitu juga dengan penjumlahan</samp> 
  
  <samp>dan pengurangan, akan di eksekusi dari kiri ke kanan. </samp>

- <samp>Ketika ingin melakukan operasi penjumlahan atau pengurangan terlebih dahulu maka dapat menggunakan simbol '( )'. </samp>
  
- <samp>Contoh : </samp>
   <samp>
  ```java
  int hasil = (2 + 3) * 5;
  ```
  </samp>
  
- <samp>Casting tipe data primtif ada dua tipe yaitu casting implisit dan eksplisit.</samp>
  
   -  <samp>Casting implisit adalah casting yang dilakukan tanpa adanya kode tambahan. casting implisit digunakan</samp> 
  
      <samp>untuk merubah tipe data suatu nilai, dari tipe data yang berkapasitas kecil ke tipe data yang berkapasitas besar. contoh :</samp>
  
      ```java
      int number1 = 5;
      
      long number2 = number1;
      ``` 
  
   -  <samp>Casting eksplisit adalah casting yang dilakukan ketika kita ingin merubah type data suatu nilai.</samp>
  
      <samp>dari tipe data yang berkapasitas besar ke tipe data yang berkapasitas kecil atau type data yang</samp> 
     
      <samp>memiliki nilai bilangan desimal ke tipe data yang memiliki nilai bilangan bulat. contoh :</samp>
      ```java
      int number3 = 6;
  
      byte number4 = (byte) number3;
      //
      double number5 = 5.0;
  
      int number6 = (int) number5;
      ```
  
- <samp>Dan untuk konversi/casting tipe data numerik pada java, yang harus diperhatikan adalah pada saat melakukan konversi dari tipe data</samp>  
  
  <samp> yang memiliki kapasitas interval yang besar ke tipe data yang memiliki kapasitas interval yang kecil.</samp> 
  
- <samp>Contoh : </samp>
  <samp>
  ```java
    int i = 257;
               
    bytes bt = (bytes) i;
  
  ```  
  </samp>
  
- <samp>Keterangan : Variabel 'bt' dengan tipe data byte tidak akan sama dengan nilai variabel 'i' yang bertipe Integer,</samp>  
  
  <samp>dikarenakan kapasitas dari tipe data byte adalah 8 bit, dengan interval mulai dari -128 s.d 127 sedangkan nilai</samp> 
    
  <samp>dari variabel 'i' yang bertipe data integer adalah 257.</samp>

- <samp>Untuk lebih jelasnya, silahkan buka [Main.java](https://github.com/suardi26/Java-Basic/blob/main/Arithmetic%20Operators%20And%20Numeric%20Data%20Type%20Conversion/src/com/practice/Main.java) di repositori suardi26/Java-Basic/Arithmetic Operators And </samp>
  
  <samp>Numeric Data Type Conversion/src/com/practice/.</samp>

- <samp>Semoga harimu menyenangkan.</samp> 
