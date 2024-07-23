package project01;

import java.util.Scanner;

public class Pro03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int score, score2, score3, val1 =-1, val2 = 100;
		
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".성적 입력");
			score = scan.nextInt();
			val1 = (val1<score) ? score : val1;
			val2 = (val2>score) ? score : val2;
		}

		System.out.println("최대값 :" + val1);
		System.out.println("최소값 :" + val2);

	}

}
