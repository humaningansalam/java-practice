import java.sql.*;
import java.util.Scanner;

public class Sqllitetest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
        Scanner scan = new Scanner(System.in);
        
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			
			//statement.executeUpdate("drop table if exists person");
			//statement.executeUpdate("create table person (id integer, name String)");
			
			
			for(int i=0; i<3; i++) {
				System.out.println("���̵� �Է� :");
			    int id = scan.nextInt();
			    System.out.println("�̸� �Է� :");
			    String name = scan.next();
			    statement.executeUpdate("insert into person values("+id+", '"+name +"')");
			}
			
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
