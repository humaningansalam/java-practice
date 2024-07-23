package project01;

import java.util.Scanner;

public class Stuinput {
	
	StudentInfo in;
	Scanner scan = new Scanner(System.in);
	
	public StudentInfo addStudend() {
		in = new StudentInfo();
		System.out.println("이름 입력 :");
		in.name = scan.next();
		System.out.println("나이 입력 :");
		in.age = scan.nextInt();
		
		return in;
	}

}
