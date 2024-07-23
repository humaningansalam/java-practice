package p431;

public class TrycatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class clazz = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
