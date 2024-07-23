package com.chap04;

import java.util.HashSet;

class HashSetEx{
	String name;
	int age;
	
	public HashSetEx(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "HashSetEx [name=" + name + ", age=" + age + "]";
	}
	
	
}

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		
		set.add("asdf");
		set.add("asdf");
		set.add("asdf");
		set.add("gg");
		set.add(new HashSetEx("hanna", 29));
		System.out.println(set);
		
	}

}
