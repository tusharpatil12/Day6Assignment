package com.bridgeLabzA;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean checkPrimeNumber(int n) {
		if(n<=1) {
			return false;
		}
		for (int i = 2; i<n; i++) {
			if (n%i == 0) {
				return false;
				
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n = sc.nextInt();
		
		if(checkPrimeNumber(n)) {
			System.out.println(n+" is a prime number");
			
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		
		
	}

	

}
