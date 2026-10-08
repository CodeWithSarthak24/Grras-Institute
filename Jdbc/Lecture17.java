package Jdbc;

import java.sql.*;

/* Callable Statement : Multiple SQL query

delimiter //
create procedure multipleStudentDetail()
begin
insert into T2 values (0871,'Agile');
update T2 set ProfileName = 'Full Stack' where JobId = 0871;
delete from T2 where JobId = 1781;
select * from T2;
end //
delimiter ;

 */

public class Lecture17 {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Lecture1","root","BackendJEE#1");

            CallableStatement cs = con.prepareCall("{call multipleStudentDetail()}");

            boolean result = cs.execute();

            if (result) {

                ResultSet rs = cs.getResultSet();

                while (rs.next()) {
                    System.out.println(
                            "ID : " + rs.getInt("JobId") + "\n" +  "Name : " + rs.getString("ProfileName"));
                }
                rs.close();
            }

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

DELIMITER //

CREATE PROCEDURE studentOperations()
BEGIN
    INSERT INTO T1 VALUES (105, 'Sarthak', 'Bhopal');

    UPDATE T1
    SET City = 'Delhi'
    WHERE Id = 105;

    SELECT * FROM T1;

    DELETE FROM T1
    WHERE Id = 105;
END //

DELIMITER ;

 */

/*

CallableStatement cs =
        con.prepareCall("{call studentOperations()}");

boolean result = cs.execute();

if (result) {
    ResultSet rs = cs.getResultSet();

    while (rs.next()) {
        System.out.println(
                "Id: " + rs.getInt("Id") +
                ", Name: " + rs.getString("Name") +
                ", City: " + rs.getString("City")
        );
    }

    rs.close();
}

cs.close();
con.close();

 */