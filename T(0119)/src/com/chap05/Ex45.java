package com.chap05;

import java.util.Vector;

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vc =new Vector();
		
		vc.add("Hello World!");
		vc.add(100);
		vc.add(20);
		System.out.println("vector size : " + vc.size());

		for(int i=0; i<vc.size(); i++) {
			System.out.println(vc.get(i));
		}
	}

}
