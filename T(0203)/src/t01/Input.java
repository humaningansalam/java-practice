package t01;

import java.sql.*;
import java.util.*;

public class Input {
	Scanner scan = new Scanner(System.in);
	
	void addStuInfo(Statement stmt) throws SQLException {
		System.out.print("학생 이름을 입력 하세요 : ");
		String name = scan.next();
		System.out.print("학생 나이를 입력하세요(20~100) : ");
		int age = scan.nextInt();
		
		if(20 <= age && age <= 100) {
			stmt.executeUpdate("insert into student values ('" + name + "', " + age + ")");
		}
		else if(age < 20 || 100 < age) {
			System.out.println("나이는 20부터 100 사이로 입력해 주세요.");
		}
	}
}
