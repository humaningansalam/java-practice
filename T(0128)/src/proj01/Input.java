package proj01;

import java.sql.*;
import java.util.*;

public class Input {

	Scanner scan = new Scanner(System.in);

	Input(Statement stmt) {
		String name;
		String number;

		try {
			System.out.println("이름 입력 : ");
			name = scan.next();

			System.out.println("번호 입력 : ");
			number = scan.next();

			stmt.executeUpdate("insert into corona values(now(), '" + name + "', '" + number + "')");
			stmt.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

}
