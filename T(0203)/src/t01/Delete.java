package t01;

import java.sql.*;
import java.util.*;

public class Delete {
	Scanner scan = new Scanner(System.in);

	void deleteStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		System.out.print("삭제할 학생 이름을 입력 하세요 : ");
		String name = scan.next();

		rs = stmt.executeQuery("select * from student where name = '" + name + "'");

		if (rs.next()) {
			stmt.executeUpdate("delete from student where name = '" + name + "'");
		} else {
			System.out.println("삭제할 학생의 정보가 없습니다.");
		}
		
		rs.close();
	}
}
