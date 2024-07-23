package com.chap04;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object obj =it.next();
			System.out.println(obj);
		}
	}

}
