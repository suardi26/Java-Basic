package com.practice;

import java.util.Scanner;

public class Main {

    public static void main (String[] args ){

    /*
     Operator dan operand
     Operator adalah instruksi yang digunakan untuk mendapatkan hasil dari proses. Sedangkan
     Operand adalah nilai asal yang digunakan dalam sebuah proses operasi.
     Contoh : 5 + 8;
     '5' dan '8' adalah operand.
     '+' adalah operator.

     Operator Ternary / Operator Kondisional adalah operator yang terdiri dari 3 operand.
     Tujuan Operator Ternary adalah untuk menentukan suatu nilai variabel (Assignment).
     */

        Scanner enq = new Scanner(System.in);
        System.out.println("(###############-Game Berhitung-###############)");
        System.out.println("Silahkan jawab pertanyaan berikut : ");
        System.out.print("(25 * 3) / 5 = ");

        int ans = enq.nextInt();
        String res = (ans == 15) ? ("BENAR") : ("SALAH");

        System.out.println("\n(###############-Hasilnya-###############)\n");
        System.out.println("(25 * 3) / 5 = 15");
        System.out.println("Jawaban Anda "+res);

    }
}
