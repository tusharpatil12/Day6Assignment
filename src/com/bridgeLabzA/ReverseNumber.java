package com.bridgeLabzA;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void checkReverseNumber(int Number) {
		
		if(Number<1) {
			System.out.println(Number);
			return;
		}else {
			System.out.print(Number % 10);  
			checkReverseNumber(Number/10);  
		}
		
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the reverse number: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.print("The reverse number is: ");
		checkReverseNumber(num);

	}

}
