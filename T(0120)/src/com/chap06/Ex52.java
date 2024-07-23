package com.chap06;

public class Ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] names = new String[3];
		
		names[0] = "±è¾¾";
		names[2] = "ÀÌ¾¾";
		names[1] = "Áö¾¾";

		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		

		
		String[] address = {"½ÃÈï", "¼º³²", "°­³²", "ÆÇ±³"};
		names = address;
		
		for(String s : names) {
			System.out.println(s);
		}
	}

}
