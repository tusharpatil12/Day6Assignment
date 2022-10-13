package com.bridgeLabzA;

public class FibonacciSeries {
	
public static void fibonacciSerise(int num) {
		
		int a=0, b=1;
	       System.out.print (a + " , " + b + " , ");

		int count;
		for(int i=2; i<num; i++) {
			count=a+b;
			a=b;
			b=count;
			System.out.print(count+",");
		}		
}
	public static void main(String[] args) {
		fibonacciSerise(10);
		
		
	}

}
