package proj01;

import java.util.Scanner;
import java.sql.*;

public class output {
	Scanner scan = new Scanner(System.in);
	
	output(Statement statement, ResultSet rs){
		try {
			rs = statement.executeQuery("select * from person");
			while(rs.next())
			{
				System.out.println("id = " + rs.getInt("id"));
				System.out.println("name = " + rs.getString("name"));
			}
			rs.close();
		}
		catch(SQLException e){
			System.err.println(e.getMessage());
		}	
	}
	
}
