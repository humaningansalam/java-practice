package project02;

import java.util.Scanner;

public class StudentDriver2 {

	Scanner scan = new Scanner(System.in);
	Student[] st = new Student[10];
	
	int maxscore = 0;
	int max = -1, min = 101; 
	double ave =0;
	int menu, count = 0;

	public StudentDriver2() {
		input();
		output();

	}
	
	void input() {
		while(maxscore<101) {
			st[count] = new Student();
			
			//�л� �̸� �Է�
			System.out.println("�л� �̸� �Է�:");
			st[count].stu = scan.next();
			
			
			//�л� ���� �Է�
			System.out.println("�л� ���� �Է�:");
			st[count].score = scan.nextInt();
			
			maxscore += st[count].score; 
			
			count++;
		}
		
		
	}
	
	void output() {
		for(int i=0; i<count; i++) {
			System.out.println(st[i].stu + "," + st[i].score + ","+ st[i].credit + "," +st[i].even);
		}
		
	}
}
