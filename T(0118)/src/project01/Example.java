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
				System.out.println("ù ��° ����(�����Ϸ��� ����)�� �Է��ϼ���");
			}
			else {
				System.out.println("���� ����(�����Ϸ��� ����)�� �Է��ϼ���");
			}
			
			b = scan.nextInt();
			
			if(b>=0) {
				if(b>=60) {
					astu += 1;
				}
				
				a += 1;
			}
			
			if(b<0) {
				System.out.println("�����մϴ�.");
				break;
			}
			
		}
		
		System.out.println("�л����� �� :" + a);
		System.out.println("����л����� �� :" + astu);
		System.out.println("�����л����� �� :" + (a-astu));
	}
	
}



public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Pass().run();
	}

}
