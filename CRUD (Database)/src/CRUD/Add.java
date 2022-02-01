package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Add {

    static PreparedStatement statement;

    public static void addData(int stb, String nama, String jurusan, String no_tlp){

        try {
            Connect.connect();
            statement = Connect.con.prepareStatement("insert into tb_mahasiswa (stb,nama,jurusan,no_tlp) values" +
                    " (" + stb + ",'" + nama + "','" + jurusan + "','" + no_tlp + "')");
            statement.executeUpdate();
            Connect.con.close();

            System.out.println("Data Berhasil Ditambahkan !!!");

        } catch (SQLException e) {
            System.out.println("Errornya : " + e);

        }


    }
}
