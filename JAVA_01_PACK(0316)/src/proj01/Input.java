package proj01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	
	String s() {
		
		String tmp = "";
		try {
			tmp = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tmp;
	}
	
	int i() {
		int tmp = 0;
		try {
			tmp = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return tmp;
	}
	
}
