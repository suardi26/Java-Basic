package com.tutorial;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{

        // Byte Stream.
        // Byte Stream digunakan untuk melakukan operasi input atau output byte demi byte [8 bit].
        // FileInputStream adalah class yang digunakan untuk membaca data dari file.
        // FileOutputStream adalah class yang digunakan untuk menulis data pada file.
        System.out.println("= = = = = Byte Stream = = = = =");
            FileInputStream fileIn = new FileInputStream("DataIn.txt");
            FileOutputStream fileOut = null;

            int data = fileIn.read();
            while (data != -1){
                System.out.print((char) data);
                data = fileIn.read();
            }
            // menutup file.
            fileIn.close();

            //
            try{
                  // Membuka File.
                  fileIn = new FileInputStream("DataIn2.txt");
                  fileOut = new FileOutputStream("DataOut2.txt");

                  // Membaca File.
                  int number = fileIn.read();

                  while(number != -1 ){
                     fileOut.write(number);
                     number = fileIn.read();
                  }

            }finally{

                    // Menutup file.
                    if( fileIn != null){
                        fileIn.close();
                    }
                    if (fileOut != null){
                        fileOut.close();
                    }

            }
            System.out.println();
            // try with resources.
            // try with resources adalah statement try yang mendeklarasikan satu atau lebih resource di dalamnya.
            // resource adalah object yang harus ditutup setelah statement terakhir dieksekusi.
            try(
                    FileInputStream in = new FileInputStream("DataIn.txt");
                    FileOutputStream out = new FileOutputStream("DataOut.txt")
                    ){

                    int number = in.read();
                    while(number != -1){
                        out.write(number);
                        number = in.read();
                    }
            }

        // Character Stream.
        // Character Stream digunakan untuk melakukan operasi input atau output 2 byte [16 bit] unicode (internasional encoding standard).
        // dimana character stream dapat membaca character unik misalnya huruf Katakana, dll.
        // FileReader adalah class yang digunakan untuk membaca data dari file (2 byte).
        // FileWriter adalah class yang digunakan untuk menulis data pada file (2 byte).
        // Proses dari byte stream dan juga character stream dilakukan secara langsung tanpa menggunakan memory (Unbuffered) sehingga menjadi kurang
        // efisien.
            System.out.println("\n\n= = = = = Character Stream = = = = =");
            FileReader charInput = new FileReader("charInput.txt");
            FileWriter charOutput = new FileWriter("charOutput.txt");

            int numberC = charInput.read();

            while(numberC > 0){

                System.out.print((char)numberC);
                charOutput.write(numberC);
                numberC = charInput.read();
            }
            charInput.close();
            charOutput.close();

        // Buffered Byte Stream digunakan untuk melakukan operasi input atau output yang menampung data array dengan tipe data bytes
        // pada memory untuk dikelola pada apikasi.

        // BufferedInputStream adalah class yang digunakan untuk menyimpan data dari file ke memory melalui FileOutputStream.
        // BufferedOutputStream adalah class yang digunakan untuk menulis data dari memory ke memory dan dapat diteruskan ke
        // file yang dituju melalui FileOutputStream dangan menggunakan method 'flush'.
            long tStart,tStop;
            System.out.println("\n\n= = = = = Buffered Byte Stream = = = = =");
            FileInputStream fileInputStream = new FileInputStream("bufferedIn.txt");
            System.out.print("Menggunakan Byte Stream => ");
            System.out.print("Jumlah character adalah "+fileInputStream.available()+" Character.\n");// mengambil panjang character pada file.

            // Menghitung Durasi Membaca File Menggunakan Byte Stream.
            tStart = System.nanoTime();
            System.out.print(fileInputStream.readAllBytes());
            tStop = System.nanoTime();
            System.out.print("\nDurasi Membaca File Menggunakan Byte Stream di atas adalah "+(tStop - tStart)+".");
            fileInputStream.close();

            // Read Data dari memory (Buffered Byte Stream).
            FileInputStream fileInputStream2 = new FileInputStream("bufferedIn.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
            System.out.print("\n\nMenggunakan Buffered Byte Stream => ");
            System.out.print("Jumlah character adalah "+fileInputStream2.available()+" Character.\n");// mengambil panjang character pada file.

            bufferedInputStream.mark(50); // Memberi mark dengan parameter 'readlimit' untuk batas read data,
            // sehingga dapat dilakukan pemanggilan method 'reset'.

            // Menghitung Durasi Membaca File Menggunakan Buffered Byte Stream.
            tStart = System.nanoTime();
            System.out.print(bufferedInputStream.readAllBytes());
            tStop = System.nanoTime();
            System.out.print("\nDurasi Membaca File Menggunakan Buffered Byte Stream di atas adalah "+(tStop - tStart)+".\n");

            // Read Data Ke 2 dapat dilakukan pada Buffered Byte Stream.
            // Method 'reset()' untuk kembali membaca ulang data pada file.
            bufferedInputStream.reset();
            byte[] dataBytes = bufferedInputStream.readAllBytes();
            String dataString = new String (dataBytes);
            System.out.println("Data => "+dataString);
            bufferedInputStream.close();
            fileInputStream2.close();

            // Write Data dari memory (Buffered Byte Stream).
            FileOutputStream fileOutputStream = new FileOutputStream("bufferedOut.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            // Write Data (Byte).
            bufferedOutputStream.write(dataBytes,0, dataBytes.length);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            fileOutputStream.close();

        // Buffered Character Stream digunakan untuk melakukan operasi input atau output yang menampung data pada memory untuk dikelola pada apikasi.
        // BufferedReader adalah class yang digunakan untuk membaca data dari file ke memory melalui File Reader.

        // BufferedWriter adalah class yang digunakan untuk menulis data dari memory ke memory dan dapat diteruskan ke
        // file yang dituju melalui File Writer dangan menggunakan method 'flush'.

            System.out.println("\n= = = = = Buffered Character Stream = = = = =");
            FileReader fileReader = new FileReader("bufferReaderIn.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            bufferedReader.mark(50);

            // Read Data dari memory (Buffered Character Stream) dan disimpan pada data String.
            String data1 = bufferedReader.readLine();
            System.out.println("Output Data String => "+data1);

            // Read Data dari memory (Buffered Character Stream) dan disimpan pada data array char.
            bufferedReader.reset();
            char[] arrayData = new char[17];
            bufferedReader.read(arrayData,0,17);
            System.out.println("Output Data char[] => "+ Arrays.toString(arrayData));

            // Read Data dari memory (Buffered Character Stream) dan disimpan pada data String dan dibaca per baris
            // dengan method 'readLine()' pada class 'BufferedReader'.
            bufferedReader.reset();
            String data2 = bufferedReader.readLine();
            String data3 = bufferedReader.readLine();
            System.out.println("Output Data String Baris 1 => "+data2);
            System.out.println("Output Data String Baris 2 => "+data3);

            // Write Data dari memory (Buffered Character Stream).
            FileWriter fileWriter = new FileWriter("bufferReaderOut.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedReader.reset();
            String line1 = bufferedReader.readLine();
            bufferedWriter.write(line1,0,line1.length());
            bufferedWriter.flush();

            // Menambahkan Baris Baru (Enter).
            bufferedWriter.newLine();

            String line2 = bufferedReader.readLine();
            bufferedWriter.write(line2,0,line2.length());
            bufferedWriter.flush();

            bufferedReader.close();
            fileReader.close();
            bufferedWriter.close();
            fileWriter.close();

        // Scanner adalah class yang digunakan untuk membaca dan mengolah data dari file input.
            System.out.println("\n= = = = = Scanner = = = = =");
            FileReader fileReader1 = new FileReader("scanner.txt");
            BufferedReader bufferReader1 = new BufferedReader(fileReader1);
            Scanner scanner = new Scanner(bufferReader1);



            // Mebaca Kata. dengan pemisah (delimiter spasi).
            System.out.println("Ini adalah data dari file yang direed menggunakan method 'next()' pada class Scanner yang" +
                    " digunakan untuk membaca data dengan menggunakan tanda spasi sebagai limit/batas.");

            // Melakukan pengecekan apakah masih ada kata selanjutnya.
            System.out.println(scanner.hasNext()); // true

            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.next());
            System.out.println(scanner.hasNext()); // false

            // Menggunakan delimiter tertentu.
            System.out.println("\nIni adalah data dari file yang direed menggunakan method 'next()' pada class Scanner yang" +
                " digunakan untuk membaca data dengan menggunakan tanda tertentu sebagai limit/batas.");
            FileReader fileReader2 = new FileReader("scanner2.txt");
            bufferReader1 = new BufferedReader(fileReader2);
            bufferReader1.mark(50);

            Scanner scanner1 = new Scanner(bufferReader1);
            scanner1.useDelimiter(",");
            while(scanner1.hasNext()){
                System.out.println(scanner1.next());
            }

            // Read Data dari memory per baris (Scanner) dan disimpan pada data String.
            System.out.println("\nIni adalah data dari file yang direed menggunakan method 'nextLine()' pada class Scanner yang" +
                " digunakan untuk membaca data satu baris.");
            bufferReader1.reset();
            scanner1 = new Scanner(bufferReader1);
            System.out.println(scanner1.nextLine());

        // String Tokenizer adalah sebuah class yang digunakan mengelolah nilai String, dengan class ini kita dapat membagi
        // nilai string yang panjang, menjadi beberapa kata atau bagian berdasarkan delimeter yang ditentukan.
        // parameter default class StringTokenizer : tab ('\t'), new line ('\n'), carriage return('\r') dan dapat ditentukan sendiri.

            bufferReader1.reset();
            System.out.println("\nIni adalah data dari file yang direed menggunakan method 'readLine()' pada class BufferReader yang" +
                " digunakan untuk membaca data satu baris.");
            String value = bufferReader1.readLine();
            System.out.println(value);

            System.out.println("\nIni adalah data dari file yang direed menggunakan method 'nextToken()' pada class StringTokenizer yang" +
                " digunakan untuk membaca data dengan menggunakan tanda spasi sebagai limit/batas.");
            StringTokenizer values = new StringTokenizer(value,",");
            while(values.hasMoreTokens()){
                System.out.println(values.nextToken());
            }

            // Baris Kedua.
            System.out.println("\nIni adalah data dari file yang direed menggunakan method 'readLine()' pada class BufferReader yang" +
                " digunakan untuk membaca data satu baris.");
            value = bufferReader1.readLine();
            System.out.println(value);

            System.out.println("\nIni adalah data dari file yang direed menggunakan method 'nextToken()' pada class StringTokenizer yang" +
                " digunakan untuk membaca data dengan menggunakan tanda tertentu sebagai limit/batas.");
            values = new StringTokenizer(value,",");
            while(values.hasMoreTokens()){
                System.out.println(values.nextToken());
            }
            fileReader1.close();
            bufferedReader.close();
            scanner.close();


    }
}
