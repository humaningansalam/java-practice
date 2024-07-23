package proj01;

import java.util.ArrayList;
import java.util.Random;

public class Ran {
	Random rand = new Random();
	
	String tmp;
	
	int findse =0;

	
	String se(ArrayList<User> list) {

		tmp = ""; //난수가 저장될 변수
        
        for(;;) {
        	
            for(int i=0;i<6;i++) {
                
                
                String ran = Integer.toString(rand.nextInt(10));
               
                tmp += ran;
                
            }
            
    		for(User user : list) {
    			if(tmp.equals(user.getSenum())) {
    				findse++;
    				break;
    			}
    		}
    		
    		if(findse == 0) {
    			break;
    		}
        	
        }


        return tmp;
        
	}
	
	
	
	String toto() {
		
    	int[] tmp = new int[4];
    	
		for(int i=0; i<4; i++) {
			tmp[i] = (int)((Math.random()*10000)%10);
			
		}
		
		String str = tmp[0] + "-" + tmp[1] + "-" + tmp[2] + "-" + tmp[3];
		
		System.out.println(str);
		for(int i=0; i<4; i++) {
			System.out.println(tmp[i]);
			
		}
    	
		return str;
		
	}

}
