import java.sql.*;

public class Tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jdbc:mysql://localhost/testdb";
		String id = "root";
		String password = "1234";

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			Connection con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���Ἲ��");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		} catch (SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}

	}

}
