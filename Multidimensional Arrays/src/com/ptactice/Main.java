package com.ptactice;

import java.util.Arrays;

public class Main {

    public static void main (String[] args){

        //
        System.out.println("= = = = = Array Multidimensi = = = = =");

        // Assignment variabel array multidimensi
        // tipeData[][] namaVariabel = {{dataArray1},{dataArray2},...{}}
        int[][] dataArray2D = {
                {1,3,5,7},
                {2,4,6,8}
        };
        printDataArray2D("Cara 1 : Mencetak data array dengan fungsi 'deepToString' => ",dataArray2D);

        // Deklarasi variabel array multidimensi
        // tipeData[][] namaVariabel = new tipeData[baris][kolom];
        int[][] dataArray2D2 = new int[3][6];
        printDataArray2D_2("Cara 2 : Mencetak data array dengan perulangan => ",dataArray2D2);
        System.out.println("\nBanyak data pada array multidimensi [3] [6] adalah "+dataArray2D2.length+", atau Bisa saja" +
                " disebut panjang data pada array 2D sama dengan jumlah baris.\n");

        // Assignment variabel dengan looping bersarang.
        int[][] dataArray2D3 ={
                {1,1,1,1,1},
                {2,2,2,2,2},
                {3,3,3,3,3},
                {4,4,4,4,4},
                {5,5,5,5,5}
        };
        printDataArray2D_3("Cara 3 : Mencetak data array dengan perulangan bersarang => ",dataArray2D3);

        // Assignment variabel dengan looping for each.
        int[][] dataArray2D4 ={
                {2},
                {4,4},
                {5,5,5},
                {8,8},
                {0}
        };
        printDataArray2D_4("Cara 4 : Mencetak data array dengan perulangan 'for each' => ",dataArray2D4);

        // Menggabungkan beberapa array dalam array multidimensi.
        System.out.println("\n= = = = = Menggabungkan beberapa array dalam array multidimensi = = = = = ");
        int[] dataArray1 ={7,7,7,7,7};
        System.out.println("\nArray Data 1 => "+Arrays.toString(dataArray1));
        System.out.println("Code => "+Integer.toHexString(System.identityHashCode(dataArray1)));

        int[] dataArray2 = {8,8,8,8,8};
        System.out.println("\nArray Data 2 => "+Arrays.toString(dataArray2));
        System.out.println("Code => "+Integer.toHexString(System.identityHashCode(dataArray2)));

        int[] dataArray3 = {9,9,9,9,9};
        System.out.println("\nArray Data 3 => "+Arrays.toString(dataArray3));
        System.out.println("Code => "+Integer.toHexString(System.identityHashCode(dataArray3)));
        int[][] dataArray2D5 ={
                dataArray1,
                dataArray2,
                dataArray3,
        };
        System.out.println();
        printDataArray2D_3("Data Array 2D merupakan gabungan data array 1,2 dan 3 => ",dataArray2D5);
        System.out.println("Code => "+Arrays.toString(dataArray2D5));
    }
    private static void printDataArray2D(String messege, int[][] dataArray2D){
        System.out.println(messege);
        System.out.println(Arrays.deepToString(dataArray2D));
    }

    private static void printDataArray2D_2(String messege, int [][] dataArray2D){
        System.out.println("\n"+messege);
        for (int i = 0; i < dataArray2D.length; i++){

            System.out.println(Arrays.toString(dataArray2D[i]));
        }
    }
    private static void printDataArray2D_3(String messege, int[][] dataArray2D){
        System.out.println(messege);
        for (int i = 0; i < dataArray2D.length; i++ ){
            System.out.print("[");
            for (int t = 0; t < dataArray2D[i].length; t++){
                if (t == dataArray2D[i].length - 1){
                    System.out.print(dataArray2D[i][t]);
                }else{
                    System.out.print(dataArray2D[i][t]+",");
                }
            }
            System.out.println("]");
        }
    }
    private static void printDataArray2D_4(String messege, int[][] dataArray2D){
        System.out.println("\n"+messege);
        for (int[] numbers : dataArray2D){
            System.out.print("[");
            for (int number : numbers){

                System.out.print(number+" ");

            }
            System.out.print("]\n");
        }
    }
}
