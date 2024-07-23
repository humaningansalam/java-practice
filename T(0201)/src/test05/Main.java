package test05;


public class Main {
	
	int color;
	String strColor;
	
	void setColor(int color) {
		this.color = color;
	}
	
	void setColor(String color) {
		this.strColor = color;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main ole = new Main();
		ole.setColor(20);
		ole.setColor("Red");
		
		System.out.println("ÄÃ·¯:" + ole.color + "," + ole.strColor);
	}

}
