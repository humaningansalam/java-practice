package proj02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	String url = "jdbc:mariadb://shtestdb.duckdns.org:13306/coronadb";
	String id = "root";
	String password = "1234";
	
	Connection mariadb(Connection con) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("����̹� ���� ����");
			con = DriverManager.getConnection(url, id, password);
			System.out.println("�����ͺ��̽� ���Ἲ��");
		}
		catch(ClassNotFoundException e) {
			System.out.println("����̹��� ã�� �� �����ϴ�.");
		}
		catch(SQLException e) {
			System.out.println("���ῡ �����Ͽ����ϴ�.");
		}
		return con;
	}
	
}
