package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connect {

    public static Connection con;
    static PreparedStatement statement;

    public static void connect(){

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbt_mahasiswa", "root", "123456789");

        }catch(ClassNotFoundException es){
            System.out.println("Errornya : "+es);
        }catch(SQLException es){
            System.out.println("Errornya : "+es);
        }
    }

}
