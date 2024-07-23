import java.util.Scanner;

class Data17{
	String name;
	int age;
}

class DataDriver17{
    Data17 d = new Data17();
    Scanner scan = new Scanner(System.in);
    
    public DataDriver17(){
    	input();
    	output();   	
    }
    
    void input(){
    	System.out.print("이름 입력: ");
    	d.name = scan.next();
    	System.out.print("나이 입력: ");
    	d.age = scan.nextInt();
    	
    }
    
    void output() {
    	System.out.println("이름 : " + d.name);
    	System.out.println("나이 : " + d.age);
    	
    }
}
public class T17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataDriver17 d = new DataDriver17();

	}

}
