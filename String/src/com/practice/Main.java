package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         String adalah Tipe data yang dapat menampung kumpulan karakter misalnya kata atau kalimat.
         String object pada java bersidat immutable, maka ketika string itu dibuat, maka nilainya tidak bisa diganti.
         */
        String word = "good";
        char[] charc =  {'g','o','o','d'};

        // Menampilkan output String.
        System.out.println(word);
        System.out.println(Arrays.toString(charc));

        // Mengakses bagian dari char[].
        System.out.println("Komponen Kedua '[1]' dari String 'word' => "+word.charAt(3));
        System.out.println("Komponen Kedua '[1]' dari char[] 'charc' => "+charc[3]);

        // mengubah Nilai 'char[]'.
        charc[2] = 'l';
        System.out.println("Mengubah Nilai 'char[2]' dengan 'l', sehingga menjadi "+Arrays.toString(charc)+".");

        // Variabel String 'word' tidak dapat dilakukan karena sifat dari object String tidak dapat diubah (Immuutable).
        // word[2] = "l"; (Error) !!!
        // word.charAt(0) = "l"; (Error) !!!

        System.out.println();
        printAddressString("'word'",word);

        // Perubahan Nilai String dapat dilakukan secara tidak langsung dengan menimpa nilai variabel 'word' Sehingga
        // memiliki address memory yang baru.
        word = "f" + word.substring(1,4);
        printAddressString("'word'",word);

        String wrd1 = "good";
        printAddressString("'wrd1'",wrd1);
        // variabel word sebelumnya yang bernilai 'good' memiliki address memory yang sama pada nilai varibel 'wrd1' karena
        // memiliki nilai value yang sama dikarenakan pembuatan nilai dilakukan secara literal sehingga nilai string dimasukan
        // kedalam 'String pool', dan didalam 'String pool' ketika nilai beberapa String bernilai sama akan disimpan pada address memory
        // yang sama sehingga penggunaan memorinya lebih efisien karena reusaable.

        String wrd2 = "food";
        printAddressString("'wrd2'",wrd2);
        // Address memory variabel 'wrd2' dengan nilai 'food' tidak sama dengan varibel 'word' yang memiliki nilai yang sama
        // yaitu 'food'. hal ini dikarenakan nilai varibel 'word' dibuat dari method, sehingga nilainya bukan disimpan pada 'String pool'.

        // Operasi String
        System.out.println("\n= = = = = Operasi String = = = = =");
            // Mengambil character dari String 'words'.
            String words = "Saya pergi ke kota";
            System.out.println( "Kata String '"+words+"' pada character ke [5] adalah "+ words.charAt(5)+".");

            // Mengambil beberapa character dari String 'words'.
            System.out.printf("Kata String '%s' diambil character ke [14] sampai ke [15] adalah '%s'.\n",words,words.substring(14,18));

            // Mengabungkan String / Concatenation (Concat).
            String words2 = " tadi pagi";
            System.out.println("Penggabungan nilai String '"+words+"' dengan String '"+words2+"' menjadi '"+words+words2+"'.");

            // Mengabungkan String Dengan Non String.
            int number = 4;
            String words3 = "jam";
            String words4 = words + words2 + " " + words3 + " " + number; // casting ke Int 'number' menjadi String.
            System.out.println("Penggabungan nilai String '"+words+"' dengan String '"+words2+"' dan String '"+words3+"' serta Int '"+number+"'" +
                    " menjadi '"+words4+"'.");

            // Uppercase And Lowercase.
            System.out.println("Nilai String '"+words4+"' To Uppercase => '"+words4.toUpperCase()+"'.");
            System.out.println("Nilai String '"+words4.toUpperCase()+"' To Lowercase => '"+words4.toLowerCase()+"'.");

            // Mengganti kata pada nilai String (Replace).
            String words5 = words4.replace("kota","pasar");
            System.out.println("Nilai String '"+words4+"', Kata 'kota' diganti menjadi kata 'pasar', sehingga menjadi : '"+words5+"'.");

            // Comparison String.
            // Kasus 1.
            System.out.println("\nKasus 1 :");
            String words6 = "google";
            String words7 = "google";
            System.out.println("Apakah '"+words6+"' Sama Dengan '"+words7+"' ?");
            if (words6 == words7){
                System.out.println("Jawab : Iya Benar (Karena pengisian kedua variabel dilakukan dengan cara literal dan memiliki kedua nilai yang sama" +
                        " sehingga disimpan pada address memory yang sama pada pool String).");
            }else{
                System.out.println("Jawab : Salah.");
            }

            // Kasus 2.
            System.out.println("Kasus 2 :");
            String words8 = "gmail";
            String words9 = new String("gmail");
            System.out.println("Apakah '"+words8+"' Sama Dengan '"+words9+"' ?");
                if (words8 == words9){
                    System.out.println("Jawab : Iya Benar.");
                }else{
                    System.out.println("Jawab : Salah (Meskipun nilainya sama tapi untuk variabel 'words8' diisi secara literal sehingga disimpan pada " +
                            "String pool sedangkan variabel 'words9' \nadalah objek String sehingga tidak dimasukan pada String pool maka kedua nilai di atas " +
                            "memiliki address memory yang berbeda. karena simbol '==' membandingkan address memorinya).");
                }

            // Kasus 3.
            System.out.println("Kasus 3 :");
            Scanner enq = new Scanner(System.in);
            String words10 = "book"; // Pengisian Nilai String secara literal sehingga dimasukan dalam String Pool.
            System.out.print("Masukan Nilai String : ");
            String words11 = enq.next();
            // Pengisian nilai string diambil dari input user berarti bukan pengisian secara literal maka disimpan di memory heap bukan di string pool.
            System.out.println("Nilai String yang Anda Masukan adalah "+words11);
            System.out.println("Apakah '"+words10+"' Sama Dengan '"+words11+"' ?");
            if (words10.equals(words11)){
                System.out.println("Jawab : Iya Benar (Meskipun Memiliki Address memory yang berbeda, varibel 'words10' nilainya \ndisimpan pada" +
                        " memory pool sedangkan variabel 'words11' nilainya disimpan pada memory Heap, namun method 'equals()' membandingkan " +
                        "beberapa nilai String bukan address memorinya).");
            }else{
                System.out.println("Jawab : Salah. ");
            }

            // Comparison Menurut Abjad.
            // Kasus 1
            System.out.println("\nKasus 2");
            String words12 = "duck";
            String words13 = "elephant";
            System.out.println("String 1 => "+words12);
            System.out.println("String 2 => "+words13);
            System.out.println("Jawabanya : "+words12.compareTo(words13)+". karena dapat dilihat bahwa nilai pertama '"+words12+"' adalah 'd'" +
                    " dan nilai pertama '"+words13+"' adalah 'e'. \nc => d => e => f. untuk itu 'd' ketinggalan satu langkah dengan " +
                    "'e' maka dari itu jawabannya -1.");
            // pada variabel 'words12' huruf pertama 'd'. dan pada variabel 'words13' huruf pertama 'e'.
            // d <= e <= f. sesuai urutan abjad 'd'  ketinggalan 1 langkah dari huruf 'e' makanya hasilnya -1.

            //Kasus 2
            System.out.println("Kasus 2");
            String words14 = "mouse";
            String words15 = "giraffe";
            System.out.println("String 1 => "+words14);
            System.out.println("String 2 => "+words15);
            System.out.println("Jawabannya : "+words14.compareTo(words15)+". karena dapat dilihat bahwa nilai pertama '"+words14+"' adalah 'm'" +
                " dan nilai pertama '"+words15+"' adalah 'g'. \ng => h => i => j => k => l => m. untuk itu 'm' duluan 6 langkah dari " +
                "'g' maka dari itu jawabannya 6.");
            // pada variabel 'words14' huruf pertama 'm'. dan pada variabel 'words15' huruf pertama 'g'.
            // g <= h <= i <= j <= k <= l <= m. sesuai urutan abjad 'm' duluan 6 langkah dari huruf 'g' makanya hasilnya 6.

            //Kasus 3
            System.out.println("Kasus 3");
            String words16 = "cow";
            String words17 = "chiken";
            System.out.println("String 1 => "+words16);
            System.out.println("String 2 => "+words17);
            System.out.println("Jawabannya : "+words16.compareTo(words17)+".  ketika nilai pertama dari kedua variabel sama maka yang akan " +
                    "dibandingkan adalah huruf kedua, dapat dilihat bahwa nilai kedua\n '"+words16+"' adalah 'o'" +
                    " dan nilai kedua '"+words17+"' adalah 'h'.h => i => j => k => l => m => n => o. untuk itu 'o' duluan 7 langkah dari " +
                    "'h' maka dari itu jawabannya 7.");
            // pada variabel 'words14' huruf pertama 'm'. dan pada variabel 'words15' huruf pertama 'g'.
            // g <= h <= i <= j <= k <= l <= m. sesuai urutan abjad 'm' duluan 6 langkah dari huruf 'g' makanya hasilnya 6.

    }
    private static void printAddressString(String variabel, String dataString){

        System.out.println("Variabel "+variabel+" = "+dataString+" || Addressnya : "
                +Integer.toHexString(System.identityHashCode(dataString)));
    }
}
