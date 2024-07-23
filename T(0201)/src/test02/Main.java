package test02;

class Circle{
	int radius;
	String name;
	
	double getArea() {
		return radius*radius*3.14;
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle pizza;
		pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);

	}

}
