package proj01;

import java.util.Scanner;
import java.sql.*;


public class input {
	Scanner scan = new Scanner(System.in);
	
	
	input(Statement statement){
		try {
			System.out.println("���̵�(����) �Է� : ");
			int id = scan.nextInt();
			System.out.println("�̸� �Է� : ");
			String name = scan.next();
			statement.executeUpdate("insert into person values("+id +", '" +name +"')");
			
		}
		catch(SQLException e){
			System.err.println(e.getMessage());
		}	

		
	}

}
