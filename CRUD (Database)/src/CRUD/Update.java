package CRUD;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

    static PreparedStatement statement;
    public static void updateData(int stb, String nama, String jurusan, String no_tlp){

        try{
            Connect.connect();
            statement = Connect.con.prepareStatement("UPDATE tb_mahasiswa SET nama = '"+nama+"', jurusan = '"+jurusan+"'," +
                    " no_tlp = '"+no_tlp+"' WHERE stb = "+stb+"");
            statement.executeUpdate();

            Connect.con.close();
            System.out.println("Data Berhasil DiUbah !!!");
        }catch(SQLException e){
            System.out.println("Errornya : "+e);
        }

    }
}
