package proj01;

import java.util.Scanner;
import java.sql.*;

public class Delete {

	ResultSet rs;
	Scanner scan = new Scanner(System.in);
	
	public void delete(Statement stmt) {
		try {
			System.out.println("������ �̸��� �Է��ϼ���. ");
			int dename = scan.nextInt();
			
			rs = stmt.executeQuery("delete * FROM corona where name ");
			while (rs.next()) {
				String name = rs.getString("name");
				String number = rs.getString("number");
				System.out.println(name + "  " + number);
			}
			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
