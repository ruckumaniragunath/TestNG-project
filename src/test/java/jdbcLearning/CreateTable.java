package jdbcLearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class CreateTable {

	//@Test
	public void createDatabaseJDBC() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "root");
			Statement stmt = con.createStatement();
			stmt.execute("Create database Insurance");
			System.out.println("Database created successsfully");
		} catch (Exception e) {
			//System.out.println("Database not created successsfully");
		}

	}

	
	@Test
	public void createTableUsingJDBC() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306", "root", "root");
			Statement stmt = con.createStatement();
			stmt.execute("Use Insurance");
			//System.out.println("Database created successsfully");
			stmt.execute("CREATE TABLE Employees (\r\n"
					+ "    PersonID int,\r\n"
					+ "    LastName varchar(255),\r\n"
					+ "    FirstName varchar(255),\r\n"
					+ "    Address varchar(255),\r\n"
					+ "    City varchar(255),\r\n"
					+ "    Email varchar(255)\r\n"
					+ ");");
			
			stmt.execute("INSERT INTO Employees (PersonID, LastName, FirstName, Address, City, Email)\r\n"
					+ "VALUES (002, \"Pam\", \"Jack\", \"445, Folsom blvd\", \"Rancho\", \"mnop@gmail.com\");");
			
//					ResultSet result = stmt.executeQuery("select PersonID, LastName, FirstName, Address, City, Email from Employees");
//					
//					while(result.next()) {
//						int personID = result.getInt(1);
//						String LastName = result.getString(2);
//						String FirstName = result.getString(3);
//						String Email = result.getString(4);
//						
//						System.out.println(personID+":"+LastName+":"+FirstName+":"+":"+Email);
//					}
			
			
		} catch (Exception e) {
			//System.out.println("Database not created successsfully");
		}

	}
}
