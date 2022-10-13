package com.bridgeLabzA;

import java.util.Scanner;

public class Stopwatch {
	public long startTime=0;
	public long stopTime=0;
	public long elapsed;
	private long stopTimer;
	
	public void start(){
		startTime=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
	
	}
	
	public void stop(){
	    stopTimer = System.currentTimeMillis();
		System.out.println("stopTime is:"+stopTime);
	}
	
	public long getilapsedTime() {
		elapsed=stopTime-startTime;
		return elapsed;
	}
	
	public static void main(String[] args) {
		Stopwatch sw=new Stopwatch();
		Scanner sc= new Scanner(System.in);
		System.out.println("Press '1' to Start Time: ");
		int time=sc.nextInt();
		
		{
		sw.start();
		System.out.println();
		Scanner sc2= new Scanner(System.in);
		System.out.println("Press '2' to Start Time: ");
		
		}
			
		sw.stop(); 	                 //long,1-sw.getelapsedTime();
		System.out.println();
		System.out.println("Total Time Elapsed(in millisec) is:"+1);
		System.out.println();
		System.out.println("Converting millisec to second:"+(1/1000)+"sec");			
		

	}

}
