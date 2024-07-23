package proj01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba = new BankAccount("dldl");
		
		BankAccount ba2 = new BankAccount("ddd", "556565");
		
		System.out.println(ba.getName());
		System.out.println(ba.getNumber());
		System.out.println(ba.balance);
		
		System.out.println(ba2.getName());
		System.out.println(ba2.getNumber());
		System.out.println(ba2.getBalance());

	}

}
