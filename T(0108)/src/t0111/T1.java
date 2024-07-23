package t0111;

class NumberBox{
	private int ivalue;
	private double fvalue;
	
	public int getIvalue() {
		return ivalue;
	}
	public void setIvalue(int ivalue) {
		this.ivalue = ivalue;
	}
	
	public double getFvalue() {
		return fvalue;
	}
	public void setFvalue(double fvalue) {
		this.fvalue = fvalue;
	}
}

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberBox n = new NumberBox();
		n.setIvalue(10);
		n.setFvalue(1.234);
		
		System.out.println(n.getIvalue() + "," + n.getFvalue());
		

	}

}
