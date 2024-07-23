package chap01;

class Person extends Object{
	int id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person)obj).id;
		}else {
		    return false;
		}
	}
	public Person(int id) {
		this.id = id;
	}
}
public class EqualsEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(1234);
		Person p2 = new Person(1234);

		if(p1 == p2) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
		if(p1.equals(p2)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
	}

}
