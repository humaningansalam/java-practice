package t01;


import java.sql.*;

public class Output {
	void getStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		rs = stmt.executeQuery("select * from student");
		
		while(rs.next()) {
			System.out.println("학생 이름 : " + rs.getString("name") + ", 학생 나이 : " + rs.getInt("age"));
		}
		
		rs.close();
	}
}
