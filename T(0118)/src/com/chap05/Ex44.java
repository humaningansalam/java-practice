package com.chap05;

interface iVehicle{
	void vShow();
}

interface iTest{
	void mShow();
}

class Car1 implements iVehicle, iTest{

	public void vShow() {
		System.out.println("v");
	}
	

	public void mShow() {
		System.out.println("m");
	}
}
public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 car1 = new Car1();
		car1.vShow();
		car1.mShow();

	}

}
