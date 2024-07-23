package project01;

import java.util.Scanner;

public class Pro02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		String name;
		int score1, score2, score3, sum;
		
		System.out.print("이름 입력");
		name = scan.next();
		System.out.print("1.성적 입력");
		score1  = scan.nextInt();
		System.out.print("2.성적 입력");
		score2  = scan.nextInt();
		System.out.print("3.성적 입력");
		score3  = scan.nextInt();
		
		sum = score1 + score2 + score3;
		
		System.out.println(name + "," + sum);
		

	}

}
