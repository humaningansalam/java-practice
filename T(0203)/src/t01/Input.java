package t01;

import java.sql.*;
import java.util.*;

public class Input {
	Scanner scan = new Scanner(System.in);
	
	void addStuInfo(Statement stmt) throws SQLException {
		System.out.print("�л� �̸��� �Է� �ϼ��� : ");
		String name = scan.next();
		System.out.print("�л� ���̸� �Է��ϼ���(20~100) : ");
		int age = scan.nextInt();
		
		if(20 <= age && age <= 100) {
			stmt.executeUpdate("insert into student values ('" + name + "', " + age + ")");
		}
		else if(age < 20 || 100 < age) {
			System.out.println("���̴� 20���� 100 ���̷� �Է��� �ּ���.");
		}
	}
}
