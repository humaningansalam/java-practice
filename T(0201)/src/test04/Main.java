package test04;

class SuperObject{
	public void paint() {
		draw();
	}
	
	public void draw() {
		draw();
		System.out.println("Super Object");
	}
}


class SubObject extends SuperObject{
	public void paint() {
		super.draw();
	}
	
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperObject a = new SubObject();
		a.paint();
		

	}

}
