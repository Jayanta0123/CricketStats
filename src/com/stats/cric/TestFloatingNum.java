package com.stats.cric;

public class TestFloatingNum {
	public static void main(String[] args) {
		int num1 = 15;
		int num2 = 35;
		Integer num3 = 9021; Integer num4 = 235;
		
		float value = num1 + (float)num2/100;
		System.out.println(value);
		
		float value3 = (float) (num3/num4);
		float value2 = (float) (Math.round (value3*100.0)/100.0);
		System.out.println(value3);
		System.out.println(value2);
		
		int x1 = 0; int x2 = 100;
		float x3 = (float) x1/x2;
		System.out.println(x3);
	}
}
