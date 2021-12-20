package com.practice;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int op,n,i,k,l;
        Scanner enq = new Scanner(System.in);
        System.out.println("(###############-MAIN MENU-###############)");
        System.out.println("1. For Loop");
        System.out.println("2. For Nested");
        System.out.print("Masukan Pilihan Anda (1 atau 2) : ");
        op = enq.nextInt();

        if(op == 1){

            /*
            For Looping adalah teknik pemrograman yang digunakan untuk melakukan proses perulangan sampai suatu kondisi
            tidak terpenuhi. Namun pada perulangan 'For' terdapat 3 statement yaitu : Pemberian nilai awal (inisialisasi),
            suatu kondisi, Increment/decrement.
             */

            System.out.println("(###############- Cetak Buku Ke-n (For Loop) -###############)");
            System.out.print("Masukan Nilai Ke-n : ");
            n = enq.nextInt();
            System.out.println("(###############- HASIL -###############)");

            for (i = 1; i <= n; i++){
                System.out.println("Buku yang Ke "+i);
            }

            System.out.println("Jumlah Buku Yang Di input adalah "+n+", Thank You.");

        }else if(op == 2){

            /*
            Nested For / For bersarang sama seperti 'for loop' yang merupakan teknik pemrograman yang digunakan untuk melakukan
            proses perulangan sampai suatu kondisi tidak terpenuhi.namun pada 'nested for' terdapat perulangan dalam perulangan.
             */

            System.out.println("(###############- Membuat Sebuah Pola (Nested For) -###############)");
            System.out.println("\nPattern 1 (Square) : ");

            for (i = 0; i < 6; i++){
                for (n = 0; n < 6; n++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nPattern 2 (Rectangle) : ");

            for (i = 0; i < 3; i++){
                for (n = 0; n < 6; n++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nPattern 3 (Triangle) : ");

            for (i = 1; i <= 8; i++){
                for (n = 8; n > i; n--){
                    System.out.print(" ");

                }
                for( k = 1; k <= i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            System.out.println("\nPattern 4 (Rhombus 1) : ");

            for (i = 1; i <= 9; i++){
                for (n = 9; n > i; n--){

                    System.out.print(" ");
                }
                for ( k = 1; k <= i; k++){

                    System.out.print("*");
                }
                for (l = 1; l <= i-1;l++ ){

                    System.out.print("*");
                }
                System.out.println();
            }

            for (i = 1; i <= 8; i++ ){
                for (n = 1; n <= i; n++ ){
                    System.out.print(" ");
                }
                for (k = 1;k <= 8 -i + 1; k++){
                    System.out.print("*");
                }
                for (l = 1; l <= 8 - i ; l++){
                    System.out.print("*");
                }
                System.out.println();

            }

            System.out.println("\nPattern 5 (Rhombus 2) : ");

            for (i = 1; i <= 9; i++){
                for (n = 9; n > i; n--){

                    System.out.print(" ");
                }
                for ( k = 1; k <= i; k++){

                    System.out.print("* ");
                }
                System.out.println();
            }

            for (i = 1; i <= 8; i++ ){
                for (n = 1; n <= i; n++ ){
                    System.out.print(" ");
                }
                for (k = 1;k <= 8 -i + 1; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }


        }else{
            System.out.println("Mohon Maaf, pilihan "+op+" tidak tersedia, silahkan masukan Perintah 1 untuk for loop dan" +
                    " 2 untuk nested for ! thank you. ");
        }

    }
}
