package proj01;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Db {

	Connection con;
	Statement stmt ;
	ResultSet rs ;
	
	
	public Db(){
		con = new Connect().mariadb(con);
		try {
			stmt = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	void gener(String senum) {
		try {

			stmt.executeUpdate("insert into tttoto(senum) values('" + senum + "')");
			stmt.close();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}

	
	void update(String senum, String date, String name, String number, String toto) {
		try {

			stmt.executeUpdate("update tttoto set name = '"+ name +"', number = '"+ number +"', date = '"+ date +"',  toto = '"+ toto +"' where senum = '" + senum + "' ");
			stmt.close();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	void delete(String senum) {
		try {

			stmt.executeUpdate("delete from tttoto where senum = '" + senum + "' ");
			stmt.close();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	void check(ArrayList<User> list, User user) {
		try {
			rs = stmt.executeQuery("SELECT * FROM tttoto");
			while (rs.next()) {
				String senum = rs.getString("senum");
				int find = 0;
				for(User tt : list) {
					if(senum.equals(tt.getSenum())) {
						System.out.println(tt.toString());
						find++;
						break;
					}

				}
				
				if (find == 0) {
					user = new User();
					
					user.setSenum(rs.getString("senum"));
					user.setDate(rs.getString("date"));
					user.setName(rs.getString("name"));
					user.setNumber(rs.getString("number"));
					user.setToto(rs.getString("toto"));
					
					list.add(user);
				}

			}
			
			rs.close();

		} 
		catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
