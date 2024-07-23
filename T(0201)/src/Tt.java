import java.sql.*;

public class Tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost/testdb";
		String id = "root";
		String password = "1234";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 적제 성공");
			Connection con = DriverManager.getConnection(url, id, password);
			System.out.println("데이터베이스 연결성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("연결에 실패하였습니다.");
		}

	}

}
