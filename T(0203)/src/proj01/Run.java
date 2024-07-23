package proj01;

import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	
	Scanner scan = new Scanner(System.in);
	ArrayList<Student> list = new ArrayList<Student>();
	Student stu ;

	public Run() {
		
		process();		
		
	}
	
	
	void process() {

		for(;;) {
			int menu = menu();
			
			if(menu == 1) {
				new Input(list, stu);
			}
			
			if(menu == 2) {
				new Output(list);
			}
			
			if(menu == 3) {
				System.out.println("종료");
				break;
			}
		}
		
	}
	
	
	int menu() {
		System.out.println("1.입력  2.출력  3.종료");
		int menu = scan.nextInt();
		return menu;
	}
	
	
}
