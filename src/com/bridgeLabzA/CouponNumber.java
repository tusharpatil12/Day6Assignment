package com.bridgeLabzA;

import java.util.Random;

public class CouponNumber {
	
	public static void checkCoupanNumber() {
		String str="";
		String alphabets="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		Random r = new Random();
		for(int i = 0; i<=4; i++);{
			char ch = alphabets.charAt((r.nextInt(alphabets.length())));
			str = String.valueOf(ch)+str;
		}
		System.out.println(str);
	
	}
	

	public static void main(String[] args) {
		
		checkCoupanNumber();
		
		
	}

}
