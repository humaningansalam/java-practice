package t0111;


class Car{
	
	public int num;
	private double gas;
	
	public double getGas() {
		return gas;
	}
	
	public void setGas(double gas) {
		this.gas = gas;
	}
	
}

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1  = new Car();
		
		car1.num = 1234;
		car1.setGas(20.5);
		
		System.out.println("차량 번호는" + car1.num + "입니다.");
		System.out.println("연료양은" + car1.getGas() + "입니다.");
		
	}

}
