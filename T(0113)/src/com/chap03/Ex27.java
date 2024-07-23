package com.chap03;

class Car{
	int num = 10;
	
	public Car() {
		System.out.println(num + "Car 생성자 시작");
	}
	
	void show() {
		System.out.println("Car");
	}
}

class RacingCar extends Car{
	public RacingCar() {
		System.out.println(num + "RacingCar 생성자 시작");
	}
}

class MiniCar extends RacingCar{
	public MiniCar() {
		System.out.println(num + "MiningCar 생성자 시작");
	}
}
public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MiniCar();
		/*
		new Car();
		System.out.println("-------------");
		new RacingCar();
		*/
	}

}
