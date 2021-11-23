package com.practice;

public class Main {
    public static void main (String[] args){

        //Variabel berfungsi menampung data sesuai dengan tipe data yang ditentukan.
        //Nama variabel yang tidak dapat digunakan yaitu keyword pada java seperti class,package,private,dll.
        //Contoh :

            double cloudC;//mendeklarasikan variabel cloudC bertipe double.
            float thu = 4.5f;//Memberikan nilai awal variabel thu dengna nilai 4.5 dan bertipe float.
            int ioT = 3; //Nama variabel ioT bertipe data Integer dan Bernilai 3.

       // Tipe Data Dasar / Primitive Pada Java.
       // byte,short,integer,long,float,double,boolean,char

       // byte adalah tipe data yang termasuk numerik/angka yang bersifat bilangan bulat dan berkapasitas 8 bit.
       byte bt =  6;
       System.out.println("(###############-Tipe Data Byte-###############)");
       System.out.println("Nilai variabel bt yang bertipe data byte : "+bt);
       System.out.println("Nilai maximum byte : "+Byte.MAX_VALUE);
       System.out.println("Nilai minimum byte : "+Byte.MIN_VALUE);
       System.out.println("Kapasitas tipe data byte : "+Byte.BYTES+" bytes");
       System.out.println("Kapasitas tipe data byte : "+Byte.SIZE+" bytes");

       //Short adalah tipe data yang juga termasuk numerik/ angka yang bersifat bilangan bulat berkapasitas 16 bit.
       short st = 96;
       System.out.println("(###############-Tipe Data Short-###############)");
       System.out.println("Nilai variabel st yang bertipe data short : "+st);
       System.out.println("Nilai maximum short : "+Short.MAX_VALUE);
       System.out.println("Nilai minimum short : "+Short.MIN_VALUE);
       System.out.println("Kapasitas tipe data short : "+Short.BYTES+" short");
       System.out.println("Kapasitas tipe data short : "+Short.SIZE+" short");

       // Integer adalah tipe data yang termasuk numerik/angka yang bersifat bilangan bulat berkapasitas 32 bit.
       int push = 26;
       System.out.println("(###############-Tipe Data Integer-###############)");
       System.out.println("Nilai variabel push yang bertipe data integer : "+push);
       System.out.println("Nilai maximum integer : "+Integer.MAX_VALUE);
       System.out.println("Nilai minimun integer : "+Integer.MIN_VALUE);
       System.out.println("Kapasitas tipe data integer : "+Integer.BYTES+" bytes");
       System.out.println("Kapasitas tipe data integer : "+Integer.SIZE+" bit");






    }
}
