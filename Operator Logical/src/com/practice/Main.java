package com.practice;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        // Operator Logika adalah operator yang dipakai pada 2 kondisi atau lebih sehingga menghasilkan nilai boolean true atau false.
        // Ada beberapa jenis operator logika pada Java yaitu OR (||), AND (&&), NOT (!), XOR (^).

        boolean x,y,z; // Deklarasi Variabel.

        System.out.println("(###############-Operator Logika OR (||)-###############)");
        x = false;
        y = false;
        z = (x || y);
        System.out.println("OR (||) => "+x+" || "+y+" = "+z+".");
        x = false;
        y = true;
        z = (x || y);
        System.out.println("OR (||) => "+x+" || "+y+" = "+z+".");
        x = true;
        y = false;
        z = (x || y);
        System.out.println("OR (||) => "+x+" || "+y+" = "+z+".");
        x = true;
        y = true;
        z = (x || y);
        System.out.println("OR (||) => "+x+" || "+y+" = "+z+".\n");

        System.out.println("(###############-Operator Logika AND (&&)-###############)");
        x = false;
        y = false;
        z = (x && y);
        System.out.println("AND (&&) => "+x+" && "+y+" = "+z+".");
        x = false;
        y = true;
        z = (x && y);
        System.out.println("AND (&&) => "+x+" && "+y+" = "+z+".");
        x = true;
        y = false;
        z = (x && y);
        System.out.println("AND (&&) => "+x+" && "+y+" = "+z+".");
        x = true;
        y = true;
        z = (x && y);
        System.out.println("AND (&&) => "+x+" && "+y+" = "+z+".\n");

        System.out.println("(###############-Operator Logika XOR (^)-###############)");
        x = false;
        y = false;
        z = (x ^ y);
        System.out.println("XOR (^) => "+x+" ^ "+y+" = "+z+".");
        x = false;
        y = true;
        z = (x ^ y);
        System.out.println("XOR (^) => "+x+" ^ "+y+" = "+z+".");
        x = true;
        y = false;
        z = (x ^ y);
        System.out.println("XOR (^) => "+x+" ^ "+y+" = "+z+".");
        x = true;
        y = true;
        z = (x ^ y);
        System.out.println("XOR (^) => "+x+" ^ "+y+" = "+z+".\n");

        System.out.println("(###############-Operator Logika NOT (!)-###############)");
        x = true;
        y = !x;
        System.out.println("NOT (!) => "+x+" (!) = "+y+".");
        x = false;
        y = !x;
        System.out.println("NOT (!) => "+x+" (!) = "+y+".");
    }
}
