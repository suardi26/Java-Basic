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
       System.out.println("Kapasitas tipe data byte : "+Byte.SIZE+" bit");

       //Short adalah tipe data yang juga termasuk numerik/ angka yang bersifat bilangan bulat berkapasitas 16 bit.
       short st = 96;
       System.out.println("(###############-Tipe Data Short-###############)");
       System.out.println("Nilai variabel st yang bertipe data short : "+st);
       System.out.println("Nilai maximum short : "+Short.MAX_VALUE);
       System.out.println("Nilai minimum short : "+Short.MIN_VALUE);
       System.out.println("Kapasitas tipe data short : "+Short.BYTES+" bytes");
       System.out.println("Kapasitas tipe data short : "+Short.SIZE+" bit");

       //Integer adalah tipe data yang termasuk numerik/angka yang bersifat bilangan bulat berkapasitas 32 bit.
       int it = 26;
       System.out.println("(###############-Tipe Data Integer-###############)");
       System.out.println("Nilai variabel it yang bertipe data integer : "+it);
       System.out.println("Nilai maximum integer : "+Integer.MAX_VALUE);
       System.out.println("Nilai minimun integer : "+Integer.MIN_VALUE);
       System.out.println("Kapasitas tipe data integer : "+Integer.BYTES+" bytes");
       System.out.println("Kapasitas tipe data integer : "+Integer.SIZE+" bit");

       //Long adalah tipe data yang termasuk numerik/angka yang bersifat bilangan bulat yang berkapasitas 64 bit.
       long lg = 2006l;
       System.out.println("(###############-Tipe Data Long-###############)");
       System.out.println("Nilai variabel lg yang bertipe data long : "+lg);
       System.out.println("Nilai maximum long : "+Long.MAX_VALUE);
       System.out.println("Nilai minimum long : "+Long.MIN_VALUE);
       System.out.println("Kapasitas tipe data long : "+Long.BYTES+" bytes");
       System.out.println("Kapasitas tipe data long : "+Long.SIZE+" bit");

       //Float adalah tipe data yang termasuk numerik/angka yang bersifat bilangan desimal yang berkapasitas 32 bit.
       float flt = 12.3f;
       System.out.println("(###############-Tipe Data Float-###############)");
       System.out.println("Nilai variabel flt yang bertipe data float : "+flt);
       System.out.println("Nilai maximum float : "+Float.MAX_VALUE);
       System.out.println("Nilai minimum float : "+Float.MIN_VALUE);
       System.out.println("Kapasitas tipe data float : "+Float.BYTES+" bytes");
       System.out.println("Kapasitas tipe data float : "+Float.SIZE+" bit");

       //Double adalah tipe data yang termasuk numerik/angka yang bersifat bilangan desimal yang berkapasitas 64 bit.
       double dbl = 125.5d;
       System.out.println("(###############-Tipe Data Double-###############)");
       System.out.println("Nilai variabel dbl yang bertipe data double : "+dbl);
       System.out.println("Nilai maximum double : "+Double.MAX_VALUE);
       System.out.println("Nilai minimum double : "+Double.MIN_VALUE);
       System.out.println("Kapasitas tipe data double : "+Double.BYTES+" bytes");
       System.out.println("Kapasitas tipe data double : "+Double.SIZE+" bit");

       //Char adalah tipe data yang termasuk dalam kelompok karakter dan hanya dapat menampung 1 karakter.
       char chr = 'K';
       System.out.println("(###############-Tipe Data Char-###############)");
       System.out.println("Nilai variabel chr yang bertipe data char :"+chr);
       System.out.println("Nilai maximum char : "+Character.MAX_VALUE);
       System.out.println("Nilai Manimum char : "+Character.MIN_VALUE);
       System.out.println("Kapasitas tipe data char : "+Character.BYTES+" bytes");
       System.out.println("Kapasitas tipe data char : "+Character.SIZE+" bit");

       //Boolean adalah tipe data yang termasuk dalam kelompok logika dan memiliki nilai true atau false.
       boolean bln = true;
       System.out.println("(###############-Tipe Data Boolean-###############)");
       System.out.println("Nilai variabel bln yang bertipe data boolean : "+bln);
       System.out.println("Nilai maximum boolean : "+Boolean.TRUE);
       System.out.println("Nilai minimum boolean : "+Boolean.FALSE);

    }
}
