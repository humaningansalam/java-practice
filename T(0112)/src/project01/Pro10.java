package project01;

import java.util.Scanner;

public class Pro10 {

	static String name;
	static int score;
	static int i=0;
	
	static void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print((i+1) + "번 학생이름을 입력해주세요 :" );
		name = scan.next();
		System.out.print((i+1) + "번 학생점수를 입력해주세요 :");
		score = scan.nextInt();
	}
	
	
	static void output() {
		input();
		System.out.println((i+1) + "번 학생 이름 :" + name);
		System.out.println((i+1) + "번 학생 점수 :" + score + "점");
		i++;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		output();
		output();
		output();

	}

}
