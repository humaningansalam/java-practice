package proj02;

import java.util.Scanner;
import java.sql.*;

public class Delete {

	ResultSet rs;
	Scanner scan = new Scanner(System.in);
	
	public Delete(Statement stmt) {
		try {
			System.out.println("������ �̸��� �Է��ϼ���. ");
			String dename = scan.next();
			
			rs = stmt.executeQuery("delete FROM corona where name ='" +dename+"'");

			if (rs.next()) {
				stmt.executeUpdate("delete FROM corona where namee = '" + dename + "'");
			} else {
				System.out.println("������ �л��� ������ �����ϴ�.");
			}

			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
