package p432;

class Data{
	
}

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String data = null;
		String data = "test";
		System.out.println(data.toString());
		
		Data[] d = new Data[3];
		//d[0] = new Data();
		System.out.println(d[0].toString());

	}

}
