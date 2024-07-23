package proj02;

import java.sql.*;
import java.util.Scanner;

public class Output {

	ResultSet rs ;
	Scanner scan = new Scanner(System.in);
	
	public void show(Statement stmt) {
		try {
			rs = stmt.executeQuery("SELECT * FROM corona");
			while (rs.next()) {
				String visit = rs.getString("visit");
				String name = rs.getString("name");
				String number = rs.getString("number");
				System.out.println(visit + "  " + name + "  " + number);
			}
			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}
	
	
	public void search(Statement stmt) {
		try {

			
			System.out.print("검색할 성를 입력 하세요 : ");
			String na = scan.next();
			
			rs = stmt.executeQuery("select * from corona where name = '" + na + "%' ");
			

			while (rs.next()) {
					String visit = rs.getString("visit");
					String name = rs.getString("name");
					String number = rs.getString("number");
					System.out.println(visit + "  " + name + "  " + number);
				}

			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
