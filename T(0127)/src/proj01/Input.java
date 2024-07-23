package proj01;

import java.sql.*;
import java.util.*;

public class Input {

	Scanner scan = new Scanner(System.in);

	Input(Statement stmt) {
		String id;
		int age;
		
		try {
			System.out.println("이름 입력 : ");
			id = scan.next();

			while(true) {
				System.out.println("나이 입력 : ");
				age = scan.nextInt();
				if(age >= 20 && age <=100) {
					break;
				}
				else {
					System.out.println("20 ~ 100 입력");
				}
			}
			stmt.executeUpdate("insert into student values(" + id + ", '" + age + "')");
		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
