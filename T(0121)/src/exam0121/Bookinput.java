package exam0121;

import java.util.Scanner;



public class Bookinput {

	Bookinfo in;
	Scanner scan = new Scanner(System.in);
	
	public Bookinfo bookadd() {
		in = new Bookinfo();
		
		System.out.print("�����̸��Է� :");
		in.name = scan.next();
		
		while(true) {
			System.out.print("�����Է� :");
			in.price = scan.nextInt();
			
			if(in.price>=10000 && in.price<30000) {
				break;
			}
			else {
				System.out.println("10000������ 30000�����̷� �Է��ϼ���");
			}
		}

		return in;
	}
}
