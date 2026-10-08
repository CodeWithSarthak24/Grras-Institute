package Jdbc;

 import java.sql.*;

 // Retrieve Records Using PreparedStatement

public class Lecture10 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "select * from T1;";
            PreparedStatement p = con.prepareStatement(query);

            ResultSet rs = p.executeQuery();

            while (rs.next()) {
                System.out.println("Id : " + rs.getInt("Id") + "\n" +
                        "Name : " + rs.getString("Name") + "\n" +
                        "City : " + rs.getString("City"));
            }

            rs.close();
            p.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
