package com.chap04;

import java.util.StringJoiner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String animals = "dog,cat,hanna";
		String[] arr = animals.split(",");
		
		System.out.println(String.join("-", arr));
		
		for(String s : arr){
			System.out.println(s);
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		
		StringJoiner sj = new StringJoiner("/", "[", "]");
		
		for(String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());

	}

}
