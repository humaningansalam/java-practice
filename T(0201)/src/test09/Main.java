package test09;

class Info{
	public String name;
	public String ssn;
	
	public Info(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
}

class StudentInfo extends Info{
	public int stuentNo;
	
	public StudentInfo(String name, String ssn, int studentNo){
		super(name, ssn);
		this.stuentNo = studentNo;
	}
	
	void show() {
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(stuentNo);
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentInfo in = new StudentInfo("ȫ�浿" , "3239809" , 1);
		in.show();
		
		

	}

}
