package chap01;

class Value{
	int value;
	
	public Value(int value) {
		this.value = value;
	}
}
public class EqualsEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		//v1과 v2 같은지 확인하는 if-else
		
		if(v1.value == v2.value) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("같다");
		}

	}

}
