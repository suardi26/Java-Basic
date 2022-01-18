package com.practice;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Mengkonversi data array menjadi String.
        int[] dataArray1 = {1,2,3,4,5,6,7,8,9,10};
        int[] dataArray2 = {0,0,0,0,0,0,0,0,0,0};
        System.out.println("\n===== Mengkonversi Data Array menjadi Nilai String =====");
        printDataArray("Data Array 1",dataArray1);
        printDataArray("Data Array 2",dataArray2);

        // Copy Data Array.
        System.out.println("\n= = = = = Copy Data Array = = = = =");

            // Menggunakan Perulangan 'for'.
            System.out.println("1. Menggunakan Perulangan For");
            for(int i = 0; i < dataArray1.length;i++ ){
                dataArray2[i] = dataArray1[i];
            }
            printDataArray("Data Array 1",dataArray1);
            System.out.println("Kode Array 1 => "+dataArray1);

            printDataArray("Data Array 2",dataArray2);
            System.out.println("Kode Array 2 => "+dataArray2);

            // Menggunakan Method 'copyOf'.
            System.out.println("\n2. Menggunakan Method 'copyOf' Dari class 'Arrays'. ");
            int[] dataArray3 = Arrays.copyOf(dataArray1,8);

            printDataArray("Data Array 1",dataArray1);
            System.out.println("Kode Array 1 => "+dataArray1);

            printDataArray("Data Array 3",dataArray3);
            System.out.println("Kode Array 3 => "+dataArray3);

            // Menggunakan Method 'copyOfRange'.
            System.out.println("\n3. Menggunakan Method 'copyOfRange' Dari class 'Arrays'. ");
            int[] dataArray4 = Arrays.copyOfRange(dataArray1,6,10);

            printDataArray("Data Array 1",dataArray1);
            System.out.println("Kode Array 1 => "+dataArray1);

            printDataArray("Data Array 4",dataArray4);
            System.out.println("Kode Array 4 => "+dataArray4);

        // fill Data Array.
        System.out.println("\n= = = = = Fill Data Array = = = = =");
        int[] dataArray5 = new int[10];
        printDataArray( "Data Array 5 ",dataArray5);
        Arrays.fill(dataArray5,2);
        printDataArray("Data Array 5 (Fill Angka 2)=> ",dataArray5);

        // Comparison Array.
        System.out.println("\n= = = = = Comparison Array = = = = =");
        int[] dataArray6 = {10,2,3,4,5,6,7,8,9,10};
        int[] dataArray7 = {1,2,3,4,5,6,7,8,9,10};

        printDataArray("Data Array 6",dataArray6);
        System.out.println("Kode Array 6 => "+dataArray6);

        printDataArray("Data Array 7",dataArray7);
        System.out.println("Kode Array 7 => "+dataArray7);
        System.out.println("\nMembandingkan Data array 6 dan Data Array 7, Apakah sama ?");
        System.out.println("Ket :\nKetika benar (bernilai true).");
        System.out.println("Ketika salah  (bernilai false).");
        System.out.println("Jawabannya : "+Arrays.equals(dataArray6,dataArray7));

        System.out.println("\nApakah Data array 6 lebih besar dari data array 7 ?");
        System.out.println("Ket :\nKetika true (bernilai 1).");
        System.out.println("Ketika 2 array sama (bernilai 0).");
        System.out.println("Ketika False (Bernilai -1).");
        System.out.println("Jawabannya : "+Arrays.compare(dataArray6,dataArray7));

        System.out.println("\nMencari index array yang berbeda dari data array 6 dan data array 7 ");
        System.out.println("Perbedaan pada index ke : "+Arrays.mismatch(dataArray6,dataArray7));

        // Sort Data Array
        System.out.println("\n= = = = = Sort Data Array = = = = =");
        int[] dataArray8 = {1,5,3,4,6,8,9,9,7,7,2};
        printDataArray("Data Array 8 => ",dataArray8);
        Arrays.sort(dataArray8);
        printDataArray("Data Array 8 (Sort) => ",dataArray8);


        // Search Index Data Array
        System.out.println("\n= = = = = Search Index Data Array = = = = =");
        int number = 9;
        int index = Arrays.binarySearch(dataArray8,number);
        System.out.printf("Angka %d terdapat pada index ke %d yang ada pada Data Array 8. \n",number,index);

        // Sorting reverse 2 data array.
        System.out.println("\nMelakukan sorting reverse pada 2 buah array");
        int[] dataArray9 = {3,2,1,4,7,6,5};
        int[] dataArray10 = new int[7];
        modifSorting(dataArray9,dataArray10);

        // Sorting reverse contoh lain.
        System.out.println("\nMelakukan sorting reverse pada 2 buah array (2)");
        int[] dataArray11 = {3,2,1,4,7,6,5};;
        modifSorting2nd(dataArray11);

        // Menjumlahkan 2 buah array
        System.out.println("\nMenjumlahkan 2 buah array ");
        int[] dataArray13 = {1,2,3,4,5,6,7};
        int[] dataArray14 = {1,2,3,4,5,6,7};
        int[] dataArray15 = new int[7];
        plus(dataArray13,dataArray14,dataArray15);

        // Menggabungkan 2 buah array
        System.out.println("\nMenggabungkan 2 buah array ");
        int[] dataArray16 = {1,2,3};
        int[] dataArray17 = {4,5,6};
        int[] dataArray18 = new int[6];
        meet(dataArray16,dataArray17,dataArray18);

    }
    private static void printDataArray(String nameArray,int[] numbers){

        System.out.println(nameArray+" => "+Arrays.toString(numbers));
    }

    private static void modifSorting(int[] data1, int[] data2){

        printDataArray("Data Array 9 ", data1);
        Arrays.sort(data1);
        printDataArray("Data Sort",data1);

        for (int i = 0; i < data1.length; i++){

             data2[i] = data1[(data1.length - 1) - i];

        }

        printDataArray("Data Sort Reverse", data2);
    }

    private static void modifSorting2nd(int[] data1){

        printDataArray("Data Array 11 ", data1);
        Arrays.sort(data1);
        printDataArray("Data Sort",data1);
        int place;
        for (int i = 0; i < data1.length/2; i++){

                place = data1[i];
                data1[i] = data1[(data1.length-1) - i];
                data1[(data1.length - 1) - i] = place;
        }

        printDataArray("Data Sort Reverse", data1);
    }

    private static void plus(int[] data1,int[] data2, int[] data3){
        int j = 0;
        for (int i = 0; i < data1.length; i++ ){
            int jumlah = data1[i] + data2[i];
            data3[j] = jumlah;
            j++;
        }
        printDataArray("Data Array 11 ", data1);
        printDataArray("Data Array 12 ", data2);
        printDataArray("Data Result ", data3);
    }

    private static void meet(int[] data1,int[] data2, int[] data3){
        int jumlah = data1.length + data2.length;


        for (int i = 0; i < data1.length; i++){

            data3[i] = data1[i];

        }
        int j = data1.length;
        for(int i = 0; i < data2.length;i++ ){

            data3[j] = data2[i];
            j++;
        }
        printDataArray("Data Array 14 ", data1);
        printDataArray("Data Array 15 ", data2);
        printDataArray("Data Array 16 ", data3);
    }
}
