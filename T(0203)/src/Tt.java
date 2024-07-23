
class Food{
	private int cal;
	private int cost;
	private int kg;
	
	public int getCal() {
		return cal;
	}
	public void setCal(int cal) {
		this.cal = cal;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getKg() {
		return kg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	
}
class Melon extends Food{
	private String info;

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String toString() {
		return info;
	}
}


public class Tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
