package Jdbc;

// Transaction Management

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Lecture24 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            con.setAutoCommit(false);

            String query = "insert into T1 values (?,?,?);";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1,99);
            ps.setString(2,"Mirza");
            ps.setString(3,"Jaipur");

            int row1 = ps.executeUpdate();

            ps.setInt(1,100);
            ps.setString(2,"Advika");
            ps.setString(3,"Jaipur");


            int row2 = ps.executeUpdate();

            if(row1 >= 1 && row2 >= 1){
                con.commit();
                System.out.println("Row added successfully");
            }else{
                con.rollback();
                System.out.println("Row rolled back successfully");
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

/*

setAutoCommit(false)
        ↓
INSERT 1 → executeUpdate()
        ↓
INSERT 2 → executeUpdate()
        ↓
Everything successful?
     ↙          ↘
   YES           NO
    ↓             ↓
 commit()      rollback()
    ↓             ↓
 SAVE           UNDO

 */