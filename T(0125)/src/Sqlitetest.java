import java.sql.*;

public class Sqlitetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			
			statement.executeUpdate("drop table if exists person");
			statement.executeUpdate("create table person (id integer, name String)");
			statement.executeUpdate("insert into person values(1, 'kim')");
			statement.executeUpdate("insert into person values(1, 'hanna')");
			ResultSet rs = statement.executeQuery("select * from person");
			while(rs.next()) {
				System.out.println("id = " + rs.getInt("id"));
				System.out.println("name = " + rs.getString("name"));
			}
			rs.close();
			connection.close();
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
