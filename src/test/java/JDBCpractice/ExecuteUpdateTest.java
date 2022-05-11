package JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdateTest {
	@Test
public void executeUpdateTest() throws Throwable
{
		Connection con=null;
		try {
			//1. register the driver
			
			Driver dref= new Driver();
			
			DriverManager.registerDriver(dref);
			//step=2 connect to database
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","root");
			//step=3 create statement
			Statement stmt=con.createStatement();
			//step=4 Execute non select Query
			int result =stmt.executeUpdate(" insert into students_info (regno, firstname, middlename, lastname) values('14', 'ram','gowda', 'd');");
			if(result==1)
			{
				System.out.println("Data is added in database");
				
			}
			else
			{

				System.out.println("Data is not added in database");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
		con.close();
		}
			
		
}

}
