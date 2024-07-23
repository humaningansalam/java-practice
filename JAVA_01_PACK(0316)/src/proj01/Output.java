package proj01;

import java.util.ArrayList;

public class Output {

	
	void show(ArrayList<User> list) {
		
		for(User user : list) {
			System.out.println(user.toString());
		}
		
	}
	
	
	void search(ArrayList<User> list){
		
		System.out.println("구매코드를입력하세요");
		String tmpcode = new Input().s();
		
		for(User user : list) {
			if(tmpcode.equals(user.getSenum())) {
				System.out.println(user.toString());
				break;
			}
		}
	}

}
