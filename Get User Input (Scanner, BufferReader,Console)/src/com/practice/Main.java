package com.practice;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            Ada 3 class yang digunakan untuk mengambil input pada program berbasis teks (Console), yaitu Class Scanner,
            Class BufferREader, Class Console.

         */

        // 1. Class Scanner.
        /*    Class Scanner adalah class yang menyediakan fungsi-fungsi untuk mengambil input yang dimasukan oleh user.
              untuk bisa mengakses class scanner, kita mengimpor class Scanner terlebih dahulu, seperti 'import java.util.Scanner',
              Untuk lebih jelasnya perhatikan baris ke 3. */

              Scanner input = new Scanner(System.in);// membuat Object untuk menerima inputan dengan variabel yang bertipe data Scanner.

              // Perhitungan Luas Persegi Panjang.

              int length,width,areaP; //Deklarasi Variabel.
              System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");

              System.out.print("Panjang : ");
              length = input.nextInt();

              System.out.print("Lebar : ");
              width = input.nextInt();

              areaP = length * width;
              System.out.println("Luas Persegi Panjang dengan panjang "+length+" dan lebar "+width+" = "+areaP+"\n");

        // 2. Class BufferReader.
        /*    Class BufferReader adalah class yang menyediakan fungsi-fungsi untuk mengambil input yang dimasukan oleh user,
              Namun Perbedaan BufferReader dengan Scanner adalah, Jika Scanner menggunakan method next(), sedangkan BufferReader
              menggunakan readLine.
              Untuk bisa mengakses class BufferReader, kita mengimpor class BufferReader terlebih dahulu, seperti 'import java.io.BufferedReader'*/

              InputStreamReader ir = new InputStreamReader(System.in);
              BufferedReader br = new BufferedReader(ir);

              // Perhitungan Luas Segitiga.

              int base,height; // Deklarasi Variabel.
              double areaT; // Deklarasi Variabel.
              System.out.println("MENGHITUNG LUAS SEGITIGA");

              System.out.print("Alas : ");
              base = Integer.parseInt(br.readLine());

              System.out.print("Tinggi : ");
              height = Integer.parseInt(br.readLine());

              areaT = (double) (base * height)/2;
              System.out.printf("Luas Segitiga dengan alas %d dan Tinggi %d = %.2f.\n\n",base,height,areaT);

        // 3. Class Console.
        /*    Class Console adalah class yang menyediakan fungsi-fungsi untuk mengambil input yang dimasukan oleh user,
              Sama Dengan BufferReader, Console juga menggunakan method readline() untuk mengambil user input.
              Namun Class ini digunakan di lingkungan console saja, seperti Terminal atau CMD.
              Untuk bisa mengakses class Console, kita mengimpor class Console terlebih dahulu, seperti 'import java.io.Console'*/

              /* Pseudo-codenya di Nonaktifkan karena hanya dapat digunakan pada Lingkungan Console (CMD,Terminal,dll.)

              Console co = System.console();

              int r;
              final double pi = 3.14;
              double areaC;

              System.out.println("MENGHITUNG LUAS LINGKARAN");
              System.out.print("Jari-jari Lingkaran : ");
              r = Integer.parseInt(co.readLine());

              areaC = (double) (r * r) * pi;
              System.out.printf("Luas Lingkaran dengan jari-jari %d adalah %.2f.\n",r,areaC);
              */
    }
}
