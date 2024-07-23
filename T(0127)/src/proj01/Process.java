package proj01;

import java.util.*;
import java.sql.*;

public class Process {
	
	Scanner scan = new Scanner(System.in);
	
	Connection con;
	Statement stmt ;
	ResultSet rs;
	
	
	Process() throws SQLException{
		con = new Connect().mariadb();
		stmt = con.createStatement();
	}

	
	public void run() throws SQLException {
		for(;;) {
			System.out.println("1.입력 2.출력 3.종료");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				new Input(stmt);
			}
			
			if(menu == 2) {
				new Output().show(stmt, rs);
			}
			
			if(menu == 3) {
				break;
			}
		}

	}
	
}
