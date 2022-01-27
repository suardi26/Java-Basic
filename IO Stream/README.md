Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

----------------------------------------IO Stream----------------------------------------

- Byte Stream is used to perform input or output operations byte by byte [8 bit].

- FileInputStream is a class used to read data from a file.

- FileOutputStream is a class used to write data to a file.

- Character Stream is used to perform input or output operations of 2 bytes [16 bit] unicode (international encoding standard). 
 
  where the character stream can read unique characters such as Katakana letters, etc.
  
- FileReader is a class used to read data from a file (2 bytes).

- FileWriter is a class used to write data to a file (2 bytes).

- The processing of the byte stream and also the character stream is carried out directly without using memory (Unbuffered) so that it becomes less efficient.

- Buffered Byte Stream is used to perform input or output operations that accommodate data arrays with data type bytes in memory to be managed in the application.

- BufferedInputStream is a class that is used to store data from file to memory via FileOutputStream.

- BufferedOutputStream is a class that is used to write data from memory to memory and can be passed to the destination file via FileOutputStream using the 'flush' method.

- Buffered Character Stream is used to perform input or output operations that hold data in memory to be managed in the application.

- BufferedReader is a class that is used to read data from file to memory via File Reader.

- BufferedWriter is a class that is used to write data from memory to memory and can be passed to the destination file via File Writer using the 'flush' method.

- Scanner is a class that is used to read and process data from input files or from input data.

- String Tokenizer is a class that is used to manage String values, with this class we can divide long string values, into several words or parts based on the specified delimiter.

- StringTokenizer class default parameters: tab ('\t'), new line ('\n'), carriage return('\r') and can be defined by yourself.

- For more details, please open Main.java in repositories suardi26/Java-Basic/IO Stream/src/com/practice/

- Have a nice day.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

----------------------------------------IO Stream----------------------------------------

- Byte Stream digunakan untuk melakukan operasi input atau output byte demi byte [8 bit].

- FileInputStream adalah class yang digunakan untuk membaca data dari file.

- FileOutputStream adalah class yang digunakan untuk menulis data pada file.

- Character Stream digunakan untuk melakukan operasi input atau output 2 byte [16 bit] unicode (internasional encoding standard). dimana 
 
  character stream dapat membaca character unik misalnya huruf Katakana, dll.

- FileReader adalah class yang digunakan untuk membaca data dari file (2 byte).

- FileWriter adalah class yang digunakan untuk menulis data pada file (2 byte).

- Proses dari byte stream dan juga character stream dilakukan secara langsung tanpa menggunakan memory (Unbuffered) sehingga menjadi kurang efisien.

- Buffered Byte Stream digunakan untuk melakukan operasi input atau output yang menampung data array dengan tipe data bytes pada memory untuk dikelola pada apikasi.

- BufferedInputStream adalah class yang digunakan untuk menyimpan data dari file ke memory melalui FileOutputStream.

- BufferedOutputStream adalah class yang digunakan untuk menulis data dari memory ke memory dan dapat diteruskan ke 
 
  file yang dituju melalui FileOutputStream dangan menggunakan method 'flush'.
  
- Buffered Character Stream digunakan untuk melakukan operasi input atau output yang menampung data pada memory untuk dikelola pada apikasi.

- BufferedReader adalah class yang digunakan untuk membaca data dari file ke memory melalui File Reader.

- BufferedWriter adalah class yang digunakan untuk menulis data dari memory ke memory dan dapat diteruskan ke file yang dituju 
  
  melalui File Writer dangan menggunakan method 'flush'.
  
- Scanner adalah class yang digunakan untuk membaca dan mengolah data dari file input atau pun dari data input.

- String Tokenizer adalah sebuah class yang digunakan mengelolah nilai String, dengan class ini kita dapat membagi nilai string yang panjang, 
  
  menjadi beberapa kata atau bagian berdasarkan delimeter yang ditentukan.

- parameter default class StringTokenizer : tab ('\t'), new line ('\n'), carriage return('\r') dan dapat ditentukan sendiri.

- Untuk lebih jelasnya, silahkan buka Main.java di repositori suardi26/Java-Basic/IO Stream/src/com/practice/.

- Semoga harimu menyenangkan.
