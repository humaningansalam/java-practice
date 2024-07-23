package com.chap05;

import java.util.LinkedList;

public class Ex46 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list = new LinkedList<String>();
		
		list.add("MILK");
		list.add("MILK");
		list.add("butter");
		list.add(1, "APPLE");   //¿Œµ¶Ω∫1ø° APPLE ª¿‘
		
		list.remove(3);         //¿Œµ¶Ω∫ 3 ªË¡¶
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
