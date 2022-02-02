package com.practice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //
        System.out.println("= = = = = Array List = = = = =");
        int[] arrayInt = {2,4,6,8};

        // Nilai-nilai pada array list dapat memiliki tipe data yang berbeda.
        ArrayList list = new ArrayList();

        String a = "Saya makan ikan ";
        int b = 2;
        String c = " ekor";

        // method 'add' menambahkan nilai kedalam array list
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(" Selesai.");
        System.out.println();
        System.out.println("Nilai dari ArrayList => "+list+"\n");
        System.out.print("Pemanggilan Array List Menggunakan Perulangan => ");


        for (int i = 0; i < list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println("\nMenampilkan apakah tidak ada nilai dalam Array List menggunakan method 'isEmpty' = "+list.isEmpty());
        System.out.println("Menampilkan apakah ada nilai dalam Array List dengan index 2 menggunakan method 'contains' = "+list.contains(2));
        System.out.println("Menampilkan jumlah ukuran dari ArrayList Menggunakan method 'size' = "+list.size());
        System.out.println("Menampilkan Index dari nilai '"+list.get(2)+"' Menggunakan method 'indexOf' = "+list.indexOf(" ekor"));
        System.out.println("Mengambil nilai pada index[2] menggunakan method 'get' = "+list.get(3));

        list.remove(3);
        System.out.println("\nNilai dari ArrayList Setelah index[3] dihapus menggunakan method 'remove' => "+list);
        System.out.print("Pemanggilan Array List Menggunakan Perulangan Setelah index[3] dihapus menggunakan method 'remove' => ");

        for (int i = 0; i < list.size();i++){
            System.out.print(list.get(i));
        }

        list.set(0,"Saya Makan Kepiting ");
        System.out.println("\n\nNilai dari ArrayList Setelah mengganti nilai dari index[0] menjadi 'Saya Makan Kepiting ' menggunakan method 'set' => "+list);
        System.out.print("Pemanggilan Array List Menggunakan Perulangan Setelah mengganti nilai dari index[0] menjadi 'Saya Makan Kepiting ' menggunakan method 'set' => ");
        for (int i = 0; i < list.size();i++){
            System.out.print(list.get(i));
        }

        // Nilai-nilai pada array list 1 tipe data.
        ArrayList <Integer> list2 = new ArrayList <Integer>();
        for (int p = 1; p <= 10; p++){
            list2.add(p * 100) ;
        }
        System.out.println("\n\n===========================================================");
        System.out.println("Panjang Nilai Array list 2 adalah "+list2.size());
        for (int t = 0; t < list2.size(); t++){
            System.out.println("Array List ke "+t+" adalah "+list2.get(t));
        }
    }
}
