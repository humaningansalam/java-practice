import java.io.*;


public class Ex11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("숫자 입력:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		System.out.println(str);
		System.out.println(num);
		
		System.out.println(str+1);
		System.out.println(num+1);
		

	}

}
