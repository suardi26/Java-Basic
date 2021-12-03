package com.practice;

public class Main {

    public static void main(String [] args){

        /*
        Operator Bitwise adalah operator khusus untuk menangani operasi logika bilangan biner dalam bentuk bit.
        Bilangan biner sendiri merupakan jenis bilangan yang hanya terdiri dari 2 jenis angka, yakni 0 dan 1.
        */

        byte x = 6;
        byte y;
        byte z;

        String x_bits;
        String y_bits;
        String z_bits;

        System.out.printf("(###############-Operator Bitwise Shift Left-###############)\n");
        x_bits = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",x_bits,x);
        y = (byte) (x << 1); // Menggeser posisi bit dalam variabel x ke kiri sebanyak 1 bit.
        y_bits = String.format("%8s",Integer.toBinaryString(y)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n\n",y_bits,y);

        System.out.printf("(###############-Operator Bitwise Shift Right-###############)\n");
        y_bits = String.format("%8s",Integer.toBinaryString(y)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",y_bits,y);
        x = (byte) (y >> 1);// Menggeser posisi bit dalam variabel x ke kanan sebanyak 1 bit.
        x_bits = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n\n",x_bits,x);

        System.out.printf("(###############-Operator Bitwise OR (|)-###############)\n");
        x = 36;
        y = 8;
        x_bits = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",x_bits,x);
        y_bits = String.format("%8s",Integer.toBinaryString(y)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",y_bits,y);
        System.out.println("---------------------------------OR");
        z = (byte) (x | y);
        z_bits = String.format("%8s",Integer.toBinaryString(z)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n\n",z_bits,z);

        System.out.printf("(###############-Operator Bitwise AND (&)-###############)\n");
        x = 36;
        y = 34;
        x_bits = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",x_bits,x);
        y_bits = String.format("%8s",Integer.toBinaryString(y)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",y_bits,y);
        z = (byte) (x & y);
        System.out.println("---------------------------------AND");
        z_bits = String.format("%8s",Integer.toBinaryString(z)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n\n",z_bits,z);

        System.out.printf("(###############-Operator Bitwise XOR (^)-###############)\n");
        x = 36;
        y = 34;
        x_bits = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",x_bits,x);
        y_bits = String.format("%8s",Integer.toBinaryString(y)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",y_bits,y);
        z = (byte) (x ^ y);
        System.out.println("---------------------------------XOR");
        z_bits = String.format("%8s",Integer.toBinaryString(z)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n\n",z_bits,z);

        System.out.printf("(###############-Operator Bitwise NOT (~)-###############)\n");
        x = 36;
        y = (byte) (~x);
        x_bits = String.format("%8s",Integer.toBinaryString(x)).replace(' ','0');
        System.out.printf("%s (Biner) = %d (Desimal).\n",x_bits,x);
        System.out.println("---------------------------------NOT");
        y_bits = String.format("%8s",Integer.toBinaryString(y)).substring(24);
        System.out.printf("%s (Biner) = %d (Desimal).\n",y_bits,y);

    }
}
