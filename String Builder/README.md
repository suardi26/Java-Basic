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

- <samp>For more details, please open Main.java in repositories suardi26/Java-Basic/String Builder/src/com/practice/</samp>

- <samp>Have a nice day.</samp>
