package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int op;
        int n = 1;
        int ol;
        Scanner enq = new Scanner(System.in);
        System.out.println("(###############-MAIN MENU-###############)");
        System.out.println("1. Break.");
        System.out.println("2. Continue.");
        System.out.println("3. Return.");
        System.out.print("Masukan Pilahan Anda (1,2 atau 3) : ");
        op = enq.nextInt();

        if (op == 1){

            System.out.print("Masukan Jumlah Perulangan Ke-n : ");
            ol = enq.nextInt();

            /*
                Statement break adalah perintah yang digunakan untuk mengatur alur perulangan program
                yang memaksa sebuah proses perulangan berhenti.
            */
            do {
                System.out.println("Print Number "+n);
                n++;
                if (n==5){
                    System.out.println("Print Number "+n);
                    break;
                    /*
                        Perintah Break diatas memaksa program untuk keluar dari perulangan ketika n = 5 meskipun
                        jumlah perulangan yang dimasukan lebih dari 5.
                    */
                }
            }while (n<=ol);
            System.out.println("Terima Kasih.");

        }else if (op == 2){

            System.out.print("Masukan Jumlah Perulangan Ke-n : ");
            ol = enq.nextInt();

            /*
                Sama seperti statement break, statement continue adalah perintah yang digunakan untuk mengatur alur
                perulangan program dimana statement continue adalah perintah yang melewati 1 kali proses iterasi
                dan melanjutkan ke iterasi berikutnya dalam perulangan.
             */
            n=0;
            do {
               n++;
                if (n==5){
                    continue;
                    /*
                        Perintah continue diatas melewati  iterasi perulangan  ketika n = 5 dan melanjutkan
                        ke iterasi selanjutnya.
                    */
                }
                System.out.println("Print Number "+n);

            }while (n<ol);
            System.out.println("Terima Kasih.");

        }else if(op == 3){

            System.out.print("Masukan jumlah perulangan Ke-n : ");
            ol = enq.nextInt();
                /*
                    Statement return adalah perintah yang digunakan untuk keluar dari method atau fungsi dalam sebuah program.
                 */
            n=0;
            do {
                n++;
                System.out.println("Print Number "+n);
                if (n==5){
                    return;
                    /*
                        Program akan melakukan perulangan sebanyak 5 kali dan setelah itu perintah return diatas akan
                        mengakhiri fungsi utama pada sebuah program, menutup perulangan ini bahkan perintah selanjutnya
                        yang mencetak 'Terima Kasih' tidak akan diproses dikarenakan fungsi return mengakhiri secara
                        keseluruhan perintah yang ada pada fungsi utama.
                    */
                }
            }while (n<ol);
            System.out.println("Terima Kasih.");

        }else{
            System.out.println("Mohon maaf !!, Pilihan "+op+" tidak valid, silahkan masukan pilihan yang valid seperti 1,2 atau " +
                    "3 !!, Terima Kasih.");
        }
    }
}
