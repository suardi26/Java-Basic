package CRUD;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View {

    static PreparedStatement statement;
    public static void viewData(){

        try{
            Connect.connect();
            statement = Connect.con.prepareStatement("select * from tb_mahasiswa");
            ResultSet rs = statement.executeQuery();
            System.out.println("=================================================================================");
            System.out.print("| No |  STB  |        Nama          |       Jurusan         |      No. Tlp      |\n");
            System.out.println("=================================================================================");
            int no = 1;
            while (rs.next() == true) {
                String stb = rs.getString(1);
                String name = rs.getString(2);
                String jur = rs.getString(3);
                String no_tlp = rs.getString(4);


                System.out.printf("| %2d ",no);
                System.out.printf("|\t%3s  ",stb);
                System.out.printf("|\t%-16s\t",name);
                System.out.printf("|\t%-16s\t",jur);
                System.out.printf("|\t%-13s\t|",no_tlp);
                System.out.println();
                no++;
            }
            Connect.con.close();
            System.out.println("=================================================================================");
        }catch(SQLException e){
            System.out.println("Errornya : "+e);
        }

    }
}
