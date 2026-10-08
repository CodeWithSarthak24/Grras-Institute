package Jdbc;

// ResultSetMetaData

import java.sql.*;

public class Lecture19 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "select * from T2";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);
            ResultSetMetaData rsmd =  rs.getMetaData();

            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getColumnName(1));
          //  System.out.println(rsmd.getColumnType(2));
            System.out.println(rsmd.getColumnClassName(2));
            System.out.println(rsmd.getTableName(1));

            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
