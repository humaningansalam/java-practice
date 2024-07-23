package project01;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Listinput {
	
	Listinfo li = new Listinfo();
	Scanner scan = new Scanner(System.in);
	Date today  = new Date();
	SimpleDateFormat dateForm2 = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
	
	public Listinfo listadd() {
		li = new Listinfo();
		li.date = dateForm2.format(today);
		
		System.out.print("이름입력 :");
		li.name = scan.next();
		System.out.print("번호입력 :");
		li.number = scan.next();
		
		return li;
	}

}
