package com.chap03;

import java.util.ArrayList;
import java.util.Scanner;

class Data26{
	String name;
	int age;
}

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Data26> list = new ArrayList<Data26>();
		int menu;
		Scanner scan = new Scanner(System.in);
		
		Data26 d;
		
		for(;;) {
			d = new Data26();
			System.out.println("�̸��Է�");
			d.name = scan.next();
			list.add(d);
		}
		
		/*
		d.name = "���ѳ�";
		d.age = 29;
		list.add(d);
		System.out.println(d.toString());
		
		d = new Data26();
		d.name = "�̵γ�";
		d.age = 34;
		list.add(d);
		System.out.println(d.toString());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		*/
	}

}
