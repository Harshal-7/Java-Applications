import java.lang.*;
import java.sql.*;

public class JDBCdemo
{
    public static void main(String arg[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/marvellous","root","root");
            System.out.println("Connection Successfull!");

            Statement stat = conn.createStatement();

            int retult = stat.executeUpdate("CREATE TABLE My_table(Rollno INT, StudentName VARCHAR(255))");
            System.out.println("Table Created!");

            stat.close();
            conn.close();
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        catch(SQLException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}