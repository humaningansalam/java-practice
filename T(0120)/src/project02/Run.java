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
		System.out.println("학생목록 확인 프로그램");
		System.out.println("1.입력 2.출력 3.검색 4.종료");
		
		int menu = scan.nextInt();
		return menu;
	}
	
	
}
