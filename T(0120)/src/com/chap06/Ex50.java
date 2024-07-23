package com.chap06;

import java.util.Random;

public class Ex50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int random = r.nextInt() % 100;
		System.out.println(random);
		System.out.println(Math.abs(random));
		
		int[] arr = new int[5];
		
		int tmp;
		for(int i=0; i<arr.length; i++) {
			arr[i] = Math.abs(r.nextInt()%100);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
				}

			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}

	}

}
