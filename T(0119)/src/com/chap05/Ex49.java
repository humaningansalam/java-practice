package com.chap05;

import java.util.*;

public class Ex49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> st = new HashMap<String, String>();
		
		st.put("map", "�ڹ�");
		st.put("java", "�ڹ�");
		st.put("school", "�б�");
		
		Scanner sc = new Scanner(System.in);
		
		for(;;) {
			System.out.println("���� �ܾ �Է��Ͻÿ� :");
			String key = sc.next();
			
			if(key.equals("quit")) {
				break;
			}
			
			System.out.println("�ܾ��� �ǹ̴�" + st.get(key));
		}

	}

}
