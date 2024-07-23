package com.chap02;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = new String[3];
		str[0] = "C";
		str[1] = "JAVA";
		str[2] = "python";
		
		for(int i=0; i<3; i++) {
			System.out.print(str[i]);
		}
		
		System.out.println();
		
		for(int i=0; i<str.length; i++) {
			System.out.print(str[i]);
		}


		System.out.println();
		
		for(String sstr: str) {
			System.out.println(sstr);
		}
	}

}
