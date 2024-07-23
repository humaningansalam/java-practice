package com.chap03;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car[] cars;
		cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
