package project01;

import java.util.*;

public class Run {
	Scanner scan = new Scanner(System.in);
	ArrayList<Listinfo> list = new ArrayList<Listinfo>();
	
	public Run() {
		
		process();
		
	}
	
	void process() {
		for(;;) {
			int menu = menu();
			
			if(menu == 1) {
				agree();
			}
			else if(menu == 2) {
				new Listoutput().show(list);
			}
			else if(menu == 3) {
				new Listoutput().search(list);
			}
			else if(menu == 4) {
				System.out.println("�����մϴ�");
				break;
			}
		}

	}
	
	
	int menu() {
		System.out.println("===\t�ڷγ� ���Ը�� �ۼ�/��ȸ �ý���\t===");
		System.out.println("1.�湮���Է�\t2.�湮�����\t3.�湮�ڰ˻�\t4.����");
			
		int menu = scan.nextInt();

		return menu;
	}
	
	void agree() {
		System.out.println("�������� ���Ǽ��� �ʿ��մϴ�. �����մϱ� Y or N");
		String tmp = scan.next();
		
		if(tmp.equals("Y") || tmp.equals("y")) {
			System.out.println("ȯ���մϴ�.");	
			list.add(new Listinput().listadd());
		}
		if(tmp.equals("N") || tmp.equals("n")) {
			System.out.println("�湮�� ���ѵ˴ϴ�.");
		}	
	}

}
