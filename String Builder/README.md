## String Builder
##### Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

- <samp>When the String Value is immutable, it is different from the String Builder and String Buffer whose value can be changed (mutable).</samp>

- <samp>String Buffer and String Builder are classes that are used to create string objects so that their values can be modified.</samp> 

  <samp>but the difference is that String Buffer is synchronized so it is thread safe, while String Builder is</samp>
  
  <samp>not synchronized, but String Buffer is slower than String Builder. </samp>
  
- <samp>Some of the methods in StringBuilder :</samp>

     - <samp>append is a method to add StringBuilder value.</samp>
      
     - <samp>insert is a method to add StringBuilder Value of a certain character.</samp>
     
     - <samp>delete is a method to delete StringBuilder values starting from certain characters up to certain characters depending on</samp>

       <samp>the specified parameters.</samp>
     
     - <samp>setChartAt is a method used to change the StringBuilder value for a certain character.</samp>
     
     - <samp>replace is a method used to change the StringBuilder value starting from a certain character up to a certain character</samp> 
      
       <samp>depending on the parameters entered.</samp>

     - <samp>reverse is the method used to reverse the StringBuilder value.</samp>

     - <samp>toString is the method used to convert the StringBuilder value into a String value (Casting to String).</samp>

- <samp>When creating immutable values, use String.</samp>

- <samp>When creating a value that is mutable and will be accessed from multiple threads, use a StringBuffer.</samp>

- <samp>When creating a value that is mutable but only accessed by one thread, use a StringBuilder.</samp>

- <samp>For more details, please open [Main.java](https://github.com/suardi26/Java-Basic/blob/main/String%20Builder/src/com/practice/Main.java) in repositories suardi26/Java-Basic/String Builder/src/com/practice/</samp>

- <samp>Have a nice day.</samp>

---

##### Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

-  <samp>Ketika Nilai String itu tidak bisa berubah (immutable), maka berbeda dengan String Builder dan String Buffer yang Nilainya dapat diubah (mutable).</samp>

-  <samp>String Buffer dan String Builder merupakan kelas yang digunakan untuk membuat object string sehingga nilainya dapat dimodifikasi.</samp> 
 
   <samp>namun perbedaanya adalah String Buffer itu synchronized sehingga thread safe, sedangkan String Builder tidak synchronized,</samp> 
  
   <samp>tapi String Buffer lebih lambat dibandingkan String Builder.</samp>
  
-  <samp>Beberapa method yang ada pada StringBuilder :</samp>

    -  <samp>append adalah method untuk menambahkan nilai StringBuilder.</samp>

    -  <samp>insert adalah method untuk menambahkan Nilai StringBuilder dari character tertentu.</samp>
    
    -  <samp>delete adalah method untuk menghapus nilai StringBuilder mulai dari character tertentu sampai dengan character tertentu</samp> 
     
       <samp>tergantung dari parameter yang ditentukan.</samp>

    -  <samp>setChartAt adalah method yang digunakan untuk mengubah nilai StringBuilder pada character tertentu.</samp>

    -  <samp>replace adalah method yang digunakan untuk mengubah nilai StringBuilder mulai dari character tertentu sampai dengan</samp>  
    
       <samp>character tertentu tergantung dari parameter yang dimasukan.</samp>
      
    -  <samp>reverse adalah method yang digunakan untuk membalik nilai StringBuilder.</samp>

    -  <samp>toString adalah method yang digunakan untuk mengubah nilai StringBuilder menjadi nilai String (Casting to String).</samp>
    
-  <samp>Saat membuat nilai yang tidak akan berubah, maka gunakan String.</samp>

-  <samp>Saat membuat nilai yang bisa berubah (mutable) dan akan diakses dari beberapa thread, gunakanlah StringBuffer.</samp>

-  <samp>Saat membuat nilai yang bisa berubah (mutable) namun hanya diakses oleh satu thread, gunakanlah StringBuilder.</samp>

-  <samp>Untuk lebih jelasnya, silahkan buka [Main.java](https://github.com/suardi26/Java-Basic/blob/main/String%20Builder/src/com/practice/Main.java) di repositori suardi26/Java-Basic/String Builder/src/com/practice/.</samp>

-  <samp>Semoga harimu menyenangkan. </samp>
