package project01;

import java.util.Scanner;

public class Pro06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int sum =0, score2, score3, val1 =-1, val2 = 100;
	    double val3;
		int score ;
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".���� �Է�");
			score = scan.nextInt();
			if(score%2 == 0) System.out.println("¦���Դϴ�.");
			if(score%2 == 1) System.out.println("Ȧ���Դϴ�.");
		}
		
		
		
	}

}
