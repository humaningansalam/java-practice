package project01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Listinput {
	
	Listinfo li = new Listinfo();
	Scanner scan = new Scanner(System.in);
	Date today  = new Date();
	SimpleDateFormat dateForm2 = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm��");
	
	public Listinfo listadd() {
		li = new Listinfo();
		li.date = dateForm2.format(today);
		
		System.out.print("�̸��Է� :");
		li.name = scan.next();
		System.out.print("��ȣ�Է� :");
		li.number = scan.next();
		
		return li;
	}

}
