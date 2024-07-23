package com.chap01;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 12;
		
		if(a%3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		else {
			System.out.println("3의 배수가 아니다");
		}

		if(a%3 ==0) {
			System.out.println("3의 배수입니다.");
		}
		
		if(a%3 == 1) {
			System.out.println("3의 배수가 아니다");
		}
		
		if(a%3 != 1) {
			System.out.println("3의 배수가 아니다");
		}
		
		if(!(a%3 == 1)) {
			System.out.println("3의 배수가 아니다");
		}
		
	}

}
