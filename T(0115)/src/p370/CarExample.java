package p370;

import p367.Kumho;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car mycar = new Car();
		
		mycar.run();
		
		mycar.tires[0] = new Kumho();
		mycar.tires[1] = new Kumho();
		
		mycar.run();

	}

}
