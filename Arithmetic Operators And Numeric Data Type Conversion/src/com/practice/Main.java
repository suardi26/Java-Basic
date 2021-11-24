package com.practice;

public class Main {
    public static void main(String[] args){

        // Operator Aritmatika

        //Deklarasi variabel dan pemberian nilai awal variabel.
        int number1 = 5;
        int number2 = 2;
        int result;
        double resultDouble;

        //Header Operasi Aritmatika
        System.out.println("(####################-Operasi Arimatika-####################)");

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
        resultDouble = (double)number1 / number2;
        // Mengkonversi hasil bagi dari kedua pembagian angka integer ke double sehingga menjadi angka desimal.

        System.out.printf("%d / %d = %.2f\n",number1,number2,resultDouble);
        // Ket : '%.2f' untuk membatasi jumlah angka dibelakang koma menjadi 2 angka dibelakgan koma.

        // Modulus
        result = number1 % number2;
        System.out.printf("%d %% %d = %d\n",number1,number2,result);

        // Header Konfersi Tipe Data
        System.out.println("(####################-Konfersi Tipe Data-####################)");

        // Konfersi Tipe Data

        // Mengkonfersi tipe data dari yang intervalnya kecil ke besar.
        int numberI = 206;      // 32 bit
        long numberL = numberI; // 64 bit
        System.out.println("Tipe Data Integer Bernilai = "+numberI+", dikonversi ke tipe data Long = "+numberL+"." );
        /* hasil dari nilai variabel long akan sama dengan nilai dari variabel Integer karena dikonversi dari tipe data
        yang intervalnya kecil ke besar.*/

        // Mengkonfersi tipe data dari yang intervalnya besar ke kecil.
        int ui = 260; // 32 bit
        byte bt = (byte)ui; // 8 bit
        System.out.printf("Tipe data Integer Bernilai = %d, dikonversi ke tipe data Byte = %d.\n",ui,bt);
        // hasil dari nilai variabel bytes tidak sama dengan nilai integer yaitu 260 karena interval byte hanya -128 s.d 127.

        // Mengkonfersi tipe data (Casting) dari numerik bilangan bulat ke bilangan desimal ataupun sebaliknya.
        // Bilangan bulat ke bilangan desimal
        int in = 25, il= 2, dt;
        dt = in / il;
        float fl = (float) in / il;
        System.out.printf("25 Dibagi 2 Dalam tipe data Integer = %d, Sedangkan dalam tipe data Float = %.2f.\n",dt,fl);
        /*
        Dari Pembagian di atas hasil integer tidak menampilkan angka dibelakang koma dikarenakan integer adalah bilangan bulat,
        maka dari itu harus dikonversi atau di Casting ke dalam format desimal (float atau double).
        */

        //Bilangan Desimal ke bileangan bulat
        double lg1 = 250, lg2 = 50, hl;
        hl = lg1 + lg2;
        long hdb = (long) hl;
        System.out.printf("250 Dijumlahkan 50 Dalam tipe data Double = %.2f, Sedangkan dalam tipe data Long = %d.",hl,hdb);
        /*
        Hasil Konfersi dari tipe data double ke long tidak jauh beda dikarenakan hasilnya adalah bilangan bulat,
        namun pada tipe data double hasilnya tetap menambahkan 2 angka dibelakang koma.
         */
    }
}
