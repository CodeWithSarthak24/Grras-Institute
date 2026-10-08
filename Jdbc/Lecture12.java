package Jdbc;

import java.sql.*;
import java.util.Scanner;

// PreparedStatement using while loop

public class Lecture12 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            String query = "insert into T1 values(?,?,?)";
            PreparedStatement p = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            while (true) {

                System.out.println("Fill the information..........");

                System.out.println("Enter ID ");
                int Id = sc.nextInt();

                sc.nextLine(); // consume leftover Enter

                System.out.println("Enter Name ");
                String Name = sc.nextLine();


                System.out.println("Enter City ");
                String City = sc.nextLine();

                p.setInt(1,Id);
                p.setString(2,Name);
                p.setString(3,City);

                int affectedRows = p.executeUpdate();
                System.out.println(affectedRows+" rows affected");

                System.out.println("If you want to insert more : Yes/No...");

                String output = sc.next();

                if (output.equalsIgnoreCase("no")){
                    break;
                }
            }

            p.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
