package com.chap04;

import java.util.*;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		
		map.put("���ڹ�", 9);
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 84);
		map.put("ġ�ڹ�", 75);
		map.put("���ڹ�", 100);
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸� : " + e.getKey() + ", ���� : " + e.getValue());
		}
		
	}

}
