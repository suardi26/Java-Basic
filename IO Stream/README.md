## IO Stream
##### Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

- <samp>Byte Stream is used to perform input or output operations byte by byte [8 bit].</samp>

- <samp>FileInputStream is a class used to read data from a file.</samp>

- <samp>FileOutputStream is a class used to write data to a file.</samp>

- <samp>Character Stream is used to perform input or output operations of 2 bytes [16 bit] unicode (international encoding standard).</samp> 
 
  <samp>where the character stream can read unique characters such as Katakana letters, etc.</samp>
  
- <samp>FileReader is a class used to read data from a file (2 bytes).</samp>

- <samp>FileWriter is a class used to write data to a file (2 bytes).</samp>

- <samp>The processing of the byte stream and also the character stream is carried out directly without using memory (Unbuffered)</samp> 
 
  <samp>so that it becomes less efficient.</samp>

- <samp>Buffered Byte Stream is used to perform input or output operations that accommodate data arrays with data type bytes in memory</samp> 
 
  <samp>to be managed in the application.</samp>

- <samp>BufferedInputStream is a class that is used to store data from file to memory via FileOutputStream.</samp>

- <samp>BufferedOutputStream is a class that is used to write data from memory to memory and can be passed to the destination file</samp> 
 
  <samp>via FileOutputStream using the 'flush' method.</samp>

- <samp>Buffered Character Stream is used to perform input or output operations that hold data in memory to be managed in the application.</samp>

- <samp>BufferedReader is a class that is used to read data from file to memory via File Reader.</samp>

- BufferedWriter is a class that is used to write data from memory to memory and can be passed to the destination file via File Writer using the 'flush' method.

- Scanner is a class that is used to read and process data from input files or from input data.

- String Tokenizer is a class that is used to manage String values, with this class we can divide long string values, 
  
  into several words or parts based on the specified delimiter.

- StringTokenizer class default parameters: tab ('\t'), new line ('\n'), carriage return('\r') and can be defined by yourself.

- For more details, please open Main.java in repositories suardi26/Java-Basic/IO Stream/src/com/practice/

- Have a nice day.
