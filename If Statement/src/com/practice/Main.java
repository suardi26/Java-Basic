package com.practice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String [] args ){

        Scanner enq = new Scanner(System.in);
        int number, mod, option;
        System.out.println("(###############-MAIN MENU-###############)");
        System.out.println("Silahkan Memasukan Perintah Anda (1,2,3) !");
        System.out.println("(1) If-else statement.");
        System.out.println("(2) if-else if statement.");
        System.out.println("(3) if-else nested.");
        System.out.print("Pilihan Anda : ");

        option = enq.nextInt();

        if(option == 1) {

            /*
            if-else statement / percabangan adalah teknik pemrograman yang digunakan untuk menentukan alur eksekusi
            program. misalnya : ketika kondisi bernilai benar maka yang akan dieksekusi "kode program A" namun ketika
            kondisi bernilai salah maka yang akan dieksekusi "kode program B".
             */


            System.out.println("(###############-Menentukan Bilangan Ganjil / Genap-###############)");
            System.out.print("Masukan Bilangan Bulat : ");
            number = enq.nextInt();
            System.out.println("Angka yang anda input : " + number);

            mod = number % 2;

            if (mod == 0) {

                System.out.println("Angka yang anda masukan adalah bilangan genap.\n");

            } else {

                System.out.println("Angka yang anda masukan adalah bilangan ganjil\n");

            }

        }else if(option == 2){
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

                System.out.println("Kode yang anda masukan salah !!!\nperintah yang valid adalah angka 1,2,3,4 dan 5.");

            }

        }else if(option == 3) {


            /*
            if else nested / if else bersarang adalah teknik pemrograman yang digunakan untuk menentukan alur eksekusi
            program, namun pada if else nested terdapat percabangan di dalam percabangan. Sehingga pada saat suatu kondisi terpenuhi
            masih ada percabangan lain yang menentukan suatu kondisi bernilai benar atau tidak.
             */

            System.out.println("(###############-Cek Angka-###############)");
            System.out.print("Silahkan Masukan Angka : ");
            number = enq.nextInt();
            System.out.println("\n(###############-Hasil-###############)\n");

            int result = number % 2;
            if (result == 0) {

                if (number <= 10) {

                    System.out.println("Angka yang Anda masukan adalah bilangan genap dan lebih kecil atau sama dengan 10.");

                } else {

                    System.out.println("Angka yang Anda masukan adalah bilangan genap dan lebih besar dari 10.");
                }

            } else {

                if (number <= 10) {

                    System.out.println("Angka yang anda masukan adalah bilangan ganjil dan lebih kecil atau sama dengan 10.");

                } else {

                    System.out.println("Angka yang Anda masukan adalah bilangan ganjil dan lebih besar dari 10.");
                }
            }
        }else{
            System.out.println("Masukan Perintah yang benar !!! (1,2,3)");
        }
        System.out.println("\n(###############-Terima Kasih-###############)");

    }
}
