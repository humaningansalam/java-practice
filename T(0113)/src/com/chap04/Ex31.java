package com.chap04;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "Hello.java";
		
		int index = fullName.indexOf('.');
		String fileName = fullName.substring(0, index);
		
		System.out.println(fileName);
		
		String str = fullName.substring(index + 1);
		System.out.println(str);

	}

}
