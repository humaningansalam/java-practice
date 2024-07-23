package project01;

public class Bb {
	
	private String name;
	private String writer;
	private String price;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	void input(String name, String writer, String price) {
		this.setName(name);
		this.setWriter(writer);
		this.setPrice(price);
	}


}
