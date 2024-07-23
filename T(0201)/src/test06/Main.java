package test06;

class Bicycle{
	int id;
	String brand;
	
	public Bicycle(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
	

}
public class Main extends Bicycle{
	
	int wheelSize;
	
	public void prtInfo() {
		System.out.println("brand :" + super.brand);
		System.out.println("wheelSize :" + this.wheelSize);
	}

	public Main(int id, String brand) {
		super(id, brand);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Main mv = new Main(201210, "hanna");
		mv.wheelSize = 20;
		mv.prtInfo();
	}

}
