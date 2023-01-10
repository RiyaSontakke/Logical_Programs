package com.bridgelab.logical_programs;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Celcius,Farenheit;
		System.out.println("Enter the Temperature in celcius:");
		Scanner scan = new Scanner(System.in);
		Celcius = scan.nextFloat();
		Farenheit = ((Celcius*9)/5)+32;
		System.out.println("Temperature converting Farenheit is:" +Farenheit);
		System.out.println("Enter the temperature in Fahrenheit:");
		float Fahrenheit = scan.nextFloat();
		Celcius= ((Fahrenheit - 32)*5)/9;
		System.out.println("Temperature converting to Celcius is:" +Celcius);
		
		

	}

}
