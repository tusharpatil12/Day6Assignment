package com.bridgeLabzA;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void checkPerfectNumber(int a) {
		
		int test = 0;
		
		for (int i =1; i < a; i++) {
		if (a % i == 0) {
			test = test + i;
		}
		
		}
		if (test =='a') {
			System.out.println(a + " is a perfectnumber");
			
		}
		else {
			System.out.println(a + " is not perfectnumber");
		}
	}
	
	int divisor(int x)
	{
		return x;
	

}

	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int a = sc.nextInt();
		checkPerfectNumber(6);
		

	}

}
