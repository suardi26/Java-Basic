Notes !!! : this script is intended for those who are just starting to learn java. If you already understand basic Java, please skip it.

----------------------------------------For Looping----------------------------------------

- For Looping is a programming technique used to repeat the process until a condition is not met. However, in the 'For' loop, 

  there are 3 statements, namely: Initialization, a condition, Increment/decrement.
  
  Format :
  
        for (Initialization; condition; Increment/decrement) {
        
            // Code will be executed.
        }
        
  Example :
        
        int y = 5;
        
        for (int x = 1; y >= x ; x++) {
            
            System.out.println("number "+x);
        }    
        
- Nested For is the same as 'for loop' which is a programming technique used to loop through the process until a condition is not met. 

  However, in 'nested for' there is a loop in the loop.
        
  Format :

        for (Initialization; condition; Increment/decrement) {

            for((Initialization; condition; Increment/decrement){

            // Code will be executed.

            }
        }
        
  Example :
  
       int i,n;
       
       for (i = 0; i < 6; i++){
       
                for (n = 0; n < 6; n++){
                
                    System.out.print("* ");
                    
                }
                
                System.out.println();
                
        }
        
- For more details, please open Main.java in repositories suardi26/Java-Basic/For Looping/src/com/practice/

- Have a nice day. 

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

Note !!! : script ini diperuntukan bagi yang baru memulai belajar java. Jika Sudah Memahami Java dasar Silahkan Di skip.

----------------------------------------For Looping----------------------------------------

- For Looping adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan sampai suatu kondisi 

  tidak terpenuhi. Namun pada perulangan 'For' terdapat 3 statement yaitu : Pemberian nilai awal (inisialisasi), suatu kondisi, Increment/decrement.
  
  Format :
  
        for (inisialisasi; kondisi; Increment/decrement) {
        
            // Kode akan dieksekusi.
        }
        
  Contoh :
        
        int y = 5;
        
        for (int x = 1; y >= x ; x++) {
            
            System.out.println("number "+x);
        } 
        
- Nested For / For bersarang sama seperti 'for loop' yang merupakan teknik pemrograman yang digunakan untuk melakukan proses perulangan sampai 

  suatu kondisi tidak terpenuhi.namun pada 'nested for' terdapat perulangan dalam perulangan.
  
  Format :
  
        for (inisialisasi; kondisi; Increment/decrement) {
        
            for (inisialisasi; kondisi; Increment/decrement) {

             // Kode akan dieksekusi.

            }
        }
            
  Contoh : 
  
          int i,n;

               for (i = 0; i < 6; i++){

                        for (n = 0; n < 6; n++){

                            System.out.print("* ");

                        }

                        System.out.println();

                }
                
- Untuk lebih jelasnya, silahkan buka Main.java di repositori suardi26/Java-Basic/For Looping/src/com/practice/

- Semoga harimu menyenangkan.
        
