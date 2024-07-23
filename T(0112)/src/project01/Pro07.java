package project01;

import java.util.Scanner;

public class Pro07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int sum =0, score2, score3, val1 =-1, val2 = 100;
	    double val3;
		int score ;
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".성적 입력");
			score = scan.nextInt();
			if(score >= 90) {
				System.out.println("A입니다.");
			}
			else if(score >= 80) {
				System.out.println("B입니다.");
			}
			else {
				System.out.println("F입니다.");
			}
			
		}
		
	}

}
