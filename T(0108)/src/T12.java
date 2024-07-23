//195, 201, 207

import java.util.Scanner;

class Student2{
	String name;
	int number = -1;
	
	public Student2() {
		System.out.println("생성자 시작");
		input();
	}
	
	void show() {
		System.out.println(name + "," + number);
	}
	
	void input() {
	    Scanner scan = new Scanner(System.in);
		System.out.print("이름입력 :");
		name = scan.next();
		System.out.print("나이입력 :");
		number = scan.nextInt();
		show();
	}
}

public class T12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s1 = new Student2();

	}

}
