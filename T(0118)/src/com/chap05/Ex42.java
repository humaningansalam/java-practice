package com.chap05;

class Car{
	public Car() {
		System.out.println("Car ������");
	}
	
    public Car(int x) {
    	this();
    	System.out.println(x + "Car������");
    }
}

class RacingCar extends Car{
	public RacingCar() {
		super(1);
		System.out.println("RacingCar ������");
	}
}
public class Ex42 {

	public static void main(String[] args) {
		
		Car[] c = new Car[2];
		RacingCar r = new RacingCar();
		

		c[0] = new Car();
		c[1] = new RacingCar();
		
		for(int i=0; i<c.length; i++) {
			System.out.println(c[i]);
		}
	}

}
