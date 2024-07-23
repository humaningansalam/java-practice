import java.sql.*;
import java.util.Scanner;

public class Sqllitetest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection connection = null;
        Scanner scan = new Scanner(System.in);
     
		
        System.out.println("입력");
        int menu = scan.nextInt();
        
       
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from person");
			//statement.executeUpdate("drop table if exists person");
			//statement.executeUpdate("create table person (id integer, name String)");
			
			for(;;) {
				if(menu == 1) {
					for(int i=0; i<3; i++) {
						System.out.println("아이디 입력 :");
					    int id = scan.nextInt();
					    System.out.println("이름 입력 :");
					    String name = scan.next();
					    statement.executeUpdate("insert into person values("+id+", '"+name +"')");
					}
				}
				
				if(menu == 2) {
					while(rs.next()) {
						System.out.println("id = " + rs.getInt("id"));
						System.out.println("name = " + rs.getString("name"));
					}
					rs.close();
				}
				
				if(menu == 3) {
					break;
				}
			}
			
			connection.close();
		}
		
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
