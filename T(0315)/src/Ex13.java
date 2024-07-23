
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
			System.out.println("¹Ý°©½À´Ï´Ù.");
			Function(num - 1);
		}
	}

}
