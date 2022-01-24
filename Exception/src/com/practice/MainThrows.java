package com.practice;

import java.io.File;
import java.io.FileInputStream;

public class MainThrows {

    public static void main(String[] args) throws Exception{

        FileInputStream file = new FileInputStream("google.txt");
        System.out.println((char)file.read());

    }
}
