package t01;

import java.sql.*;
import java.util.*;

public class Delete {
	Scanner scan = new Scanner(System.in);

	void deleteStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		System.out.print("������ �л� �̸��� �Է� �ϼ��� : ");
		String name = scan.next();

		rs = stmt.executeQuery("select * from student where name = '" + name + "'");

		if (rs.next()) {
			stmt.executeUpdate("delete from student where name = '" + name + "'");
		} else {
			System.out.println("������ �л��� ������ �����ϴ�.");
		}
		
		rs.close();
	}
}
