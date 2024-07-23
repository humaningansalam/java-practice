package com.chap02;

public class Ex17 {

	static int getNum(int a) {
		return a;
	}
	
	static int getNum(int a, int b) {
		return a + b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//오버로딩
		int c = getNum(3,4);
		System.out.println(c);
		
	}

}
