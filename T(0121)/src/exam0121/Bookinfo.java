package exam0121;

public class Bookinfo {
	
	public String name;
	public int price;
	
	public Bookinfo() {
	}
	
	public Bookinfo(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "도서이름:" + name + "\t도서가격:" + price;
	}
}
