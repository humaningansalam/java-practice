package t01;


import java.sql.*;

public class Output {
	void getStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		rs = stmt.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println("�л� �̸� : " + rs.getString("name") + ", �л� ���� : " + rs.getInt("age"));
		}
		
		rs.close();
	}
}
