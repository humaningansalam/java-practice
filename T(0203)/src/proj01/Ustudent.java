package proj01;

public class Ustudent extends Student{
	
	private String circle;
	

	public Ustudent(String name, String number, String circle) {
		super("stu", name, number);
		this.circle = circle;
	}

	
	public String getCircle() {
		return circle;
	}



	public void setCircle(String circle) {
		this.circle = circle;
	}


	
	
	public String toString() {
		return super.toString() + " µ¿¾Æ¸®:" + this.getCircle();
	}
}