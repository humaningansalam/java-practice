package project02;

public class Book {
	String name;
	private String page;
	String author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}
	
	

}
