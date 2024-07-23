package chap05;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String abc = "dog,cat,hanna";
		String[] arr = abc.split(",");
		
		System.out.println(String.join("-", arr));
		
		
		for(String str :arr) {
			System.out.println(str);
		}

	}

}
