package com.practice;

public class Main {

    public static void main(String[] args){

        int[] arrayInt = {10,20,30,40,50,60,70,80,90,100};

        System.out.println("\n= = = = = Looping Array (For) = = = = =");

            /*
                Properti length dari array memberikan informasi mengenai jumlah total elemen yang ada dalam array.
            */

            for(int i = 0; i < arrayInt.length; i++){
                System.out.println("Nilai Array dengan Index Ke-"+i+" adalah "+arrayInt[i]);
            }
            System.out.println("Panjang Array pada variabel 'arrayInt' adalah "+arrayInt.length+", Dimulai dari index 0 " +
                    "sampai dengan index "+(arrayInt.length-1)+".");

        System.out.println("\n= = = = = Looping Array (For Each) = = = = =");

            /*
                For each adalah perulangan yang digunakan untuk mengambil data dari array satu per satu.
            */

            for (int number : arrayInt){
                System.out.println(number);
            }


    }
}
