package proj01;

public class Student {

	private String name;
	private String number;
	private String memcode;
	
	public Student(String memcode, String name, String number) {
		this.memcode = memcode;
		this.name = name;
		this.number = number;
	}
	
	
	public String getMemcode() {
		return memcode;
	}


	public void setMemcode(String memcode) {
		this.memcode = memcode;
	}


	public String getName() {
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


	public String toString() {
		return "code:" + memcode + " 이름:" + name + " 번호:" + number;
	}
}
