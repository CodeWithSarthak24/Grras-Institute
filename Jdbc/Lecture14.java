package Jdbc;

import java.sql.*;

// Callable Statement : DELETE

public class Lecture14 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            CallableStatement cs = con.prepareCall("{call deleteStudentDetail(?)}");

            cs.setInt(1, 179);

            int rowAffected = cs.executeUpdate();
            System.out.println("rowAffected = " +rowAffected);

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

delimiter //
create procedure deleteStudentDetail(
in Id int
)
begin
delete from T2 where Id = JobId;
end //
delimiter ;

drop procedure if exists  deleteStudentDetail;
 */