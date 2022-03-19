package com.practice;

import java.util.Arrays;

/*
    - Method Variabel Argument digunakan untuk mengirim data yang jumlahnya tidak pasti.
    - Ketika kita ingin mengirim sejumlah data yang jumlahnya tidak pasti dapat menggunakan Array sebagai parameter di method
      ataupun menggunakan variabel argument.
    - Data yang dikirim menggunakan Variabel Argument dapat berisi nol atau lebih argument.
    - Parameter dengan tipe variabel argument hanya boleh satu saja dalam satu method,
      contoh 'methodSearch( String name, int... numbers)'.
    - Parameter dengan tipe variabel argument, hanya bisa ditempatkan di posisi akhir parameter jika terdapat lebih dari satu
      parameter. contoh 'methodSearch( String name, int... numbers)', 'methodSum( int... numbers )'
    - Data - data yang dikirim melalui variabel argument di tampung pada Array.
*/
public class Main {
    public static void main(String[] args){

        int[] numbers = {1,2,3,4,5};
        sum("Easy",numbers);

        multiplication("Easy",1,2,3,4,5);

    }

    // contoh method dengan menggunakan parameter Array.
    public static void sum(String type, int[] numbers){
        int result = 0;
        for(var number : numbers){
            result += number;
        }
        System.out.println("= = = = = Sum = = = = =");
        System.out.println("Type : "+type+" , dan hasil penjumlahan adalah "+result);
        System.out.println();
    }

    // contoh method dengan menggunakan Variabel Argument.
    public static void multiplication(String type, int... numbers){
        int result = 1;
        for(var number : numbers){
            result *= number;
        }
        System.out.println("= = = = = Multiplication = = = = =");
        System.out.println("Type : "+type+" , dan hasil Perkalihan adalah "+result);
        System.out.println();
    }




}
