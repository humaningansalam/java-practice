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
		System.out.println("1.�Ϲݰ����� \t2.���������� \t3.���α׷�����");
		tmp = input();
		return tmp;
	}
	
	String select2() {
		String tmp;
		System.out.println("1.�߰� \t2.Ȯ�� \t3.�����ڼ���");
		tmp = input();
		return tmp;
	}
	
	String input() {
		String tmp;
		tmp = scan.next();
		return tmp;
	}
	
	void ininfo() {
		System.out.print("�̸��Է� :");
		name = input();
		System.out.print("�����Է� :");
		writer = input();
		System.out.print("�����Է� :");
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
				System.out.println("������ �����ϴ�.");
			}
			
			if(a.equals("2") && b.equals("2")) {
				admin.output();
			}
			
			if(b.equals("3")){
				System.out.println("������ ����ȭ������");
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
				System.out.println("���α׷� ����");
				break;
			}
		}
	}

}
