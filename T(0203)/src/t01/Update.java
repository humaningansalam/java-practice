package t01;

import java.sql.*;
import java.util.*;

public class Update {
	Scanner scan = new Scanner(System.in);

	void updateStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		System.out.print("수정할 학생 이름을 입력 하세요 : ");
		String name = scan.next();
		
		rs = stmt.executeQuery("select * from student where name = '" + name +"'");
		
		if(rs.next()) {
			System.out.print("수정될 학생 이름을 입력 하세요 : ");
			String name2 = scan.next();
			System.out.print("수정될 학생의 나이를 입력 하세요 : ");
			String age = scan.next();

			stmt.executeUpdate("update student set name = '" + name2 + "', age = " + age + " where name = '" + name + "'");
		}
		else {
			System.out.println("검색된 학생의 정보가 없습니다.");
		}
		
		rs.close();
	}
}
