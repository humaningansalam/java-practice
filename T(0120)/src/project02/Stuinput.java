package project02;

import java.util.*;

public class Stuinput {
	
	Stuinfo in;
	Scanner scan = new Scanner(System.in);
	
	public Stuinfo listadd() {
		in = new Stuinfo();
		
		System.out.print("학생이름입력 :");
		in.name = scan.next();
		
		while(true) {
			System.out.print("나이입력(20살부터 100살까지)");
			in.age = scan.nextInt();
			
			if(in.age>=20 && in.age<101) {
				break;
			}
			else {
				System.out.println("20살부터 100살안으로 입력하세요");
			}
		}

		return in;
	}

}
