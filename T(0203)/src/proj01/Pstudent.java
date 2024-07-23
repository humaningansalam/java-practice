package proj01;

public class Pstudent extends Student{
	
	final int scholarship;
	private String assistant;
	
	public Pstudent(String memcode, String name, String number,int scholarship) {
		super(memcode, name, number);
        this.scholarship = scholarship;
	}
	
	

	public String toString() {
		return super.toString() + " 장학금:" + scholarship + "만원";
	}

}
