package proj01;

import java.sql.*;
import java.util.*;

public class Input {

	Scanner scan = new Scanner(System.in);

	Input(Statement stmt) {
		String name;
		String number;

		try {
			System.out.println("�̸� �Է� : ");
			name = scan.next();

			System.out.println("��ȣ �Է� : ");
			number = scan.next();

			stmt.executeUpdate("insert into corona values(now(), '" + name + "', '" + number + "')");
			stmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
