package com.bridgelab.logical_programs;

public class CouponNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]
				chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		int max = 100000000;
		int random = (int)(Math.random()*max);
		StringBuffer sb = new StringBuffer();
		while(random>0) {
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}
		String couponCode = sb.toString();
		System.out.println("Coupon Code: "+couponCode);	

	}
}
