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
				
				//학생 이름 입력
				System.out.println("학생 이름 입력:");
				st[count].stu = scan.next();
				
				
				//학생 성적 입력
				System.out.println("학생 성적 입력:");
				st[count].score = scan.nextInt();
				
				
				//학점
				if(st[count].score>=90) {
					st[count].credit = "A";
				}
				else if(st[count].score<90 && st[count].score>=80) {
					st[count].credit = "B";
				}
				else {
					st[count].credit = "F";
				}
				
				//짝홀
				if(st[count].score%2 ==0) {
					st[count].even = "짝";
				}
				else {
					st[count].even = "홀";
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
					//총합값
					maxscore += st[i].score;             
					//최대값
					if(max<st[i].score) max = st[i].score;
					//최솟값
					min = (min>st[i].score) ? st[i].score : min;
					//평균값
					ave = (maxscore-max)/(double)count;

				}
				System.out.println("성적총합 :" + maxscore);
				System.out.println("최대값 : " + max +"최소값 :" + min);
				System.out.println("평균 :" + ave);
				break;
			}
		
		}
	}
	
	int menu() {
		System.out.println("메뉴선택");
		System.out.println("1.입력 2.출력 3.종료");
		int x = scan.nextInt();
		
		return x;
	}
}
