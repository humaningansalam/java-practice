package proj01;

import java.util.Scanner;
import java.sql.*;


public class input {
	Scanner scan = new Scanner(System.in);
	
	
	input(Statement statement){
		try {
			System.out.println("아이디(숫자) 입력 : ");
			int id = scan.nextInt();
			System.out.println("이름 입력 : ");
			String name = scan.next();
			statement.executeUpdate("insert into person values("+id +", '" +name +"')");
			
		}
		catch(SQLException e){
			System.err.println(e.getMessage());
		}	

		
	}

}
