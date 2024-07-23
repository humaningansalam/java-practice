import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Db {
	
	Connection connection = null;
    Scanner scan = new Scanner(System.in);
    Statement statement;
    ResultSet rs;
	public Db(){
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			statement = connection.createStatement();
			statement.executeUpdate("drop table if exists person");
			statement.executeUpdate("create table person (id integer, name string)");
			statement.close();
			connection.close();	
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}

	}
    
    void run() throws SQLException{
    	
    	 System.out.println("1.입력 2.출력 3.종료");
    	   int menu = scan.nextInt();
    	   for(;;) {
				if(menu == 1) {
					input();
				}
				
				if(menu == 2) {
					output();
				}
				if(menu == 3) {
					end();
					break;
				}
			}
    }
    
    
	void input() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			statement = connection.createStatement();
			System.out.println("아이디(숫자) 입력 : ");
			int id = scan.nextInt();
			System.out.println("이름 입력 : ");
			String name = scan.next();
			statement.executeUpdate("insert into person values("+id +", '" +name +"')");
			statement.close();
			connection.close();	
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}	

	}
	
	void output() {
		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from person");
			while(rs.next())
			{
				System.out.println("id = " + rs.getInt("id"));
				System.out.println("name = " + rs.getString("name"));
			}
			statement.close();
			connection.close();	
			rs.close();
		}catch(SQLException e){
			System.err.println(e.getMessage());
		}	
		
	}
	
	public void end() throws SQLException {
		scan.close();
		rs.close();
		connection.close();	
	}


}
