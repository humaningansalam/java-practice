package project01;

import java.util.Scanner;

public class Pro04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int sum =0, score2, score3, val1 =-1, val2 = 100;
	    double val3;
		int score;
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".성적 입력");
			score = scan.nextInt();
			val1 = (val1<score) ? score : val1;
			sum += score;
		}

		System.out.println("최대값 :" + val1);
         
		val3 = (sum-val1)/2.0;
		System.out.println("평균값 :" + val3);
	

	}

}
