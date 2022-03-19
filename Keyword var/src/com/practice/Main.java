package com.practice;

import java.util.ArrayList;

/*
    - Keyword var diperkenalkan pada java 10.
    - Keyword var digunakan untuk mendeteksi secara otomatis value dari nilai variabel sehingaa dapat menentukan tipe data
      variabel secara otomatis.

    - Berikut adalah contoh kondisi dimana var dapat digunakan dan kondisi dimana var tidak dapat digunakan.
*/
public class Main {

    // Keyword var tidak dapat digunakan dalam deklarasi variabel instance atau variabel global.

    // var valueOfInt = 10; //error.

    public static void main(String[] args) {

        // Keyword var tidak dapat digunakan tanpa inisialisasi eksplisit.
        // var value; // error

        // Keyword var juga tidak bisa bernilai null.
        // var value = null; // error

        // Kita dapat mendeklarasikan tipe data apa pun dengan keyword var.
        // Keyword var dapat digunakan dalam deklarasi variabel lokal.

        // int
        var valueInt = 50;
        System.out.println(valueInt);

        // double
        var valueDouble = 12.5;
        System.out.println(valueDouble);

        // char
        var valueChar = 'c';
        System.out.println(valueChar);

        // String
        var valueString = "Word";
        System.out.println(valueString);

        // boolean
        var valueBoolean = true;
        System.out.println(valueBoolean);


        // var tidak dapat digunakan sebagai Generic Type.
        // var<var> arrayList = new ArrayList<>(); // Error
        // arrayList.add(5);
        // arrayList.add(10);
        // arrayList.add(7);
        // System.out.println(arrayList);

        // var tidak dapat digunakan dengan Generic Type.
        // var<Integer> arrayList1 = new ArrayList<Integer>(); // Error
        // arrayList1.add(10);
        // arrayList1.add(10);
        // arrayList1.add(30);
        // System.out.println(arrayList1);


        // var juga tidak dapat digunakan dengan lambda Expression.

    }

//  var tidak dapat digunakan untuk parameter suatu method dan method dengan return value.
//  public var method1 (){ //error
//      return 25;
//  }

//  public void method2 (var word){ //error
//      System.out.println(word);
//  }
}
