package proj01;

import java.util.ArrayList;

public class Sell {

	
	String tmpcode;
	String toto;
	
	public Sell(ArrayList<User> list){
		
        tmpcode = new Ran().se(list);		

	}
	
	void process(ArrayList<User> list, User user){
		
		
		user = new User(tmpcode);
		new Db().gener(tmpcode);
		
	
		
			
			System.out.println("�ζ� ���� �Ͻðڽ��ϱ� 1.yes 2.no");
			int a = new Input().i();
			
			if(a == 1) {
				System.out.println("������ �����Ͻðڽ��ϱ�");
				int b = new Input().i();
				
			    System.out.println("�ڵ� ����");
			    int c = new Input().i();
			    
			    if(c == 1) {
			    	toto = new Ran().toto();
			    }
			    else if(c == 2) {
			    	manual();
			    }
			    
			    System.out.println("�̸��� �Է��㼼��");
				String name = new Input().s();
				
				System.out.println("��ȭ��ȣ�� �Է��ϼ���");
				String number = new Input().s();
			    
				
				
				
				System.out.println("==��������==");
				System.out.println("�����ڵ�:" + tmpcode);
				System.out.println("�̸�:" + name);
				System.out.println("��ȣ:" + number);
				System.out.println("�ζǹ�ȣ:" + toto);
				System.out.println("����:" + 1000*b);
				System.out.println("=========");
				System.out.println("�����Ͻðڽ��ϱ�? 1.yes 2.no");
				int d = new Input().i();
				
				
				if(d == 1) {
					
					String date = new Calen().now();
					user.setName(name);
					user.setNumber(number);
					user.setDate(number);
					user.setDate(date);
					user.setToto(toto);
					    

					new Db().update(tmpcode, date, name, number, toto);
				    list.add(user);
				}
				else if(d == 2) {
					new Db().delete(tmpcode);
					System.out.println("����ϼ̽��ϴ�.");
				}
			}
			else if(a == 2) {
				new Db().delete(tmpcode);
				System.out.println("����ϼ̽��ϴ�.");
			}
			
		    
	}
	
    
    void manual() {
    	
    	
    }
	
	
	
}
