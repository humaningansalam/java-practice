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
		
		//v1�� v2 ������ Ȯ���ϴ� if-else
		
		if(v1.value == v2.value) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		v2 = v1;
		
		if(v1.equals(v2)) {
			System.out.println("����");
		}

	}

}
