//195, 201, 207

import java.util.Scanner;

class Student2{
	String name;
	int number = -1;
	
	public Student2() {
		System.out.println("������ ����");
		input();
	}
	
	void show() {
		System.out.println(name + "," + number);
	}
	
	void input() {
	    Scanner scan = new Scanner(System.in);
		System.out.print("�̸��Է� :");
		name = scan.next();
		System.out.print("�����Է� :");
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
