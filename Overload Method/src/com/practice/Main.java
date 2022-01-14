package com.practice;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int resultInt;
        double resultDouble;

        System.out.println("= = = = = Integer = = = = =");
        resultInt = plus(5,7);
        printResult(resultInt);

        System.out.println("\n\n= = = = = Double = = = = =");
        resultDouble = plus(4.5 , 5.5);
        printResult(resultDouble);
    }

    private static int plus(int n1, int n2){
        System.out.print(n1+" + "+n2+" => ");
        return n1 + n2;
    }

    private static double plus(double n1, double n2){
        System.out.print(n1+" + "+n2+" => ");
        return n1 + n2;
    }

    private static void printResult(int result){
        System.out.print("Menghasilkan Angka Integer adalah " +result+".");
    }
    private static void printResult(double result){
        System.out.print("Menghasilkan Angka Double adalah "+result+".");
    }
}
