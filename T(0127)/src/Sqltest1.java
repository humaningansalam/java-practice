import java.sql.*;
import java.util.Scanner;

public class Sqltest1 {


	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String url = "jdbc:mariadb://192.168.0.100:12306/testdb";
		String id = "root";
		String password = "1234";
		
		Connection con = DriverManager.getConnection(url, id, password);
		
		Statement stmt = con.createStatement();
		
		System.out.println("아이디(숫자) 입력 : ");
		int idd = scan.nextInt();
		System.out.println("이름 입력 : ");
		String name = scan.next();
		stmt.executeUpdate("insert into test values("+idd +", '" +name +"')");
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM test");
		while(rs.next()) {
			int id2 = rs.getInt("id");
			String title = rs.getString("name");
			System.out.println(id2 + " " + title);
		}
		

	}

}
