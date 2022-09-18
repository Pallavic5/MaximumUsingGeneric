package com.bl.generic;

public class FloatMaxNumber {
	
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

		  System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n", 6.2, 8.8, 7.6, max(6.2, 8.8, 7.6));

	}

}
