package com.chap01;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b, sum;
		int i,j;
		a = 10;
		b = 5;

		for(;;) {
			System.out.println("1.µ°º¿\t2.ª¨º¿\t3.¡æ∑·");
			i = scan.nextInt();
			
			if(i == 1) {
				System.out.println(a+b);
			}
			else if(i == 2) {
				System.out.println(a - b);
			}
			else if(i == 3) {
				System.out.println("¡æ∑·«’¥œ¥Ÿ.");
				break;
			}
			
		}

	}

}
