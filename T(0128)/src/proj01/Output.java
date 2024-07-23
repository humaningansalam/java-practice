package proj01;

import java.sql.*;

public class Output {

	ResultSet rs ;
	
	public void show(Statement stmt) {
		try {
			rs = stmt.executeQuery("SELECT * FROM corona");
			while (rs.next()) {
				String visit = rs.getString("visit");
				String name = rs.getString("name");
				String number = rs.getString("number");
				System.out.println(visit + "  " + name + "  " + number);
			}
			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}
	
	
	public void search(Statement stmt) {
		try {
			rs = stmt.executeQuery("SELECT * FROM corona");
			while (rs.next()) {
				String name = rs.getString("name");
				String number = rs.getString("number");
				System.out.println(name + "  " + number);
			}
			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
