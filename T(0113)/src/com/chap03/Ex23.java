package com.chap03;
import java.util.Scanner;

class Stu23{
	String id;
	String pwd;
}

class Driver{
	Stu23[] s = new Stu23[3];
	Scanner scan = new Scanner(System.in);

	int a;
	int count = 0;
	
	void run() {
		for(;;) {
			System.out.println("1.�����Է�");
			System.out.println("2.�������");
			System.out.println("3.���α׷� ����");
			a=scan.nextInt();
			
			if(a == 1) input();
			if(a == 2) output();
			if(a == 3) break;
		}
	}
	
		
	void input() {
		s[count] = new Stu23();
		System.out.println("���̵� �Է�");
		s[count].id = scan.next();
		System.out.println("��й�ȣ �Է�");
		s[count].pwd = scan.next();
		count ++;
	}
	
	void output() {
		if(count == 0) {
			System.out.println("�Էµ� ���� �����ϴ�.");
		}
		for(int i=0; i<count; i++) {
			System.out.println(s[i].id + "," + s[i].pwd);
		}
	}
	
	
	
	
}
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		new Driver().run();
		
	
	}

}
