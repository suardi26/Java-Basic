package com.practice;

public class Main {

    public static void main(String[] args){
        // Access modifier adalah sebuah "hak akses" yang diberikan kepada sebuah class/method/variabel dengan tujuan untuk menjaga
        // integritas dari data, ketika ingin diakses oleh object lain.

        // Access modifier : public, private, protected, default (no modifier).

        // modifier public    : method atau variabel dapat diakses pada class yang berbeda serta pada
        //                      package yang berbeda.
        // modifier private   : method atau variabel hanya dapat diakses pada class yang sama.
        // modifier protected : method atau variabel dapat diakses pada class yang berbeda dalam package yang sama
        //                      serta subclassnya.
        // modifier default   : method atau variabel dapat diakses pada class yang berbeda dalam package yang sama.

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
