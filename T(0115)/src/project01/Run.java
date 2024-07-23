package project01;

import java.util.Scanner;

public class Run {
	
	Scanner scan = new Scanner(System.in);
	
	Mm admin = new Mm();
	Bb user = admin ;
    
	String name, writer, price;
	String a, b;
	
	String select() {
		String tmp;
		System.out.println("1.일반관리자 \t2.최종관리자 \t3.프로그램종료");
		tmp = input();
		return tmp;
	}
	
	String select2() {
		String tmp;
		System.out.println("1.추가 \t2.확인 \t3.관리자선택");
		tmp = input();
		return tmp;
	}
	
	String input() {
		String tmp;
		tmp = scan.next();
		return tmp;
	}
	
	void ininfo() {
		System.out.print("이름입력 :");
		name = input();
		System.out.print("저자입력 :");
		writer = input();
		System.out.print("가격입력 :");
		price = input();	
	}
	
	
	void run2() {
		
		for(;;) {
			b = select2();
			
			if(a.equals("1") && b.equals("1")) {
				ininfo();
				user.input(name, writer, price);
			}
			
			if(a.equals("2") && b.equals("1")) {
				ininfo();
				admin.input(name, writer, price);
			}

			if(a.equals("1") && b.equals("2")) {
				System.out.println("권한이 없습니다.");
			}
			
			if(a.equals("2") && b.equals("2")) {
				admin.output();
			}
			
			if(b.equals("3")){
				System.out.println("관리자 선택화면으로");
				break;
			}
		}

	}
	
	public Run() {
		for(;;) {
			a = select();
			if(a.equals("1") || a.equals("2")) {
				run2();
			}
			if(a.equals("3")) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
