package com.bridgeLabzB;

import java.util.Scanner;

public class SqrtFunction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int c=sc.nextInt();
		double epsilon = 1.0e-15;
		double t = c;
		
		
		while (Math.abs(t-c / t) > epsilon * t) {
		t = (c / t + t) / 2.0;
		
		}
		System.out.println(t);
		
	}

}
