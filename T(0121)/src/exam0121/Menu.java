package exam0121;

import java.util.Scanner;;

public class Menu {
    
	Scanner scan = new Scanner(System.in);
	
	public int mainmenu() {
		System.out.println("=======  ������� Ȯ�� ���α׷� =======");
		System.out.println("1.�����Է�  2.�������  3.�����˻�  4.����");
		
		int menu = scan.nextInt();
		return menu;
	}
	
	public void exit() {
		System.out.println("�����մϴ�.");
	}
	
	public void err() {
		System.out.println("�˼������ϴ�.");
	}
}
