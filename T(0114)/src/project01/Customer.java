package project01;

public class Customer extends Person{

	private String cnumber;
	String mile;
	
	public Customer(String n) {
		this.name = n;
	}
	
    public String getcNumber() {
    	return cnumber;
    }
    
    public void setcNumber(String n) {
    	this.cnumber = n;
    }
}
