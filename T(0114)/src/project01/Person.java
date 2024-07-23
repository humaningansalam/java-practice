package project01;

public class Person {
	String name;
	private String add;
	private String number;
	
	public Person() {
		
	}
	
	public Person(String n) {
		this.name = n;
	}
	
    public String getAdd() {
    	return add;
    }
    
    public void setAdd(String n) {
    	this.add = n;
    }
    
    public String getNumber() {
    	return number;
    }
    
    public void setNumber(String n) {
    	this.number = n;
    }
}
