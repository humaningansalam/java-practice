package com.chap04;

import java.util.*;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		
		map.put("김자바", 9);
		map.put("지자바", 90);
		map.put("이자바", 84);
		map.put("치자바", 75);
		map.put("김자바", 100);
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + ", 점수 : " + e.getValue());
		}
		
	}

}
