package Jdbc;

// DatabaseMetaData

import java.sql.*;

public class Lecture18 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

           DatabaseMetaData metaData = con.getMetaData();

            System.out.println(metaData.getDatabaseProductName());
            System.out.println(metaData.getDatabaseProductVersion());
            System.out.println(metaData.getDriverName());
            System.out.println(metaData.getDriverVersion());
            System.out.println(metaData.getDriverMajorVersion());
            System.out.println(metaData.getDriverMinorVersion());
            System.out.println(metaData.getUserName());
            System.out.println(metaData.getConnection());
            System.out.println(metaData.getURL());

            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
