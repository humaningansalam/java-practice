package t01;

import java.util.*;

public class Menu {
	Scanner scan = new Scanner(System.in);
	
	int menu(){
		int menu = 0;
		
		System.out.println("1. �л����� �Է�");
		System.out.println("2. �л����� ���");
		System.out.println("3. �л����� �˻�");
		System.out.println("4. �л����� ����");
		System.out.println("5. �л����� ����");
		System.out.println("6. ���α׷� ����");
		System.out.print("���� : ");
		menu = scan.nextInt();
		
		return menu;
	}
}
