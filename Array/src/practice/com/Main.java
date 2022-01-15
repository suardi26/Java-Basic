package practice.com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        /*
            Array adalah sebuah variabel yang dapat menyimpan beberapa data dengan satu tipe data dalam sebuah variabel.
            Array menggunakan indeks untuk memudahkan akses terhadap data yang disimpanya. Indeks array selalu
            dimulai dari 0.

            int[] arrayInt = {2,4,6,8};
                              | | | |
                      index = 0 1 2 3
         */

        // Assignment
        // tipeData[] namaVariabel = {Komponen-Komponen}

        System.out.println("= = = = = Assignment Variabel (Array) = = = = =");
        int[] arrayInt = {2,4,6,8};

        System.out.println("Index 0 = "+arrayInt[0]);
        System.out.println("Index 2 = "+arrayInt[1]);
        System.out.println("Index 1 = "+arrayInt[2]);
        System.out.println("Index 3 = "+arrayInt[3]);

        // Deklarasi
        // tipeData[] namaVariabel = new double[jumlahArray];
        System.out.println("= = = = = Deklarasi Variabel (Array) = = = = =");
        double[] arrayDouble = new double[5];
        arrayDouble[0] = 2.5;
        arrayDouble[1] = 4.5;
        arrayDouble[2] = 6.5;
        arrayDouble[3] = 8.5;
        arrayDouble[4] = 9.5;

        System.out.println("Index 0 = "+arrayDouble[0]);
        System.out.println("Index 1 = "+arrayDouble[1]);
        System.out.println("Index 2 = "+arrayDouble[2]);
        System.out.println("Index 3 = "+arrayDouble[3]);
        System.out.println("Index 4 = "+arrayDouble[4]);

        System.out.println(Arrays.toString(arrayDouble));


    }

}
