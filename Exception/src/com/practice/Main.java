package com.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int[] numbers = {1,2,3};
        FileInputStream file = null;
        Scanner enq = new Scanner(System.in);
        System.out.print("Silahkan Masukan Index numbers : ");
        int number = enq.nextInt();


        /*
            Ketika Kode program (Java) telah dicompile dan dieksekusi, Kesalahan bisa saja terjadi pada saat program
            berjalan (runtime), misalnya kesalahan input data atau hal lain yang tidak terduga. Kesalahan tersebut membuat program
            berhenti dan menghasilkan pesan kesalahan istilah ini disebut throw an exception.

            Exception Handling adalah fasilitas di java yang digunakan untuk megatasi Error runtime dengan menangkap pesan kesalahan
            tersebut sehingga program tidak berhenti melainkan melanjutkan mengeksekusi baris code selanjutnya.

            Ada beberapa keywword pada java dalam hal Exception Handling.
            1 . Try
                try adalah keyword yang digunakan untuk mencoba menjalankan block program yang berpotensi menyebabkan error pada saat
                runtime keyword ini dipasangkan dengan keyword catch atau finally.
            2.  Catch
                Catch adalah keyword yang digunakan untuk menangkap kesalahan yang terjadi dari block try dan dapat ditampilkan
                pada block catch ini.
            3.  Finally
                Finally adalah keyword yang digunakan untuk menjalankan block program yang akan dieksekusi setelah block program
                yang ada di dalam try dan catch. Block program yang ada di finally akan dieksekusi ketika ada kesalahan maupun tidak ada
                kesalahan.
            4.  throw
                throw adalah keyword yang digunakan untuk melemparkan suatu pesan kesalahan yang dibuat secara manual.
                format : 'throw new Exception("Kesalahan Terjadi !!")'.
            5.  throws
                throws adalah keyword yang digunakan pada suatu method yang mungkin menghasilkan suatu kesalahan sehingga untuk
                memanggil method tersebut maka harus dilakukan handling exception (try-catch) terlebih dahulu.
        */

        // Exception Handling {try,catch,finally}
        // Handling Exception (ArrayIndexOutOfBoundsException).
        System.out.println("Handling Exception (ArrayIndexOutOfBoundsException).");
        try{
            System.out.printf("Nilai Array pada index ke %d adalah %d.\n",number ,numbers[number]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        // Handling Exception (FileNotFoundException).
        System.out.println("Handling Exception (FileNotFoundException).");
        try{
            file = new FileInputStream("google.txt");

        }catch (IOException e){
            System.out.println(e);
        }

        // Handling Exception (Penggabungan Exception).
        System.out.println("Handling Exception (Penggabungan Exception).");
        System.out.println("=============================");
        System.out.println("Penggabungan 2 Exception ");
        System.out.print("Masukan Index Array : ");
        int number2 = enq.nextInt();
        try{
            System.out.printf("Nilai Array pada index ke %d adalah %d.\n",number2 ,numbers[number2]);
            file = new FileInputStream("google.txt");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }

        // Handling Exception Penambahan keyword finally.
        System.out.println("=============================");
        System.out.println("Handling Exception (Penambahan keyword finally).");
        System.out.print("Masukan Index Array : ");
        int number3 = enq.nextInt();
        try{
            System.out.printf("Nilai Array pada index ke %d adalah %d.\n",number3 ,numbers[number3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally{
            System.out.println("Finish");
        }

        // Handling Exception (method).
        System.out.println("=============================");
        System.out.println("Handling Exception (method)");
        System.out.print("Masukan Index Array : ");
        int number4 = enq.nextInt();
        int rNumber4 = dataFromArray(numbers,number4);
        System.out.printf("Nilai Array pada index ke %d adalah %d.\n",number4 ,rNumber4);

        // Exception throws  (method).
        System.out.println("=============================");
        System.out.println("Exception throws  (method)");
        int rThrows = 0;
        try{
            rThrows = dataFromArrayThrows(numbers,number4);
        }catch (Exception e){
            System.err.println("Errornya adalah : "+e);
        }
        System.out.printf("Nilai Array pada index ke %d adalah %d.\n",number4 ,rThrows);

    }
    private static int dataFromArray(int[] dataArray, int number){

        int result = 0;
        try{

            result = dataArray[number];

        }catch(IndexOutOfBoundsException e){

            System.err.println("Errornya adalah : "+e);

        }
        return result;
    }

    private static int dataFromArrayThrows(int[] dataArray, int number) throws Exception{

        int result = dataArray[number];
        return result;

    }
}
