package proj01;

import java.sql.*;

public class Output {

	public void show(Statement stmt, ResultSet rs) {
		try {
			rs = stmt.executeQuery("SELECT * FROM test");
			while (rs.next()) {
				String id = rs.getString("id");
				int age = rs.getInt("age");
				System.out.println(id + "  " + age);
			}

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}
	
	
	public void search(Statement stmt, ResultSet rs) {
		try {
			rs = stmt.executeQuery("SELECT * FROM test");
			while (rs.next()) {
				String id = rs.getString("id");
				int age = rs.getInt("age");
				System.out.println(id + "  " + age);
			}

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
