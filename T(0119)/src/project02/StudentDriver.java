package project02;

import java.util.Scanner;

public class StudentDriver {
	
	Scanner scan = new Scanner(System.in);
	Student[] st = new Student[10];
	
	int maxscore = 0;
	int max = -1, min = 101; 
	double ave =0;
	int menu, count = 0;
	
	
	public StudentDriver() {
		run();
	}

	
	void run() {
		for(;;) {

			menu = menu();
			
			if(menu==1) {
				st[count] = new Student();
				
				//�л� �̸� �Է�
				System.out.println("�л� �̸� �Է�:");
				st[count].stu = scan.next();
				
				
				//�л� ���� �Է�
				System.out.println("�л� ���� �Է�:");
				st[count].score = scan.nextInt();
				
				
				//����
				if(st[count].score>=90) {
					st[count].credit = "A";
				}
				else if(st[count].score<90 && st[count].score>=80) {
					st[count].credit = "B";
				}
				else {
					st[count].credit = "F";
				}
				
				//¦Ȧ
				if(st[count].score%2 ==0) {
					st[count].even = "¦";
				}
				else {
					st[count].even = "Ȧ";
				}
				
				count++;
			}
			
			if(menu==2) {
				for(int i=0; i<count; i++) {
					System.out.println(st[i].stu + "," + st[i].score + ","+ st[i].credit + "," +st[i].even);
				}
			}
			
			if(menu==3) {
				for(int i=0; i<count; i++) {
					//���հ�
					maxscore += st[i].score;             
					//�ִ밪
					if(max<st[i].score) max = st[i].score;
					//�ּڰ�
					min = (min>st[i].score) ? st[i].score : min;
					//��հ�
					ave = (maxscore-max)/(double)count;

				}
				System.out.println("�������� :" + maxscore);
				System.out.println("�ִ밪 : " + max +"�ּҰ� :" + min);
				System.out.println("��� :" + ave);
				break;
			}
		
		}
	}
	
	int menu() {
		System.out.println("�޴�����");
		System.out.println("1.�Է� 2.��� 3.����");
		int x = scan.nextInt();
		
		return x;
	}
}
