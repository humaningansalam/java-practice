package t01;


import java.sql.*;

public class Drive {
	Connection con;
	Statement stmt;
	ResultSet rs;

	int menu;

	public Drive() throws SQLException {
		String url = "jdbc:mysql://localhost/testdb";
		String id = "root";
		String password = "1234";
		con = DriverManager.getConnection(url, id, password);
		stmt = con.createStatement();

		run();
	}

	void run() throws SQLException {
		for (;;) {
			menu = new Menu().menu();

			if (menu == 1) {
				new Input().addStuInfo(stmt);
				System.out.println();
			}
			if (menu == 2) {
				new Output().getStuInfo(stmt, rs);
				System.out.println();
			}
			if (menu == 3) {
				new Search().searchStuInfo(stmt, rs);
				System.out.println();
			}
			if(menu == 4) {
				new Update().updateStuInfo(stmt, rs);
				System.out.println();
			}
			if(menu == 5) {
				new Delete().deleteStuInfo(stmt, rs);
				System.out.println();
			}
			if (menu == 6) {
				rs.close();
				stmt.close();
				con.close();
				break;
			}
		}
	}
}
