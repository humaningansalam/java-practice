
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function(5);

	}
	
	public static void Function(int num) {
		if(num == 0) {
			return;
		}
		else {
			System.out.println("�ݰ����ϴ�.");
			Function(num - 1);
		}
	}

}
