package Jdbc;

import java.sql.*;

// Callable Statement : SELECT

/* Imp: why I use 'IN'?

IN means "input".
You use IN when you want to give a value to the stored procedure.
-> DELIMITER does not change the SQL query. It only changes the ending symbol temporarily.
-> DELIMITER // temporarily changes the ending symbol from ; to //, and DELIMITER ; changes it back.
*/

public class Lecture16 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            CallableStatement cs = con.prepareCall("{call getStudentDetail()}");

            ResultSet rs = cs.executeQuery();

            while (rs.next()) {
                System.out.println("ID : " + rs.getInt("JobId") + "\n" + "Name : " + rs.getString("ProfileName"));
            }

            rs.close();
            cs.close();
            con.close();

        } catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}

/*

4. SELECT procedure

DELIMITER //

CREATE PROCEDURE getStudents()
BEGIN
    SELECT * FROM T1;
END //

DELIMITER ;

CALL getStudents();

 */