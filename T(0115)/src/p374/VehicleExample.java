package p374;

public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();  ¾ÈµÊ
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
		

	}

}
