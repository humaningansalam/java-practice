package proj01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	String url = "jdbc:mariadb://192.168.0.100:12306/studb";
	String id = "root";
	String password = "1234";
	Connection con = null;
	
	Connection mariadb() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 적제 성공");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결성공");
		}
		catch(ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		}
		catch(SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}
		return con;
	}
	
}
