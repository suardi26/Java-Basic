package CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Search {

    static PreparedStatement statement;
    public static void searchData(String x){

        try{
            Connect.connect();
            statement = Connect.con.prepareStatement("select * from tb_mahasiswa WHERE stb LIKE '%"+x+"%' OR nama LIKE '%"+x+"%' OR jurusan LIKE '%"+x+"%'");
            ResultSet rs = statement.executeQuery();
            System.out.println("=================================================================================");
            System.out.print("| No |  STB  |        Nama          |       Jurusan         |      No. Tlp      |\n");
            System.out.println("=================================================================================");
            int no = 1;
            boolean row = rs.next();

            if (row != true){
                System.out.println("Maaf tidak tersedia !!");
            }else{
                while (row == true) {
                    String stbDB = rs.getString(1);
                    String nameDB = rs.getString(2);
                    String jurDB = rs.getString(3);
                    String no_tlpDB = rs.getString(4);


                    System.out.printf("| %2d ", no);
                    System.out.printf("|\t%3s  ", stbDB);
                    System.out.printf("|\t%-16s\t", nameDB);
                    System.out.printf("|\t%-16s\t", jurDB);
                    System.out.printf("|\t%-13s\t|", no_tlpDB);
                    System.out.println();
                    no++;
                    row = rs.next();
                }
            }

            Connect.con.close();
            System.out.println("=================================================================================");
        }catch(SQLException e){
            System.out.println("Errornya : "+e);
        }
    }
}
