package Jdbc;

// Batch Processing using PreparedStatement

import java.sql.*;

public class Lecture22 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "insert into T1 values (?,?,?);";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1,10);
            ps.setString(2,"BatMan-X876");
            ps.setString(3,"USA");
            ps.addBatch();

            ps.setInt(1,11);
            ps.setString(2,"IronMan-X116");
            ps.setString(3,"CHINA");
            ps.addBatch();

            ps.setInt(1,12);
            ps.setString(2,"SuperMan-X816");
            ps.setString(3,"KOREAN");
            ps.addBatch();

            // Execute the batch
            int[] affectedRows = ps.executeBatch();

             // Print affected rows
            for (int rows : affectedRows) {
                System.out.println(rows + " row affected");
            }

            ps.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
