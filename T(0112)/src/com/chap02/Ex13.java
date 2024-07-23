package com.chap02;

import java.util.Scanner;


public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
		Scanner scan =new Scanner(System.in);
		
		name = scan.next();
		age = scan.nextInt();
		
		scan.close();
		
		System.out.println(name + "," + age);

	}

}
