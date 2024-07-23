//195, 201, 207

import java.util.Scanner;

class Student{
	String name;
	int number = -1;
	
	public Student() {
		System.out.println("생성자 시작");
	}
	
	void show() {
		System.out.println(name + "," + number);
	}
}

public class T11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scan = new Scanner(System.in);
		Student s1 = new Student();
		//System.out.println(s1);
		Student s2 = new Student();
		System.out.println(s2);
		
		s1.name = "이한나";
		s1.number = 29;
		s1.show();
		
		s1 = new Student();
		s1.show();
		
		s1 = new Student();
		
		//키보드 입력
		System.out.print("이름입력 :");
		s1.name = scan.next();
		System.out.print("나이입력 :");
		s1.number = scan.nextInt();
		
		s1.show();

	}

}
