package com.bl.generic;

public class IntegerMaxNumber {
	
	public static <T extends Number & Comparable<T>> T max(T num1, T num2, T num3) {
	    return max(max(num1, num2), num3);
	}

	public static <T extends Number & Comparable<T>> T max(T num1, T num2) {
	    if (num1.compareTo(num2) > 0) {
	        return num1;
	    }
	    return num2;
	}
	
	public static void main(String[] args) {
		System.out.printf("Maximum of %d, %d and %d is %d\n", 23, 44, 35, max(23, 44, 35));
	}

}


