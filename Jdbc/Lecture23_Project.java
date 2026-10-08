package Jdbc;

// Project:

import java.sql.*;
import java.util.Scanner;

public class Lecture23_Project {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            Scanner sc = new Scanner(System.in);
            while (true) {

                System.out.println("SELECT OPERATION...");
                System.out.println("1: INSERT OPERATION...");
                System.out.println("2: UPDATE OPERATION...");
                System.out.println("3: DELETE OPERATION...");
                System.out.println("4: SELECT OPERATION...");

                int option =  sc.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("Enter Id");
                        int id = sc.nextInt();
                        sc.nextLine();

                        System.out.println("Enter Name");
                        String name = sc.nextLine();

                        System.out.println("Enter City");
                        String city = sc.nextLine();

                        String insertQuery = "insert into T1 values (?,?,?);";

                        PreparedStatement ps = con.prepareStatement(insertQuery);
                        ps.setInt(1, id);
                        ps.setString(2, name);
                        ps.setString(3,city);

                        int affectedRow = ps.executeUpdate();
                        System.out.println(affectedRow + " rows affected");
                        ps.close();
                        break;

                    case 2:
                            System.out.println("Enter Id");
                            int id1 = sc.nextInt();
                            sc.nextLine();

                            System.out.println("Enter Name");
                            String name1 = sc.nextLine();

                            System.out.println("Enter City");
                            String city1 = sc.nextLine();

                            String updateQuery = "update T1 set Name = ?, City = ? where Id = ?;";

                            PreparedStatement ps1 = con.prepareStatement(updateQuery);
                            ps1.setString(1, name1);
                            ps1.setString(2,city1);
                            ps1.setInt(3, id1);

                            int affectedRow1 = ps1.executeUpdate();
                            System.out.println(affectedRow1 + " rows affected");
                            ps1.close();
                            break;

                    case 3:
                                System.out.println("Enter Id");
                                int id2 = sc.nextInt();
                                sc.nextLine();

                        String deleteQuery = "delete from T1 where Id = ?;";

                        PreparedStatement ps2 = con.prepareStatement(deleteQuery);
                        ps2.setInt(1, id2);

                        int affectedRow2 = ps2.executeUpdate();
                        System.out.println(affectedRow2 + " rows affected");
                        ps2.close();
                        break;

                        case 4:

                            String selectQuery = "select * from T1;";

                            PreparedStatement ps3 = con.prepareStatement(selectQuery);

                            ResultSet rs = ps3.executeQuery();
                            while (rs.next()) {
                                System.out.println("Id :  " + rs.getInt("Id") + "\n" +
                                        "Name :  " + rs.getString("Name") + "\n" +
                                        "City :  " + rs.getString("City"));
                            }
                            ps3.close();
                            rs.close();
                            break;

                    default:
                             System.out.println("Invalid Input");
                             con.close();
                             sc.close();
                             break;
                }
            }

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}


