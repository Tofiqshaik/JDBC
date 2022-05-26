package JDBCPACK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc {
public static void main(String[] args) throws SQLException, ClassNotFoundException {
	Scanner sc = new Scanner(System.in);
	

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_prc", "root", "root");
		Statement statement =  con.createStatement();
		boolean b = statement.execute("SELECT * FROM  EMP");
		
		if (b) {
			 ResultSet resultSet = statement.getResultSet();
			 while(resultSet.next()) {
			 System.out.println(resultSet.getInt(1));
			 System.out.println(resultSet.getString(2));
			 
		}
			 resultSet.close();
		
		
	}
		statement.close();
		con.close();
}
}
