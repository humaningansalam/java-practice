package proj02;

import java.util.*;
import java.sql.*;

public class Process {
	
	Scanner scan = new Scanner(System.in);
	
	Connection con;
	Statement stmt ;
	
	
	Process() throws SQLException{
		con = new Connect().mariadb(con);
		stmt = con.createStatement();
	}

	
	public void run() throws SQLException {
		for(;;) {
			System.out.println("1.입력 2.출력 3.검색 4.삭제 5.종료");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				new Input(stmt);
			}
			
			if(menu == 2) {
				new Output().show(stmt);
			}
			
			if(menu == 3) {
				new Output().search(stmt);;
			}
			
			if(menu == 4) {
				new Delete(stmt);
			}

			if(menu == 5) {
				stmt.close();
				break;
			}
		}

	}
	
}
