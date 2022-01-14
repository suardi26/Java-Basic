package com.practice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /*
            Fungsi Rekursif adalah fungsi yang memanggil dirinya sendiri.
        */

        int ops;
        Scanner enq = new Scanner(System.in);
        System.out.println("= = = = = Rekursif Function = = = = =");
        System.out.println("1. Recursive Function (Ex. 1).");
        System.out.println("2. Recursive Function.(Ex. 2).");
        System.out.println("3. Branching Recursive.");
        System.out.print("Silahkan Masukan Pilihan Anda (1,2 atau 3) : ");
        ops = enq.nextInt();

        if (ops == 1){
            System.out.print("\nMasukan Jumlah Mobil : " );
            int car = enq.nextInt();
            printCar(car);
        }else if (ops == 2){
            System.out.print("Masukan Angka : ");
            int number = enq.nextInt();
            System.out.println("Jumlahnya : "+ factorial(number));
        }else if (ops == 3){
            System.out.print("Masukan Angka : ");
            int number = enq.nextInt();
            System.out.println("Nilai Fibonacci Ke "+number+", adalah "+fibonacci(number,"Top"));
        }else{
            System.out.println("Mohon Maaf, pilihan "+ops+" tidak valid, silahkan masukan pilihan 1,2 atau 3 !!!!.");
        }

    }

    private static void printCar(int car){
        System.out.println("Mabil Ke "+car);
        if (car == 0) {
            return;
        }
        car--;
        printCar(car);
    }

    private static int factorial(int numbers){
        if (numbers == 0){
            return numbers;
        }
        System.out.println("Number "+ numbers);
        return numbers + factorial(numbers - 1);
    }
    private static int fibonacci(int number,String direction){
        System.out.println("Akar "+direction);
        System.out.println("Fibonacci Ke "+number);

        if (number == 1 || number == 0){
            return number;
        }else{
            return fibonacci(number - 2,"left") + fibonacci(number - 1, "right");

        }
    }
}
