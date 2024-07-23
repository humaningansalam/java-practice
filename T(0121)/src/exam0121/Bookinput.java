package exam0121;

import java.util.Scanner;



public class Bookinput {

	Bookinfo in;
	Scanner scan = new Scanner(System.in);
	
	public Bookinfo bookadd() {
		in = new Bookinfo();
		
		System.out.print("도서이름입력 :");
		in.name = scan.next();
		
		while(true) {
			System.out.print("가격입력 :");
			in.price = scan.nextInt();
			
			if(in.price>=10000 && in.price<30000) {
				break;
			}
			else {
				System.out.println("10000원에서 30000원사이로 입력하세요");
			}
		}

		return in;
	}
}
