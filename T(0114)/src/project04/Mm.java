package project04;

public class Mm extends Bb {
	
	/*
	@Override
	void input(String name, String writer, String price) {
		super.setName(name);
		super.setWriter(writer);
		super.setPrice(price);
		
	}
	*/
	
	void output() {
		System.out.println("å�̸� :" + getName() + "\n���� :" + this.getWriter() +"\n���� :" + super.getPrice());
	}

}
