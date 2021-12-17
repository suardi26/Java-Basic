package com.practice;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int op,n,start;
        Scanner enq;
        enq = new Scanner(System.in);

        System.out.println("(###############-MAIN MENU-###############)");
        System.out.println("1. While Loop");
        System.out.println("2. Do-While Loop");
        System.out.print("Masukan Pilihan Anda (1 atau 2 ) : ");
        op = enq.nextInt();

        if (op == 1){

            /*
             While Loop adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan sampai suatu kondisi
             tidak terpenuhi, sehingga kode program dapat dieksekusi berulang kali sesuai dengan kondisi yang ditentukan.
             */
            System.out.println("(###############- Cetak Angka Ke-n (While Loop) -###############)");
            System.out.print("Masukan Nilai Ke-n : ");
            n = enq.nextInt();
            System.out.println("(###############- HASIL -###############)");

             start = 1;

             while (start <= n ){

                 System.out.println("Angka Ke "+start);
                 start++;
             }

        }else if( op == 2){

            /*
            Sama seperti While, do-while adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan, namun
            pada do-while mengeksekusi pernyataan terlebih dahulu kemudian memeriksa suatu kondisi yang telah ditetapkan. sedangkan
            pada while memeriksa suatu kondisi terlebih dahulu setelah itu pernyataan akan dieksekusi bila kondisi terpenuhi / bernilai benar.
             */
            System.out.println("(###############- Cetak Mobil Ke-n (Do-While) -###############)");
            System.out.print("Masukan Nilai Ke-n : ");
            n = enq.nextInt();
            System.out.println("(###############- HASIL -###############)");

                start = 0;

                do {
                    start ++;
                    System.out.println("Mobil yang Ke "+start);

                } while (start < n);

                System.out.println("Jumlah Mobil Yang Di Input adalah "+n+", Thank You.");

        }else{
            System.out.println("Mohon Maaf, pilihan "+op+" tidak tesedia, silahkan masukan Perintah 1 untuk while dan " +
                    "2 untuk do-while ! thank you.  ");
        }

    }
}
