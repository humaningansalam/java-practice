package p242;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "���� �޸��ϴ�.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Car mycar = new Car();
	    mycar.speed = 60;
	    mycar.run();
	}

}
