package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int op,ops,tinggiG,alasG;
        Scanner enq = new Scanner(System.in);
        System.out.println("(###############-MAIN MENU-###############)");
        System.out.println("1. Prosedur (Tidak mengembalikan nilai).");
        System.out.println("2. Fungsi (Mengembalikan nilai).");
        System.out.print("Masukan Pilihan Anda (1 atau 2) : ");
        op = enq.nextInt();

        if (op == 1){

            System.out.println("\n(###############-NAMA BULAN-###############)");
            System.out.print("Masukan Angka 1 - 12 : ");
            ops = enq.nextInt();
            month(ops);

        }else if (op == 2){

            System.out.println("\n(###############-LUAS SEGITIGA-###############)");
            System.out.print("Masukan alas segitiga : ");
            tinggiG = enq.nextInt();
            System.out.print("Masukan tinggi segitiga : ");
            alasG = enq.nextInt();

            double doubleAlasG = Double.valueOf(alasG);
            double doubleTinggiG = Double.valueOf(tinggiG);
            double result = areaOfTriangle(doubleAlasG,doubleTinggiG);
            System.out.printf("Luas segitiga dengan alas "+alasG+" dan tinggi "+tinggiG+" adalah "+ result+".");

        }else{
            System.out.println("Maaf !, Pilihan "+op+" Tidak tersedia, silahkan masukan pilihan yang valid misalnya " +
                    "1 atau 2 !!");
        }

    }

    public static double areaOfTriangle(double alas, double tinggi){

        /*
            Fungsi adalah sebutan fungsi yang mengembalikan nilai. pengembalian nilai pada fungsi menggunakan keyword
            'return'.
        */

        double hasil;
        hasil = (alas * tinggi) / 2;
        return hasil;

    }

    public static void month(int number){

         /*
            Prosedur adalah fungsi yang tidak mengembalikan nilai. ciri-cirinya menggunakan keyword 'void'.
         */

        switch(number){
            case 1 :
                System.out.println("Bulan "+number+" adalah Bulan Januari.");
                break;
            case 2 :
                System.out.println("Bulan "+number+" adalah Bulan Februari.");
                break;
            case 3 :
                System.out.println("Bulan "+number+" adalah Bulan Maret.");
                break;
            case 4 :
                System.out.println("Bulan "+number+" adalah Bulan April.");
                break;
            case 5 :
                System.out.println("Bulan "+number+" adalah Bulan Mei.");
                break;
            case 6 :
                System.out.println("Bulan "+number+" adalah Bulan Juni.");
                break;
            case 7 :
                System.out.println("Bulan "+number+" adalah Bulan Juli.");
                break;
            case 8 :
                System.out.println("Bulan "+number+" adalah Bulan Agustus.");
                break;
            case 9 :
                System.out.println("Bulan "+number+" adalah Bulan September.");
                break;
            case 10 :
                System.out.println("Bulan "+number+" adalah Bulan Oktober.");
                break;
            case 11 :
                System.out.println("Bulan "+number+" adalah Bulan November.");
                break;
            case 12 :
                System.out.println("Bulan "+number+" adalah Bulan Desember.");
                break;
            default :
                System.out.println("Mohon Maaf, pilihan "+number+" salah !!!  Silahkan Masukan Nilai 1-12 !!!");
        }
    }
}
