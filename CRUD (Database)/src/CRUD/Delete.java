package CRUD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.practice.Main;


public class Delete {

    static PreparedStatement statement;
    public static void deleteData(int stb){
        try{

            if (Main.cekStb(stb) == true ){

                Connect.connect();
                statement = Connect.con.prepareStatement("SELECT * FROM tb_mahasiswa WHERE stb ="+stb+"");
                ResultSet rs = statement.executeQuery();
                rs.next();
                System.out.println("\nData Mahasiswa yang anda akan hapus : ");
                System.out.println("=================================");
                System.out.println("STB\t\t\t\t: "+stb);
                System.out.println("Nama Mahasiswa\t: "+rs.getString("nama"));
                System.out.println("jurusan\t\t\t: "+rs.getString("jurusan"));
                System.out.println("No. Tlp\t\t\t: "+rs.getString("no_tlp"));

                boolean isTrue = Main.nextOrStop("Apakah Anda ingin Menghapus data tersebut");
                if (isTrue){

                    statement = Connect.con.prepareStatement("DELETE FROM tb_mahasiswa WHERE stb = "+stb+"");
                    statement.executeUpdate();
                    System.out.println("Data Berhasil Dihapus !!!\n");

                    View.viewData();
                }
            }else{
                System.out.println("\nMaaf STB tersebut belum terdaftar !");
            }
            Connect.con.close();

        }catch(SQLException e){
            System.out.println("Errornya : "+e);
        }
    }
}
