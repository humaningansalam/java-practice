package project01;

import java.util.Scanner;

public class Pro02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int score1, score2, score3, sum;
		
		System.out.print("�̸� �Է�");
		name = scan.next();
		System.out.print("1.���� �Է�");
		score1  = scan.nextInt();
		System.out.print("2.���� �Է�");
		score2  = scan.nextInt();
		System.out.print("3.���� �Է�");
		score3  = scan.nextInt();
		
		sum = score1 + score2 + score3;
		
		System.out.println(name + "," + sum);
		

	}

}
