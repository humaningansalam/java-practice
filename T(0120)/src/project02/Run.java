package project02;

import java.util.*;

public class Run {
	Scanner scan = new Scanner(System.in);
	ArrayList<Stuinfo> list = new ArrayList<Stuinfo>();
	

	public Run() {
		process();
	}
	
	
	void process() {
		
		for(;;) {
			int menu = menu();
			
			if(menu == 1) {
				list.add(new Stuinput().listadd());
			}
			if(menu == 2) {
				new Stuoutput().show(list);
			}
			if(menu == 3) {
				new Stuoutput().search(list);
			}
	        if(menu == 4) {
				break;
			}
		}
		
	}
	
	int menu() {
		System.out.println("�л���� Ȯ�� ���α׷�");
		System.out.println("1.�Է� 2.��� 3.�˻� 4.����");
		
		int menu = scan.nextInt();
		return menu;
	}
	
	
}
