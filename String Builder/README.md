Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

----------------------------------------String Builder----------------------------------------

- When the String Value is immutable, it is different from the String Builder and String Buffer whose value can be changed (mutable).

- String Buffer and String Builder are classes that are used to create string objects so that their values can be modified. but the difference 

  is that String Buffer is synchronized so it is thread safe, while String Builder is not synchronized, but String Buffer is slower than String Builder.
  
- Some of the methods in StringBuilder :

     - append is a method to add StringBuilder value.
      
     - insert is a method to add StringBuilder Value of a certain character.
     
     - delete is a method to delete StringBuilder values starting from certain characters up to certain characters depending on the specified parameters.
     
     - setChartAt is a method used to change the StringBuilder value for a certain character.
     
     - replace is a method used to change the StringBuilder value starting from a certain character up to a certain character depending on the parameters entered.

     - reverse is the method used to reverse the StringBuilder value.

     - toString is the method used to convert the StringBuilder value into a String value (Casting to String).

- When creating immutable values, use String.

- When creating a value that is mutable and will be accessed from multiple threads, use a StringBuffer.

- When creating a value that is mutable but only accessed by one thread, use a StringBuilder.

- For more details, please open Main.java in repositories suardi26/Java-Basic/String Builder/src/com/practice/

- Have a nice day.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

----------------------------------------String Builder----------------------------------------

- Ketika Nilai String itu tidak bisa berubah (immutable), maka berbeda dengan String Builder dan String Buffer yang Nilainya dapat diubah (mutable).

- String Buffer dan String Builder merupakan kelas yang digunakan untuk membuat object string sehingga nilainya dapat dimodifikasi. namun perbedaanya 
 
  adalah String Buffer itu synchronized sehingga thread safe, sedangkan String Builder tidak synchronized, tapi String Buffer lebih lambat dibandingkan String Builder.
  
- Beberapa method yang ada pada StringBuilder :

    - append adalah method untuk menambahkan nilai StringBuilder.

    - insert adalah method untuk menambahkan Nilai StringBuilder dari character tertentu.
    
    - delete adalah method untuk menghapus nilai StringBuilder mulai dari character tertentu sampai dengan character tertentu tergantung dari parameter yang ditentukan.

    - setChartAt adalah method yang digunakan untuk mengubah nilai StringBuilder pada character tertentu.

    - replace adalah method yang digunakan untuk mengubah nilai StringBuilder mulai dari character tertentu sampai dengan character tertentu tergantung 
    
      dari parameter yang dimasukan.
      
    - reverse adalah method yang digunakan untuk membalik nilai StringBuilder.

    - toString adalah method yang digunakan untuk mengubah nilai StringBuilder menjadi nilai String (Casting to String).
    
- Saat membuat nilai yang tidak akan berubah, maka gunakan String.

- Saat membuat nilai yang bisa berubah (mutable) dan akan diakses dari beberapa thread, gunakanlah StringBuffer.

- Saat membuat nilai yang bisa berubah (mutable) namun hanya diakses oleh satu thread, gunakanlah StringBuilder.

- Untuk lebih jelasnya, silahkan buka Main.java di repositori suardi26/Java-Basic/String Builder/src/com/practice/.

- Semoga harimu menyenangkan.
    
