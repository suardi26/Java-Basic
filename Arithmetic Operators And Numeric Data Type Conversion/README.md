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
- <samp>And for the conversion/casting of numeric data types in java, must be considered is when converting from data types that have a large </samp>
    
  <samp>interval capacity to data types that have a small interval capacity.</samp>

- <samp>For example : </samp>
  <samp>
  ```java
    int i = 257;
               
    bytes bt = (bytes) i;
  
  ```  
  </samp>
- <samp>Note: The variable 'bt' with byte data type will not be the same as the value of variable 'i' of type Integer, because the capacity </samp>

  <samp>of the byte data type is 8 bits, with intervals ranging from -128 to 127 while the value of the variable 'i' is integer data type is 257.</samp>

- <samp>For more details, please open Main.java in repositories suardi26/Java-Basic/Arithmetic Operators And Numeric Data Type Conversion/src/com/practice/<samp>

- <samp>Have a nice day.</samp>
