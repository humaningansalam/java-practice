class Ccar{
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public Ccar(){

	}
	
	public Ccar(String model){
        this(model, null, 0);
	}
	
	public Ccar(String model, String color){
        this(model, color, 0);
	}
	
	public Ccar(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}
	
	/*
	public Ccar(){
		System.out.println("Ccar()");
	}
	
	Ccar(String model){
		System.out.println("Ccar(String model)");
		this.model = model;
	}
	
	public Ccar(String model, String color){
		System.out.println("Ccar(String model, String color)");
		this.model = model;
		this.color = color;
	}
	
	Ccar(String model, String color, int maxspeed){
		System.out.println("Ccar(String model, String color, int maxspeed)");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxspeed;
	}
	*/
	
	void show(){
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
		System.out.println();
	}
}
public class T15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ccar ccar1 = new Ccar();
		ccar1.show();
		
		Ccar ccar2 = new Ccar("자가용");
		ccar2.show();
		
		Ccar ccar3 = new Ccar("자가용", "빨강");
		ccar3.show();
		
		Ccar ccar4 = new Ccar("택시", "검정", 200);
		ccar4.show();

	}

}
