import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Test14{
	String name;
	int age;
}
public class Ex14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Test14 t = new Test14();
		
		System.out.println("이름입력");
		t.name = br.readLine();
		System.out.println("나이입력");
		String str = br.readLine();
		t.age =	Integer.parseInt(str);

		System.out.println(t.name);
		System.out.println(t.age);
	}

}
