package com.practice;

// import library java.
import java.sql.*;
import java.util.Scanner;

// import class.
import CRUD.Add;
import CRUD.Connect;
import CRUD.Update;
import CRUD.View;
import CRUD.Search;
import CRUD.Delete;



public class Main {

    static PreparedStatement statement;
    public static void main(String[] args){

        Connect.connect();
        Scanner enq = new Scanner(System.in);
        String ops,nama,jur,no_tlp;
        int finalStb;
        boolean isNext = true;
        boolean isTrue = false;
        while(isNext) {
            clearScreen();
            System.out.println("Database Mahasiswa\n");
            System.out.println("1. View Data Mahasiswa");
            System.out.println("2. Search Data Mahasiswa");
            System.out.println("3. Add Data Mahasiswa");
            System.out.println("4. Update Data Mahasiswa");
            System.out.println("5. Delete Data Mahasiswa");
            System.out.println("6. Exit");
            System.out.print("\nSilahkan Masukan Pilihan Anda : ");
            ops = enq.next();
            System.out.println();

            switch (ops) {
                case "1":
                    System.out.println("======================");
                    System.out.println("1. View Data Mahasiswa");
                    System.out.println("======================");

                        View.viewData();

                    break;
                case "2":
                    Scanner scannerS = new Scanner(System.in);
                    System.out.println("=====================");
                    System.out.println("Search Data Mahasiswa");
                    System.out.println("=====================");

                    System.out.print("Masukan Data yang akan dicari (STB / Nama / Jurusan) : ");
                    String x = scannerS.nextLine();

                        Search.searchData(x);

                    break;
                case "3":
                    Scanner scannerAdd = new Scanner(System.in);
                    System.out.println("==================");
                    System.out.println("Add Data Mahasiswa");
                    System.out.println("==================");
                    System.out.print("\nMasukan Nama Mahasiswa : ");
                    nama = scannerAdd.nextLine();
                    System.out.print("\nMasukan Jurusan Mahasiswa : ");
                    jur = scannerAdd.nextLine();
                    System.out.print("\nMasukan No.Tlp Mahasiswa : ");
                    no_tlp = scannerAdd.nextLine();
                    finalStb = newStb();
                    System.out.println("Data Mahasiswa yang anda input : ");
                    System.out.println("=================================");
                    System.out.println("STB\t\t\t\t: "+finalStb);
                    System.out.println("Nama Mahasiswa\t: "+nama);
                    System.out.println("jurusan\t\t\t: "+jur);
                    System.out.println("No. Tlp\t\t\t: "+no_tlp);

                    if (cekStb(finalStb) == true) {
                        System.out.println("Maaf STB Sudah terdaftar !");
                    }else{
                        isTrue = nextOrStop("Apakah Anda ingin Manambah data tersebut");
                        if (isTrue) {
                            Add.addData(finalStb, nama, jur, no_tlp);
                            View.viewData();
                        }
                    }
                    break;
                case "4":
                    Scanner scannerUpdate = new Scanner(System.in);
                    System.out.println("=====================");
                    System.out.println("Update Data Mahasiswa");
                    System.out.println("=====================");
                    View.viewData();
                    System.out.print("\nMasukan STB Mahasiswa : ");
                    finalStb = scannerUpdate.nextInt();
                    scannerUpdate.nextLine();
                    System.out.print("\nMasukan Nama Mahasiswa : ");
                    nama = scannerUpdate.nextLine();
                    System.out.print("\nMasukan Jurusan Mahasiswa : ");
                    jur = scannerUpdate.nextLine();
                    System.out.print("\nMasukan No.Tlp Mahasiswa : ");
                    no_tlp = scannerUpdate.nextLine();

                    System.out.println("\nData Mahasiswa yang anda input : ");
                    System.out.println("=================================");
                    System.out.println("STB\t\t\t\t: "+finalStb);
                    System.out.println("Nama Mahasiswa\t: "+nama);
                    System.out.println("jurusan\t\t\t: "+jur);
                    System.out.println("No. Tlp\t\t\t: "+no_tlp);

                    if (cekStb(finalStb) == true) {

                        isTrue = nextOrStop("Apakah Anda ingin Mengubah data tersebut");
                        if (isTrue) {
                            Update.updateData(finalStb, nama, jur, no_tlp);
                            View.viewData();
                        }
                    }else{
                        System.out.println("Maaf STB tersebut belum terdaftar !");
                    }
                    break;
                case "5":
                    System.out.println("=====================");
                    System.out.println("Delete Data Mahasiswa");
                    System.out.println("=====================");
                    View.viewData();
                    Scanner scannerDelete = new Scanner(System.in);
                    System.out.print("\nMasukan STB Mahasiswa yang akan dihapus : ");
                    finalStb = scannerDelete.nextInt();
                    Delete.deleteData(finalStb);
                    break;
                case "6":
                    return;
                default:
                   System.out.println("\nPilihan Anda tidak valid, Silahkan Masukan Opsi Inputan yang benar (1,2,3,4,5) !!!");
            }

           isNext = nextOrStop("Apakah Anda Ingin Melanjutakan Aplikasi");
        }
    }

    public static int newStb(){
        String stb = "";
        try{
            Connect.connect();
            statement = Connect.con.prepareStatement("select stb from tb_mahasiswa");
            ResultSet rs = statement.executeQuery();
            while(rs.next() == true){
                stb = rs.getString("stb");
            }
            Connect.con.close();
        }catch(SQLException e){
            System.out.println("Errornya : "+e);
        }
        int castingStb = Integer.parseInt(stb);
        castingStb++;
        return castingStb;
    }
    public static boolean cekStb(int stb){
        boolean notNull = false;
        try{
            Connect.connect();
            statement = Connect.con.prepareStatement("select stb from tb_mahasiswa WHERE stb = "+stb+"");
            ResultSet rs = statement.executeQuery();

            if (!rs.next()) {
                 notNull = false;
            }else{
                notNull = true;
            }
            Connect.con.close();

        }catch(SQLException e){
            System.out.println("Errornya : "+e);
        }
        return notNull;
    }

    public static boolean nextOrStop(String message){
        Scanner enq1 = new Scanner(System.in);
        System.out.print("\n"+message+" [y/n] ? : ");
        String nextOrStop = enq1.next();
        System.out.println();

        while((!nextOrStop.equalsIgnoreCase("y")) && (!nextOrStop.equalsIgnoreCase("n"))){

            System.out.println("Pilihan Anda tidak valid");
            System.out.print("\n"+message+" [y/n] ? : ");
            nextOrStop = enq1.next();
            System.out.println();
        }
        return nextOrStop.equalsIgnoreCase("y");
    }
    public static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("Windows")){
                ProcessBuilder processBuilder = new ProcessBuilder("cmd","/c","cls");
                Process startProcess = processBuilder.inheritIO().start();
                startProcess.waitFor();
            }else{
                ProcessBuilder processBuilder = new ProcessBuilder("clear");
                Process startProcess = processBuilder.inheritIO().start();
                startProcess.waitFor();
            }
        }catch(Exception e){
            System.err.println("error pada : "+e);
        }
    }
}
