package com.practice;

public class google {

    // method ini tidak hanya dapat diakses pada classnya namun dapat juga diakses pada class lain
    // serta dapat juga diakses pada class yang terdapat pada package lain.
    public static void search(){
        System.out.println("Class google, Method public.");
    }

    // method ini hanya dapat diakses pada class yang sama.
    private static void apps(){
        System.out.println("Class google, Method private.");
    }

    // method ini hanya dapat diakses pada class yang berada dalam package yang sama.
    static void gmail(){
        System.out.println("Class google, method gmail.");
    }

    // method ini hanya dapat diakses pada class yang bereda dalam paackage yang sama dan subclassnya.
    protected static void zoom(){
        System.out.println("Class google, method zoom.");
    }
}
