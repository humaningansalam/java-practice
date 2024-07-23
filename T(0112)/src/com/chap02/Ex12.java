package com.chap02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,astu=0, fstu=0, stu =0;
		Scanner scan = new Scanner(System.in);
		

		for(;;) {
		    if(stu == 0){
		        System.out.print("첫번째 점수입력하세요(종료하려면 음수입력)");
		        a = scan.nextInt();
		    }
		    else{
			    System.out.print("점수를 입력하세요(종료하려면 음수입력) :");
			    a = scan.nextInt();
			}
			
			if(a>0) {
				if(a>=60) {
					astu++;
				}
				else if(a<60) {
					fstu++;
				}
				stu++;
			}
			else if(a<0) {
				break;
			}
			
		}//for(;;) {
		
		System.out.println("학생들의 수 :" + stu);
		System.out.println("통과 학생들의 수 :" + astu);
		System.out.println("낙제 학생들의 수 :" + fstu);
		
		/////////////////////////////////////////////
		int cnt=0, grade ,total = 0;
		
		System.out.print("첫번째 점수입력하세요(종료하려면 음수입력)");
		grade = scan.nextInt();
		
		while(grade > -1) {
			total++;
			if(grade > 59)cnt++;
			System.out.print("다음점수를 입력하세요 :");
			grade = scan.nextInt();
		}
		
		System.out.println("학생들의 수 :" + total);
		System.out.println("통과 학생들의 수 :" + cnt);
		System.out.println("낙제 학생들의 수 :" + (total-cnt));
		
	}

}
