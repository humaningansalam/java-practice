import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex14_02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Test14[] t = new Test14[100];
		int menu, count=0;
		
		while(true) {
			System.out.println("1.입력 2.출력 3.종료");
			menu = Integer.parseInt(br.readLine());
			
			if(menu == 1) {
				t[count] = new Test14();
				System.out.println("이름입력");
				t[count].name = br.readLine();
				t[count].age = Integer.parseInt(br.readLine());
				count++;
			}
			
			if(menu == 2) {
				for(int i=0; i<count; i++) {
					System.out.println(t[i].name);
					System.out.println(t[i].age);
				}
			}
			
			if(menu == 3) {
				break;
			}
		}
		

	}

}
