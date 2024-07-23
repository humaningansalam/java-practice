package com.chap04;
import java.util.*;

class ArrayStu{
	
	String name;
	int number;
	
	
	@Override
	public String toString() {
		return "ArrayStu [name=" + name + ", number=" + number + "]";
	}
	
	
}
public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayStu> list = new ArrayList<ArrayStu>();
		ArrayStu s = new ArrayStu();
		s.name = "ÀÌÇÑ³ª";
		s.number = 1234;
		
		list.add(s);
		list.add(s);

		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
