package test08;

import java.util.*;

class Info{
	public String name;
	public int age;
	
	/*
	toString() {
		return "name :" + name + "age :" + age;
	}
	*/
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Info> list = new ArrayList<Info>();
		
		Info in = new Info();
		
		in.name = "hanna";
		in.age = 88;
		
		list.add(in);

		
		
		System.out.println(list.get(0).name);
		System.out.println(list.get(0).age);

	}

}
