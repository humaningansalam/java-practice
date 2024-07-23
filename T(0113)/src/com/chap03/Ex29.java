package com.chap03;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		Car car2 = new Car();
		
		
		Car car3;
		car3 = car1;
		
		boolean b1 = car1.equals(car2);
		boolean b2 = car1.equals(car3);
		System.out.println(b1);
		System.out.println(b2);

	}

}
