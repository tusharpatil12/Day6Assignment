package com.bridgeLabzB;

import java.util.*;

public class TemperatureConversion {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to convert Celsius to Fahrenheit ");
		System.out.println("Enter 2 to convert Fahrenheit to Celsius");
		
		int choice = sc.nextInt();
		
		double temp = 0.0;
		double conv = 0.0;
		
		if(choice==1) {
			System.out.println("Enter the temperature in celsius. ");
			temp = sc.nextInt();
			conv = 9/5.0*temp+32;
			System.out.println("temp is celsius= "+conv);
			
		}
		else {
			System.out.println("Enter the temperature in fahrenheit. ");
			temp = sc.nextInt();
			conv = 5/9.0*temp-32;
			System.out.println("temp is celsius= "+conv);
			
		}
		
			System.out.println("wrong input. plese try again.");
	}
	
}	