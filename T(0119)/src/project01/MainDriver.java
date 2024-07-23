package project01;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDriver {

	ArrayList<StudentInfo> list = new ArrayList<StudentInfo>();
	
	public MainDriver(){
		run();
	}
	
	void run() {
		for(;;) {
			int menu = menu();
			if(menu == 1) {
				list.add(new Stuinput().addStudend());
			}
			if(menu == 2) {
				new Stuoutput().show(list);
				
			}
			if(menu == 3) {
				new Studele().show(list);
			}
			if(menu == 4) {
				break;
			}
		}
	}
	
	int menu() {
		System.out.println("1번 입력 \t2번출력 \t3번삭제 \t4번종료");
		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		return menu;
	}

}
