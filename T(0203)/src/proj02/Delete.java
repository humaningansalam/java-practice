package proj02;

import java.util.Scanner;
import java.sql.*;

public class Delete {

	ResultSet rs;
	Scanner scan = new Scanner(System.in);
	
	public Delete(Statement stmt) {
		try {
			System.out.println("삭제할 이름을 입력하세요. ");
			String dename = scan.next();
			
			rs = stmt.executeQuery("delete FROM corona where name ='" +dename+"'");

			if (rs.next()) {
				stmt.executeUpdate("delete FROM corona where namee = '" + dename + "'");
			} else {
				System.out.println("삭제할 학생의 정보가 없습니다.");
			}

			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
