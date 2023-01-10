package com.bridgelab.logical_programs;

import java.util.Scanner;

public class PerfectNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n, sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = scan.nextLong();
		int i = 1;
		while(i<=n/2) {
			if(n%i==0) {
			sum = sum+i;
		}
			i++;
		}
			if(sum==n) {
				System.out.println("perfect number:" +n);
			}
			else 
				System.out.println("Not a perfect number:" +n);
	}

}
