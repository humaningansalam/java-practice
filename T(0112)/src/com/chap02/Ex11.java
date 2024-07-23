package com.chap02;

import java.util.ArrayList;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		
		list.add("C");
		list.add("java");
		list.add("python");
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		list.remove(0);

		System.out.println(list.get(0));
		System.out.println(list.get(1));
		//System.out.println(list.get(2));
		
		listInt.add(1);
		listInt.add(22);
		
		for(int i=0; i<listInt.size(); i++) {
			System.out.println(listInt.get(i));
		}
	}

}
