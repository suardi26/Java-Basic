Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

----------------------------------------Exception----------------------------------------

- When the program code (Java) has been compiled and executed, errors can occur at runtime, such as data input errors or other unexpected things.
   
  the error causes the program to stop and produces an error message this term is called throw an exception.
  
- Exception Handling is a facility in Java that is used to overcome runtime errors by catch the error message so that the program does not stop but 
  
  continues executing the next line of code.
  
- There are several keywords in java in terms of Exception Handling : 

      - Try.
           
        Try is a keyword that is used to try to run a program block that has the potential to cause an error at runtime. This keyword is paired with the catch or finally keyword.
        
      - Catch.
        
        Catch is the keyword used to catch errors that occur from the try block and can be displayed in this catch block.
        
      - Finally.
       
        Finally is the keyword used to run the program block that will be executed after the program block in the try and catch. 
        
        The program block in finally will be executed when there is an error or no error.
        
      - Throw
       
        throw is the keyword used to throw a manually generated error message.
        
        format : 'throw new Exception("Error Occurred!!")'.
        
      - Throws
       
        throws is a keyword used in a method that might generate an error, so to call the method, an exception handling (try-catch) must be done first.
        
- For more details, please open Main.java in repositories suardi26/Java-Basic/Exception/src/com/practice/

- Have a nice day.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

----------------------------------------Exception----------------------------------------

- Ketika Kode program (Java) telah dicompile dan dieksekusi, kesalahan  bisa terjadi pada saat program berjalan (runtime), misalnya kesalahan input data 

  atau hal lain yang tidak terduga. kesalahan tersebut membuat program berhenti dan menghasilkan pesan kesalahan istilah ini disebut throw a exception.
  
- Exception Handling adalah fasilitas di java yang digunakan untuk megatasi Error runtime dengan menangkap pesan kesalahan tersebut sehingga program tidak berhenti 
 
  melainkan melanjutkan mengeksekusi baris code selanjutnya.
  
- Ada beberapa keywword pada java dalam hal Exception Handling :

     - Try
      
       try adalah keyword yang digunakan untuk mencoba menjalankan block program yang berpotensi menyebabkan error pada saat runtime 
        
       keyword ini dipasangkan dengan keyword catch atau finally.

     - Catch
        
       Catch adalah keyword yang digunakan untuk menangkap kesalahan yang terjadi dari block try dan dapat ditampilkan pada block catch ini.
       
     - Finally

       Finally adalah keyword yang digunakan untuk menjalankan block program yang akan dieksekusi setelah block program yang ada di dalam try dan catch. 
       
       Block program yang ada di finally akan dieksekusi ketika ada kesalahan maupun tidak ada kesalahan.
       
     - throw
      
       throw adalah keyword yang digunakan untuk melemparkan suatu pesan kesalahan yang dibuat secara manual. 
        
       format : 'throw new Exception("Kesalahan Terjadi !!")'.

     - throws
      
       throws adalah keyword yang digunakan pada suatu method yang mungkin menghasilkan suatu kesalahan sehingga untuk memanggil method tersebut 
       
       maka harus dilakukan handling exception (try-catch) terlebih dahulu.
       
- Untuk lebih jelasnya, silahkan buka Main.java di repositori suardi26/Java-Basic/Exception/src/com/practice/.

- Semoga harimu menyenangkan.
