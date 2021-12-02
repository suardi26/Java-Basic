package com.practice;

public class Main {

    public static void main (String[] args) {
        /* Operator Comparasion/Perbandingan adalah operator yang digunakan untuk membandingkan 2 buah nilai,
           apakah nilai tersebut sama besar '==', tidak sama besar '!=', lebih kecil '<', lebih besar '>',
           lebih kecil sama dengan '<=' serta lebih besar sama dengan '>=', dan hasil dari operator Perbandingan ini
           adalah boolean True atau False.
        */

        short i,o;//Deklarasi Variabel.
        boolean value;//Deklarasi Variabel.

        //Operator Equal atau sama besar.
        System.out.println("(###############-Sama Besar-###############)");
        i = 60;
        o = 60;
        value = (i == o);
        System.out.printf("(==)Apakah %d Sama Dengan %d ? => %s.\n",i,o,value);

        i = 60;
        o = 40;
        value = (i == o);
        System.out.printf("(==)Apakah %d Sama Dengan %d ? => %s.\n",i,o,value);

        System.out.println("(###############-Tidak Sama Besar-###############)");
        i =  80;
        o = 60;
        value = (i != o);
        System.out.printf("(!=)Apakah %d Tidak Sama Dengan %d ? => %s.\n",i,o,value);

        i = 80;
        o = 80;
        value = (80 != o);
        System.out.printf("(!=)Apakah %d Tidak Sama Dengan %d ? => %s.\n",i,o,value);

        System.out.println("(###############-Lebih Besar-###############)");
        i = 90;
        o = 60;
        value = (i > o);
        System.out.printf("(>)Apakah %d Lebih Besar Dari %d ? => %s.\n",i,o,value);

        i = 90;
        o = 90;
        value = (i > o);
        System.out.printf("(>)Apakah %d Lebih Besar Dari %d ? => %s.\n",i,o,value);

        System.out.println("(###############-Lebih Kecil-###############)");
        i = 20;
        o = 40;
        value = (i < o);
        System.out.printf("(<)Apakah %d Lebih Kecil dari %d ? => %s.\n",i,o,value);
        i = 40;
        o = 40;
        value = (i < o);
        System.out.printf("(<)Apakah %d Lebih Kecil dari %d ? => %s.\n",i,o,value);

        System.out.println("(###############-Lebih Besar Atau Sama Dengan-###############)");
        i = 60;
        o = 60;
        value = (i >= o);
        System.out.printf("(>=)Apakah %d Lebih Besar Atau Sama Dengan %d ? => %s.\n",i,o,value);

        i = 20;
        o = 40;
        value = (i >= o);
        System.out.printf("(>=)Apakah %d Lebih Besar Atau Sama Dengan %d ? => %s.\n",i,o,value);

        System.out.println("(###############-Lebih Kecil Atau Sama Dengan-###############)");
        i = 20;
        o = 20;
        value = (i <= o);
        System.out.printf("(<=)Apakah %d Lebih Kecil Atau Sama Dengan %d ? => %s.\n",i,o,value);

        i = 40;
        o = 20;
        value = (i <= o);
        System.out.printf("(<=)Apakah %d Lebih Kecil Atau Sama Dengan %d ? => %s.\n",i,o,value);


    }
}
