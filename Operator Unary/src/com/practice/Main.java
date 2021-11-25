package com.practice;

public class Main {
    public static void main (String [] args){

        // Operator Unary adalah operator yang digunakan untuk memanipulasi satu variabel.

        // Header
        System.out.println("(#############################################-Operator Unary-#############################################)");

        // Unary Negatif dan Positif
        long number = 205l;
        System.out.printf("Variabel 'number' = %d, dan setelah dilakukan operasi Unary negatif maka hasilnya berubah Menjadi = %d.\n",number,-number);

        number = 210l;
        System.out.printf("Variabel 'number' = %d, dan setelah dilakukan operasi Unary Positif maka hasilnya berubah menjadi = %d.\n",number,+number);

        // Unary Increment & Decrement
        byte number1 = 25;
        System.out.printf("Variabel 'number1' = %d, ",number1);
        number1++; // Increment '++' Artinya Ditambah 1.
        System.out.printf("dan setelah dilakukan operasi Unary Increment '++' maka hasilnya berubah menjadi = %d.\n",number1);

        short number2 = 121;
        System.out.printf("Variabel 'number2' = %d, ",number2);
        number2--; // Decrement '--' Artinya Dikurangi 1.
        System.out.printf("dan setelah dilakukan operasi Unary Decrement '--' maka hasilnya berubah menjadi = %d.\n",number2);

        // Increment Prefix Dan Postfix
        int numberA = 10;
        System.out.printf("Variabel 'numberA' = %d, dan setelah dilakukan operasi Unary Increment Prefix maka hasilnya berubah menjadi = %d.\n", numberA,++numberA);

        int numberB = 10;
        System.out.printf("Variabel 'numberB' = %d, dan setelah dilakukan operasi Unary Increment Postfix maka hasilnya berubah menjadi = %d.\n", numberB,numberB++);
        /*
            Pada Increment prefix hasilnya berubah dari 10 menjadi 11 dikarenakan "++numberA" artinya nilai variabel "numberA" ditambahkan dulu baru di tampilkan,
            sedangkan pada Increment postfix tidak berubah di tampilan outputnya yaitu 10 menjadi 10 dikarenakan "numberB++" artinya nilai variabel "numberB" ditampilkan dulu baru di tambahkan.
        */

        // Unary Boolean ! untuk Negasi atau kebalikan suatu nilai boolean
        boolean choice = true;
        System.out.println("variabel 'choice' = "+choice+", dan setelah dilakukan operasi Unary Invert/Negasi maka hasilnya berubah menjadi = "+!choice);

        // Footer
        System.out.println("(#############################################-Operator Unary-#############################################)");

    }
}
