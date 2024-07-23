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
		System.out.println("책이름 :" + getName() + "\n저자 :" + this.getWriter() +"\n가격 :" + super.getPrice());
	}

}
