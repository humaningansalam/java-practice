package com.chap02;

import java.util.Random;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] rotto = new int[6];
		Random rand = new Random();
		
		for(int i=0; i<rotto.length; i++) {
			rotto[i] = rand.nextInt(45)+1;
		}
		for(int i=0; i<rotto.length; i++) {
			System.out.println(rotto[i]);
		}

	}

}
