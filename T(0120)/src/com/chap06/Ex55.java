package com.chap06;

import java.util.StringTokenizer;

public class Ex55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "1,2,3,4|7,8,9|3,6,9,12";
		StringTokenizer  st = new StringTokenizer(source, "|");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			
			StringTokenizer st2 = new StringTokenizer(token, ",");
			while(st2.hasMoreTokens()){
				System.out.println(st2.nextToken());
			}
			System.out.println("--------------");
		}

	}

}
