package t01;


import java.sql.*;
import java.util.*;

public class Search {
	Scanner scan = new Scanner(System.in);

	void searchStuInfo(Statement stmt, ResultSet rs) throws SQLException {
		int count = 0;
		
		System.out.print("검색할 학생 나이를 입력 하세요(20~100) : ");
		int age = scan.nextInt();
		
		rs = stmt.executeQuery("select * from student where age >= " + age + " order by age");
		
		if (20 <= age && age <= 100 && rs.next()) {
			while (rs.next()) {
				System.out.println("학생 이름 : " + rs.getString("name") + ", 학생 나이 : " + rs.getInt("age"));
				count++;
			}
		} else if (age < 20 || 100 < age) {
			System.out.println("나이는 20부터 100 사이로 입력해 주세요.");
		}
		else if(!rs.next()) {
			System.out.println("검색된 학생의 정보가 없습니다.");
		}
		
		rs.close();
	}
}
