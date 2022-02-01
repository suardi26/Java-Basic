package com.practice;

public class Main {

    public static void main(String[] args){

        // method dapat diakses karena meodifier (public), dapat diakses pada class yang berbeda bahkan pada package yang berbeda
        // dengan melakukan import class.
        google.search();

        // method tidak dapat diakses karena modifier (private), sehingga hanya dapat diakses oleh class yang sama.
        // google.apps();

        // method dapat diakses karena modifier (default), artinya meskipun method terdapat pada class yang berbeda
        // namun jika masih dalam package yang sama maka method tersebut dapat dipanggil.
        google.gmail();

        // method dapat diakses karena moodifier (protected), dapat diakses pada class yang berbeda dalam package yang sama.
        google.zoom();

        // method tidak dapat diakses karena modifier (default), artinya method tersebut berada pada package lain.
        // location.gmail();

        // method tidak dapat diakses karena moodifier (protected), artinya method tersebut berada pada package lain.
        // location.zoom();
    }
}
