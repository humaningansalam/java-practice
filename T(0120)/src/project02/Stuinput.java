package project02;

import java.util.*;

public class Stuinput {
	
	Stuinfo in;
	Scanner scan = new Scanner(System.in);
	
	public Stuinfo listadd() {
		in = new Stuinfo();
		
		System.out.print("�л��̸��Է� :");
		in.name = scan.next();
		
		while(true) {
			System.out.print("�����Է�(20����� 100�����)");
			in.age = scan.nextInt();
			
			if(in.age>=20 && in.age<101) {
				break;
			}
			else {
				System.out.println("20����� 100������� �Է��ϼ���");
			}
		}

		return in;
	}

}
