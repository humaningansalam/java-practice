package com.chap06;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex54 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		//Ű����� �̸��Է�(3��)
		
		System.out.println("�̸��������Է�");
		String source = scan.next();
		
		StringTokenizer st = new StringTokenizer(source, ",");
		
		System.out.println(st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}
	

}
