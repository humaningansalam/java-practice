package project01;

import java.util.Scanner;

public class Stuinput {
	
	StudentInfo in;
	Scanner scan = new Scanner(System.in);
	
	public StudentInfo addStudend() {
		in = new StudentInfo();
		System.out.println("�̸� �Է� :");
		in.name = scan.next();
		System.out.println("���� �Է� :");
		in.age = scan.nextInt();
		
		return in;
	}

}
