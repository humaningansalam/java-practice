package com.chap06;

import java.util.StringTokenizer;

public class Ex56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "���� �״븦 �������� �����ϰų� �뿩������.";
		
		StringTokenizer st = new StringTokenizer(str, " ");
		
		System.out.println("space �?? "+ st.countTokens());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
