package com.practice;

import java.util.Formatter;

public class Main {

    public static void main(String[] args){

        String name = "Tom";
        int age = 18;
        System.out.println("===============================================");
        System.out.println("Menggunakan print line.");
        System.out.println("My name is "+name+" and I am "+age+" years old.");


        // print format
        // conversion.
        // %s = String.
        // %d = Integer.
        // %f = Floating point.
        // %c = Character.
        // %b = Boolean.

        // format : %(argumentIndeks)(flags)(width)(.precision)(conversion).
        System.out.println("===============================================");
        System.out.println("Menggunakan print format.");
        System.out.printf("My name is %s and I am %d years old.",name,age);

        // format : %(argumentIndeks)(conversion).
        // format : %1$s.
        System.out.println("\n===============================================");
        System.out.println("Menggunakan print format(argumentIndeks).");
        System.out.printf("Teacher\t: What is your name and how old are you ? \n%1$s\t: My name is %1$s and I am %2$d years old.",name,age);

        // format : %(flags)(conversion).
        // format : %+d.
        int number1 = 12;
        int number2 = 13;
        int result1 = number1 + number2;
        int result2 = number1 - number2;
        System.out.println("\n===============================================");
        System.out.println("Menggunakan print format(flags).");
        System.out.printf("result %d + %d = %+d.\n",number1 ,number2,result1);
        System.out.printf("result %d + %d = %+d.",number1 ,number2,result2);

        // format : %(width)(conversion).
        // format : %5s.
        // width adalah lebar Nilai String.
        int number3 = 6000;
        int number4 = 1000000;
        System.out.println("\n===============================================");
        System.out.println("Menggunakan print format(width).");
        System.out.printf("result :\n%d",number3);
        System.out.printf("\n%5d",number3);
        System.out.printf("\n%-15d",number3); // menambahkan flags '-' sebelum width maka rata kiri.
        System.out.printf("\n%+15d",number3); // menambahkan flags '+' sebelum width maka menambahkan simbol plus/minus sesuai
                                              // dari value, pada depan Nilai dari variabel dan mengatur nilai menjadi rata kanan.

        System.out.printf("\n%+-15d",number3); // menambahkan flags '+ dan -' sebelum width maka menambahkan simbol plus/minus sesuai
                                               // dari value, pada depan Nilai dari variabel dan mengatur nilai menjadi rata kiri.

        System.out.printf("\n%015d",number3);  // menambahkan angka 0 sebelum width maka mengisi angka 0 sebelum value dari nilai variabel
                                               // dan mengisi slot yang kosong sesuai dengan width yang ditentukan.

        System.out.printf("\n%,12d",number4); // menambahkan flags ',' sebelum width maka dapat memberikan tanda koma ','
                                              // untuk pemisah dari ribuan, ratusan, jutaan dan seterusnya.

        System.out.printf("\n%-,12d",number4); // menambahkan flags '-' dan ',' sebelum width maka dapat memberikan tanda koma ','
                                               // untuk pemisah dari ribuan, ratusan, jutaan dan seterusnya serta rata kiri.

        // Floating Point.
        System.out.println("\n===============================================");
        System.out.println("Floating Point");
        float f1 = 1.56f;
        System.out.printf("Result : %f",f1);
        System.out.printf("\nResult : %+f",f1);

        // format : %(width)(conversion).
        // format : %5s.
        // width adalah lebar Nilai String.
        float f2 = 1.76456f;
        System.out.println("\n===============================================");
        System.out.println("Menggunakan print format(.precision).");
        System.out.printf("Result : %f",f2);
        System.out.printf("\nResult : %.2f",f2);// Membulatkan Nilai dibelakang koma menjadi 2.

        System.out.printf("\nResult : %5.2f",f2);// Membulatkan Nilai dibelakang koma menjadi 2 dan mengatur panjang nilai menjadi 5.

        System.out.printf("\nResult : %+09.2f",f2);// Membulatkan Nilai dibelakang koma menjadi 2 dan mengatur panjang nilai menjadi 9
                                                   // dan mengilsi slot kosong dengan angka 0 serta menambahkan simbol '+'.

        // String Format.
        // format : %(argumentIndeks)(flags)(width)(.precision)(conversion).
        String name1 = "Mike";
        float result3 = 98.365256f;
        System.out.println("\n===============================================");
        System.out.println("Print Format");
        System.out.printf("My Name is %1$s and may result %2$+6.2f\n",name1,result3);
        System.out.println("\nString Format");
        String str = String.format("My Name is %1$s and may result %2$+6.2f",name1,result3);
        System.out.println(str);

        System.out.println("\nString Builder");
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);

        formatter.format("My Name is %1$s and may result %2$+6.2f",name1,result3);
        System.out.println(stringBuilder);
        System.out.println("\n===============================================");
    }
}
