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
    	System.out.print("�̸� �Է�: ");
    	d.name = scan.next();
    	System.out.print("���� �Է�: ");
    	d.age = scan.nextInt();
    	
    }
    
    void output() {
    	System.out.println("�̸� : " + d.name);
    	System.out.println("���� : " + d.age);
    	
    }
}
public class T17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataDriver17 d = new DataDriver17();

	}

}
