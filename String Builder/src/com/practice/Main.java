package com.practice;

public class Main {

    public static void main(String[] args){

         /*
            Ketika Nilai String itu tidak bisa berubah (immutable), maka berbeda dengan String Builder dan String Buffer yang
            Nilainya dapat diubah (mutable).

            String Buffer dan String Builder merupakan kelas yang digunakan untuk membuat object string sehingga nilainya dapat dimodifikasi.
            namun perbedaanya adalah String Buffer itu synchronized sehingga thread safe, sedangkan String Builder tidak synchronized namun
            String Buffer lebih lambat dibandingkan String Builder.
        */

        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println("= = = = = String Builder = = = = =");
        printDataBuilder(stringBuilder);

        // append adalah method untuk menambahkan nilai StringBuilder.
        stringBuilder.append(" everyone");
        printDataBuilder(stringBuilder);

        // insert adalah method untuk menambahkan Nilai StringBuilder dari character tertentu.
        stringBuilder.insert(14," my name is tom");
        printDataBuilder(stringBuilder);

        // delete adalah method untuk menghapus nilai StringBuilder mulai dari character tertentu sampai dengan character tertentu
        // tergantung dari parameter yang dimasukan.
        stringBuilder.delete(5,14);
        printDataBuilder(stringBuilder);

        // setChartAt adalah method yang digunakan untuk mengubah nilai StringBuilder pada character tertentu.
        stringBuilder.setCharAt(17,'T');
        printDataBuilder(stringBuilder);

        // replace adalah method yang digunakan untuk mengubah nilai StringBuilder mulai dari character tertentu sampai dengan character tertentu
        // tergantung dari parameter yang dimasukan.
        stringBuilder.replace(17,20,"Mike");
        printDataBuilder(stringBuilder);

        // reverse adalah method yang digunakan untuk membalik nilai StringBuilder.
        stringBuilder.reverse();
        printDataBuilder(stringBuilder);
        stringBuilder.reverse();

        // toString adalah method yang digunakan untuk mengubah nilai StringBuilder menjadi nilai String (Casting to String).
        String kalimat = stringBuilder.toString();
        System.out.println("Value String : "+kalimat);
        System.out.println("Length : "+kalimat.length());
        int addressMemory = System.identityHashCode(kalimat);
        System.out.println("Address Memory : "+Integer.toHexString(addressMemory));
    }

    private static void printDataBuilder (StringBuilder strBuilder){

        System.out.println("Value String Builder : "+strBuilder);
        System.out.println("Length : "+strBuilder.length());
        System.out.println("Kapasitas : "+strBuilder.capacity());// Kapasitas awal yaitu 16.

        int addressMemory = System.identityHashCode(strBuilder);
        System.out.println("Address Memory : "+Integer.toHexString(addressMemory));
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = =");

    }
}
