package com.chap02;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,astu=0, fstu=0, stu =0;
		Scanner scan = new Scanner(System.in);
		

		for(;;) {
		    if(stu == 0){
		        System.out.print("ù��° �����Է��ϼ���(�����Ϸ��� �����Է�)");
		        a = scan.nextInt();
		    }
		    else{
			    System.out.print("������ �Է��ϼ���(�����Ϸ��� �����Է�) :");
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
		
		System.out.println("�л����� �� :" + stu);
		System.out.println("��� �л����� �� :" + astu);
		System.out.println("���� �л����� �� :" + fstu);
		
		/////////////////////////////////////////////
		int cnt=0, grade ,total = 0;
		
		System.out.print("ù��° �����Է��ϼ���(�����Ϸ��� �����Է�)");
		grade = scan.nextInt();
		
		while(grade > -1) {
			total++;
			if(grade > 59)cnt++;
			System.out.print("���������� �Է��ϼ��� :");
			grade = scan.nextInt();
		}
		
		System.out.println("�л����� �� :" + total);
		System.out.println("��� �л����� �� :" + cnt);
		System.out.println("���� �л����� �� :" + (total-cnt));
		
	}

}
