package project01;

import java.util.Scanner;

public class Pro10 {

	static String name;
	static int score;
	static int i=0;
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print((i+1) + "�� �л��̸��� �Է����ּ��� :" );
		name = scan.next();
		System.out.print((i+1) + "�� �л������� �Է����ּ��� :");
		score = scan.nextInt();
	}
	
	
	static void output() {
		input();
		System.out.println((i+1) + "�� �л� �̸� :" + name);
		System.out.println((i+1) + "�� �л� ���� :" + score + "��");
		i++;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output();
		output();
		output();

	}

}
