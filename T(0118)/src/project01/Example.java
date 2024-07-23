package project01;

import java.util.Scanner;

class Pass{
	Scanner scan = new Scanner(System.in);
	
	int a = 0;
	int b;
    int astu;
    
	void run() {
		
		for(;;) {
			if(a == 0) {
				System.out.println("첫 번째 점수(종료하려면 음수)를 입력하세요");
			}
			else {
				System.out.println("다음 정수(종료하려면 음수)를 입력하세요");
			}
			
			b = scan.nextInt();
			
			if(b>=0) {
				if(b>=60) {
					astu += 1;
				}
				
				a += 1;
			}
			
			if(b<0) {
				System.out.println("종료합니다.");
				break;
			}
			
		}
		
		System.out.println("학생들의 수 :" + a);
		System.out.println("통과학생들의 수 :" + astu);
		System.out.println("낙제학생들의 수 :" + (a-astu));
	}
	
}



public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Pass().run();
	}

}
