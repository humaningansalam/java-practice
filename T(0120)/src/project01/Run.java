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
				System.out.println("종료합니다");
				break;
			}
		}

	}
	
	
	int menu() {
		System.out.println("===\t코로나 출입명부 작성/조회 시스템\t===");
		System.out.println("1.방문자입력\t2.방문자출력\t3.방문자검색\t4.종료");
			
		int menu = scan.nextInt();

		return menu;
	}
	
	void agree() {
		System.out.println("개인정보 동의서가 필요합니다. 동의합니까 Y or N");
		String tmp = scan.next();
		
		if(tmp.equals("Y") || tmp.equals("y")) {
			System.out.println("환영합니다.");	
			list.add(new Listinput().listadd());
		}
		if(tmp.equals("N") || tmp.equals("n")) {
			System.out.println("방문이 제한됩니다.");
		}	
	}

}
