package project01;

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
		System.out.println("책이름 :" + super.getName() + "\n저자 :" + super.getWriter() +"\n가격 :" + super.getPrice());
	}

}
