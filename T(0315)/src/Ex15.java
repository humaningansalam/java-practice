import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex15 {

	public static void main(String[] args)  throws IOException{
		// TODO Auto-generated method stub
		ArrayList<Test14> list = new ArrayList<Test14>();
		Test14 t;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int menu, count=0;
		
		while(true) {
			System.out.println("1.입력 2.출력 3.종료");
			menu = Integer.parseInt(br.readLine());
			
			if(menu == 1) {
				t = new Test14();
				System.out.println("이름입력");
				t.name = br.readLine();
				t.age= Integer.parseInt(br.readLine());
				
				list.add(t);
			}
			
			if(menu == 2) {
				for(int i=0; i<list.size(); i++) {
					System.out.println(list.get(i).name);
					System.out.println(list.get(i).age);
				}
				
				for(Test14 test : list) {
					System.out.println(test.name);
					System.out.println(test.age);
				}
			}
			
			if(menu == 3) {
				break;
			}
		}
		

	}

}
