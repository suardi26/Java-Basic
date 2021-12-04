Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

------------------------------Get User Input (Scanner, BufferReader,Console)------------------------------

- There are 3 classes that are used to take input in text-based programs (Console), such as Scanner Class, BufferReader Class, and Console Class.

  1. Class Scanner.
        The Scanner class is a class that provides functions for take the input entered by the user. to be able to access the scanner class,
     we first import the Scanner class, like 'import java.util.Scanner'.
     
     Method used in Class Scanner:
     
        * nextBoolean() -> Reads a boolean value from the user
        * nextByte() -> Reads a byte value from the user
        * nextDouble() -> Reads a double value from the user
        * nextFloat() -> Reads a float value from the user
        * nextInt()	Reads a int value from the user
        * nextLine() -> Reads a String value from the user
        * nextLong() -> Reads a long value from the user
        * nextShort() -> Reads a short value from the user
        
  2. BufferReader class.
        The BufferReader class is a class that provides functions to retrieve input entered by the user,
     However, the difference between a BufferReader and a Scanner is that the Scanner uses the next() method, while the BufferReader
     using readLine(). To be able to access the BufferReader class, we first import the BufferReader class, like 'import java.io.BufferedReader'.
     
  3.Console class 
        Console class is a class that provides functions to take input entered by the user,
    Similar to BufferReader, Console also uses the readline() method to take user input.
    However, this class is only used in console environments, such as Terminal or CMD.
    To be able to access the Console class, we first import the Console class, such as 'import java.io.Console'.
    
- For more details, please open Main.java in repositories suardi26/Java-Basic/Get User Input (Scanner, BufferReader,Console)/src/com/practice/
     
- Have a nice day.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

------------------------------Get User Input (Scanner, BufferReader,Console)------------------------------

- Ada 3 class yang digunakan untuk mengambil input pada program berbasis teks (Console), seperti Class Scanner, Class BufferReader, Class Console.

  1. Class Scanner.
        Class Scanner adalah class yang menyediakan fungsi-fungsi untuk 
     mengambil input yang dimasukan oleh user.  untuk bisa mengakses class scanner, kita mengimpor class Scanner terlebih dahulu, seperti 'import java.util.Scanner'.

     Metode yang digunakan pada Class Scanner :
     
          nextBoolean() -> Membaca nilai boolean dari Input User.
          nextByte() -> Membaca nilai byte dari Input User.
          nextDouble() -> Membaca nilai double dari Input User.
          nextFloat() -> Membaca nilai float dari Input User.
          nextInt() Membaca nilai integer dari Input User.
          nextLine() -> Membaca nilai String dari Input User.
          nextLong() -> Membaca nilai long dari Input User.
          nextShort() -> Membaca nilai short dari Input User.
          
    2. Class BufferReader.
           Class BufferReader adalah class yang menyediakan fungsi-fungsi untuk mengambil input yang dimasukan oleh user,
       Namun Perbedaan BufferReader dengan Scanner adalah, Jika Scanner menggunakan method next(), sedangkan BufferReader menggunakan readLine.
       Untuk bisa mengakses class BufferReader, kita mengimpor class BufferReader terlebih dahulu, seperti 'import java.io.BufferedReader'.
       
    3. Class Console.
          Class Console adalah class yang menyediakan fungsi-fungsi untuk mengambil input yang dimasukan oleh user,
      Sama Dengan BufferReader, Console juga menggunakan method readline() untuk mengambil user input.
      Namun Class ini digunakan di lingkungan console saja, seperti Terminal atau CMD.
      Untuk bisa mengakses class Console, kita mengimpor class Console terlebih dahulu, seperti 'import java.io.Console'.
      
- Untuk lebih jelasnya, silahkan buka Main.java di repositori suardi26/Java-Basic/Get User Input (Scanner, BufferReader,Console)/src/com/practice/.

- Semoga harimu menyenangkan.
