package com.practice;

public class Main {
    public static void main(String[] args){

        // Operator Aritmatika

        //Deklarasi variabel dan pemberian nilai awal variabel.
        int number1 = 5;
        int number2 = 2;
        int result;
        double resultDouble;


        // Penjumlahan
        result = number1 + number2;
        System.out.println(number1+" + "+number2+" = "+result);

        // Pengurangan
        result = number1 - number2;
        System.out.println(number1+" - "+number2+" = "+result);

        // Perkalian
        result = number1 * number2;
        System.out.printf("%d * %d = %d\n",number1,number2,result);

        // Pembagian
        resultDouble = (double)number1 / number2; // Mengkonversi hasil bagi dari kedua pembagian angka integer ke double sehingga menjadi angka desimal
        System.out.printf("%d / %d = %f\n",number1,number2,resultDouble);

        // Modulus
        result = number1 % number2;
        System.out.printf("%d %% %d = %d\n",number1,number2,result);

    }
}
