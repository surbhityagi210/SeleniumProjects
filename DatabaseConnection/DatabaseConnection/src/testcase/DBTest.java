package testcase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DBTest {
	static Connection con = null;
	public static Statement stmt;

	@BeforeMethod
	public void setup() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Driver loaded");

		con = DriverManager.getConnection("jdbc:sqlserver://192.168.1.12;databaseName=FoodFinder_Test", "pds", "@pds");
		System.out.println("DB Connected");

		stmt = con.createStatement();

	}

	@Test
	public void test() throws ClassNotFoundException, SQLException {
		String query = "Select FirstName, LastName from SA_Users";
		ResultSet res = stmt.executeQuery(query);
		while (res.next()) {
			System.out.print(res.getString(1));
			System.out.println("\t" + res.getString(2));
			/*System.out.print("\t" + res.getString(3));
			System.out.println("\t" + res.getString(4));*/
		}

	}
	@AfterMethod
	public void teardown() throws SQLException
	{
		if(con!=null)
		{
			con.close();
		}
	}

}
