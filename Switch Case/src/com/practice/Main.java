package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /*
        Switch Case sama seperti if-else if yang merupakan teknik pemrograman yang digunakan untuk menentukan
        alur eksekusi program. namun untuk kondisi pada if-else if lebih fleksibel karena untuk if-else if dapat mengenali
        operator perbandingan seperti '<','<=','>','>='. Sedangkan pada switch case tidak mengenali operator perbandingan.
         */

        int number;
        String name;
        Scanner enq = new Scanner (System.in);
        System.out.println("(###############-Cek Nilai-###############)");
        System.out.print("Masukan Nama Anda : ");
        name = enq.next();
        System.out.print("Masukan Nilai Anda (1-10): ");
        number = enq.nextInt();
        System.out.println("\n(###############-Hasil-###############)\n");

        switch(number){
            case 10:
            case 9:
                System.out.println("Nama Anda Adalah "+name);
                System.out.println("Nilai Anda Adalah "+number);
                System.out.println("Anda Lulus !!! Dengan predikat 'A'");
                System.out.println("Ket Nilai : Sangat Baik");
                break;
            case 8:
                System.out.println("Nama Anda Adalah "+name);
                System.out.println("Nilai Anda Adalah "+number);
                System.out.println("Anda Lulus !!! Dengan predikat 'B'");
                System.out.println("Ket Nilai : Baik");
                break;
            case 7:
                System.out.println("Nama Anda Adalah "+name);
                System.out.println("Nilai Anda Adalah "+number);
                System.out.println("Anda Lulus !!! Dengan predikat 'C'");
                System.out.println("Ket Nilai : Cukup");
                break;
            case 6:
                System.out.println("Nama Anda Adalah "+name);
                System.out.println("Nilai Anda Adalah "+number);
                System.out.println("Anda Lulus !!! Dengan predikat 'D'");
                System.out.println("Ket Nilai : Kurang");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1: // ketika menggunakan if-else if akan lebih sederhana contoohnya : if (number <= 5)
                System.out.println("Nama Anda Adalah "+name);
                System.out.println("Nilai Anda Adalah "+number);
                System.out.println("Anda Tidak Lulus !!! Dengan predikat 'E'");
                System.out.println("Ket Nilai : Error");
                break;
            default:
                System.out.println("Mohon Maaf " +name+ ", perintah yang anda masukan salah !!!  Silahkan Masukan Nilai 1-10 !!!");
        }

    }
}
