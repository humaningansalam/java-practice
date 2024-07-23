package t0111;
import java.util.Scanner;

class Student{
	private String name;
	private String number;
	private String department;
	
	public String getName(){
		return name;
	}	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getDepar() {
		return department;
	}
	public void setDepar(String department) {
		this.department = department;
	}
	
	public String toString(){
		return (name + "," + number + "," + department);
	}
}


public class T5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new StudentDriver();
		Student st1, st2;
		st1 = new Student();
		
		st1.setName("°©µ¹");
		st1.setNumber("123124");
		st1.setDepar("300");
		System.out.println(st1.toString());
		
		st2 = new Student();
		
		st2.setName("µ¹°©");
		st2.setNumber("432131");
		st2.setDepar("500");
		System.out.println(st2.toString());
	}

}
