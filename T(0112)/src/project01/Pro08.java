package project01;

import java.util.Scanner;

class Info8{
	int score;
}

class InfoDriver8{
	Info8[] in = new Info8[3];
	Scanner scan = new Scanner(System.in);
	
	public InfoDriver8() {
		in[0] = new Info8();
		in[1] = new Info8();
		in[2] = new Info8();
		
		input();
		output();
	}
	
	void input() {
		
		for(int i=0; i<in.length; i++) {
			System.out.print((i+1) + ".己利 涝仿");
			in[i].score = scan.nextInt();
		}
	}
	
	void output() {
		for(int i=0; i<in.length; i++) {
			System.out.print("\t" + (i+1) + ".己利 :" + in[i].score);
		}
	}
}

public class Pro08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        new InfoDriver8();
		/*
		Scanner scan = new Scanner(System.in);
		
		int sum =0, score2, score3, val1 =-1, val2 = 100;
	    double val3;
		int[] score  = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.print((i+1) + ".己利 涝仿");
			score[i] = scan.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			System.out.print("\t" + (i+1) + ".己利 :" + score[i]);
		}
        */
	}

}
