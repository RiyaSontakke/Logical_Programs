package com.bridgelab.logical_programs;

import java.util.Scanner;

public class StopwatchProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long start,end;
		double time;
		System.out.println("Type any character to start the stopwatch");
		char s = scan.next().charAt(0);
		start = System.currentTimeMillis();
		System.out.println("Type any character to stop the stopwatch");
		char m = scan.next().charAt(0);
		end = System.currentTimeMillis();
		time=(end - start)/1000;
		System.out.println(time);
		

	}

}
