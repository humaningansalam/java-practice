package p370;

import p367.Tire;
import p367.Hankook;
import p367.Kumho;

public class Car {
	
	Tire[] tires= {
			new Hankook(),
			new Hankook(),
			new Hankook(),
			new Hankook()
	};
	
	void run() {
		for(Tire tire : tires)	{
			tire.roll();
		}
		System.out.println();
	}
	

}
