package com.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String [] args ){

        /*
        if-else statement / percabangan adalah teknik pemrograman yang digunakan untuk menentukan alur eksekusi
        program. misalnya : ketika kondisi bernilai benar maka yang akan dieksekusi "kode program A" namun ketika
        kondisi bernilai salah maka yang akan dieksekusi "kode program B".
         */

        Scanner enq = new Scanner(System.in);
        int number, mod;

        System.out.println("(###############-Menentukan Bilangan Ganjil / Genap-###############)");
        System.out.print("Masukan Bilangan Bulat : ");
        number = enq.nextInt();
        System.out.println("Angka yang anda input : "+number);

        mod = number % 2;

        if(mod == 0){

            System.out.println("Angka yang anda masukan adalah bilangan genap.\n");

        }else{

            System.out.println("Angka yang anda masukan adalah bilangan ganjil\n");

        }

        /*
        if-else if statement / percabangan sama saja dengan if-else statement yang merupakan teknik pemrograman yang
        digunakan untuk menentukan alur eksekusi program namun bedanya kondisi pada if-else if  bisa lebih dari satu.
         */

        System.out.println("(###############-AI Assistant-###############)");
        System.out.println("Silahkan Memasukan Perintah Anda (1,2,3,4,5) !");
        System.out.println("(1) Saya haus.");
        System.out.println("(2) Saya lapar.");
        System.out.println("(3) Hidupkan lampu kamar.");
        System.out.println("(4) Atur suhu kamar.");
        System.out.println("(5) Tampilkan agenda hari ini.\n");
        System.out.print("Pilihan Anda : ");
        number = enq.nextInt();

        System.out.println("------------------------------------\n");
        if(number == 1){

            System.out.println("Di dalam Kulkas terdapat air mineral serta beberapa Soft Drink.");

        }else if(number == 2){

            System.out.println("Di meja terdapat beberapa masakan seperti ikan bakar dan sayur kangkung.\n" +
                    "namun jika anda tidak menyukai ikan terdapat beberapa potong ayam dan udang di dalam kulkas.");

        }else if(number == 3){

            System.out.println("Lampu kamar anda telah dinyalakan.");

        }else if(number == 4){

            System.out.println("Suhu ruangan anda adalah 23 derajat celcius.\n" +
                    "ketika suhu diatas 25 derajat celcius maka AC (Air Conditioning) akan dinyalakan secara otomatis.");

        }else if(number == 5){

            System.out.println("Agenda Anda pada hari Ini adalah : ");
            System.out.println("(Kantor) Desain layout.");
            System.out.println("(Kantor) Implementsai Geofence pada perangkat mobile.");
            System.out.println("(Olahraga).");
            System.out.println("(Rumah) lanjut project.");
            System.out.println("(Rumah) update project java Basic di Github.");

        }else{
            System.out.println("Kode yang anda masukan salah !!!\nperintah yang valid adalah angka 1,2,3,4 dan 5.\n");
            System.out.println("(###############-Terima Kasih-###############)");
        }

    }
}
