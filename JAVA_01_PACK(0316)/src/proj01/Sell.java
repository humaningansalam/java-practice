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
		
	
		
			
			System.out.println("로또 구매 하시겠습니까 1.yes 2.no");
			int a = new Input().i();
			
			if(a == 1) {
				System.out.println("몇장을 구매하시겠습니까");
				int b = new Input().i();
				
			    System.out.println("자동 수동");
			    int c = new Input().i();
			    
			    if(c == 1) {
			    	toto = new Ran().toto();
			    }
			    else if(c == 2) {
			    	manual();
			    }
			    
			    System.out.println("이름을 입력허세요");
				String name = new Input().s();
				
				System.out.println("전화번호를 입력하세요");
				String number = new Input().s();
			    
				
				
				
				System.out.println("==구매정보==");
				System.out.println("구매코드:" + tmpcode);
				System.out.println("이름:" + name);
				System.out.println("번호:" + number);
				System.out.println("로또번호:" + toto);
				System.out.println("가격:" + 1000*b);
				System.out.println("=========");
				System.out.println("구매하시겠습니까? 1.yes 2.no");
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
					System.out.println("취소하셨습니다.");
				}
			}
			else if(a == 2) {
				new Db().delete(tmpcode);
				System.out.println("취소하셨습니다.");
			}
			
		    
	}
	
    
    void manual() {
    	
    	
    }
	
	
	
}
