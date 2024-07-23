package proj01;

import java.util.Scanner;
import java.sql.*;


public class Run {
	
	Connection connection = null;
	Scanner scan = new Scanner(System.in);

	Statement statement;
    ResultSet rs;
    
    Run() throws SQLException{

		try {
			connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
			statement = connection.createStatement();
			

			rs = statement.executeQuery("select * from state");
			if(rs.getInt("st") == 1) {
				System.out.println("�Էµ� db���ֽ��ϴ�.");
			}
			else {
				System.out.println("�Էµ� db�������ϴ�.");
				statement.executeUpdate("drop table if exists person");
				statement.executeUpdate("create table person (id integer, name string)");
				statement.executeUpdate("create table state(st integer)");
				statement.executeUpdate("insert into state values("+1 +"");
			}
			
		}
		
		catch(SQLException e){
			statement.executeUpdate("create table state(st integer)");
			statement.executeUpdate("insert into state values("+1 +"");
		}	

		
    	
    }
    
    
    public void process() {
    	for(;;) {
    		System.out.println("1.�Է� 2.��� 3.����");
        	int menu = scan.nextInt();
        	
        	if(menu == 1) {
        		new input(statement);
        	}
        	
        	if(menu == 2) {
        		new output(statement, rs);
        	}
        	
        	if(menu == 3) {
        		break;
        	}
    	}

    }
    
    
    

}
