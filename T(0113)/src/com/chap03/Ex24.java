package com.chap03;

import java.util.ArrayList;

class ArrayStu{
	String name;
	int number;
	
	public String toString() {
		return name + "," + number;
	}
}
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayStu> list = new ArrayList<ArrayStu>();
		ArrayStu s = new ArrayStu();
		
		s.name = "한나미디어";
		s.number = 100;
		list.add(s);
		
		ArrayStu s1 = new ArrayStu();
		
		s1.name = "한나미디어";
		s1.number = 100;
		list.add(s1);
		list.add(s1);
		
		System.out.println(list.get(0).toString());
		System.out.println(s.toString());
	}

}
