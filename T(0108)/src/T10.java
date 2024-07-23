
public class T10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "J2323";
		strArray[2] = new String("bbbbbb");
		
		for(int i=0; i<3; i++) {
			System.out.println(strArray[i]);
		}
		
		for(String str : strArray){  //향상된 for문
			System.out.println(str);
		}

	}

}
