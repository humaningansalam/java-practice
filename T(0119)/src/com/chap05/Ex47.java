package com.chap05;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("�ϳ�");
		list.add("��");
		list.add("��");
		list.add("��");
		
		Iterator e = list.iterator();
		
		while(e.hasNext()) {
			String s = (String)e.next();
			System.out.println(s);
		}

		
	}

}
