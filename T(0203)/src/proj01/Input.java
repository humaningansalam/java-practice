package proj01;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {

	Scanner scan = new Scanner(System.in);
	
	public Input(ArrayList<Student> list, Student stu){
		
		System.out.println("1.�к�  2.����  3.����");
		int se = scan.nextInt();
		System.out.println("�̸��Է�");
		String name = scan.next();
		System.out.println("�����Է�");
		String number = scan.next();
		if(se == 1) {
			
			System.out.println("���Ƹ��Է�");
			String circle = scan.next();
			
			stu = new Ustudent(name, number, circle);
			list.add(stu);
		}
		else if(se == 2) {
			stu = new Pstudentedu(name, number);
			list.add(stu);
		}
		else if(se == 3) {
			stu = new Pstudentres(name, number);
			list.add(stu);
		}
		
	}
}
