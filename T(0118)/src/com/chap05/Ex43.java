package com.chap05;

abstract class Vehicle{
	protected int speed;
	abstract void show();
	
}

class MiniCar extends Vehicle{
	public void show() {
		speed = 10;
		System.out.println("속도 :" + speed);
	}
}

class Plane extends Vehicle{
	public void show() {
		speed = 20;
		System.out.println("속도 :" + speed);
	}
}
public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car = new MiniCar();
		Vehicle plane = new Plane();
		
		car.show();
		plane.show();
		
		Vehicle[] v = new Vehicle[2];
		
		v[0] = new MiniCar();
		v[1] = new Plane();
		
		for(int i=0; i<v.length; i++) {
			v[i].show();
		}
	}

}
