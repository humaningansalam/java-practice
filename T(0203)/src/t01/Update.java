package t01;

import java.sql.*;
import java.util.*;

public class Update {
	Scanner scan = new Scanner(System.in);

	void updateStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		System.out.print("������ �л� �̸��� �Է� �ϼ��� : ");
		String name = scan.next();
		
		rs = stmt.executeQuery("select * from student where name = '" + name +"'");
		
		if(rs.next()) {
			System.out.print("������ �л� �̸��� �Է� �ϼ��� : ");
			String name2 = scan.next();
			System.out.print("������ �л��� ���̸� �Է� �ϼ��� : ");
			String age = scan.next();

			stmt.executeUpdate("update student set name = '" + name2 + "', age = " + age + " where name = '" + name + "'");
		}
		else {
			System.out.println("�˻��� �л��� ������ �����ϴ�.");
		}
		
		rs.close();
	}
}
