package t01;


import java.sql.*;
import java.util.*;

public class Search {
	Scanner scan = new Scanner(System.in);

	void searchStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		int count = 0;
		
		System.out.print("�˻��� �л� ���̸� �Է� �ϼ���(20~100) : ");
		int age = scan.nextInt();
		
		rs = stmt.executeQuery("select * from student where age >= " + age + " order by age");
		
		if (20 <= age && age <= 100 && rs.next()) {
			while (rs.next()) {
				System.out.println("�л� �̸� : " + rs.getString("name") + ", �л� ���� : " + rs.getInt("age"));
				count++;
			}
		} else if (age < 20 || 100 < age) {
			System.out.println("���̴� 20���� 100 ���̷� �Է��� �ּ���.");
		}
		else if(!rs.next()) {
			System.out.println("�˻��� �л��� ������ �����ϴ�.");
		}
		
		rs.close();
	}
}
