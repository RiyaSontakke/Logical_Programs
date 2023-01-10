package com.bridgelab.logical_programs;

import java.util.Scanner;
public class MonthlyPayment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value");
		double P = scan.nextInt();
		double Y = scan.nextInt();
		double R = scan.nextInt();
		double n = 12*Y;
		double r = R/(12*100);
		double payment = (P*r)/(1-Math.pow((1+r),(-n)));
		System.out.println("Payment:" +payment);
	}
}
