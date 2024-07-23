package com.chap05;

import java.util.*;

public class Ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sample = {"e" ,"a" , "c", "d", "b"};
		
		List<String> list = Arrays.asList(sample);
		Collections.sort(list);
		System.out.println(list);

		Integer[] in = new Integer[] {3,65,77,4,8};
		List<Integer> list2 = Arrays.asList(in);
		Collections.sort(list2);
		System.out.println(list2);
	}

}
