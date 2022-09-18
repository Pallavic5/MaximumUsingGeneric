package com.bl.generic;

public class MaxNumber {
	
	 public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		    T max = x; 

		    if (y.compareTo(max) > 0)
		      max = y; 

		    if (z.compareTo(max) > 0)
		      max = z;

		    return max; 
		  } 



	public static void main(String[] args) {
		
		System.out.printf("Maximum of %d, %d and %d is %d\n", 23, 44, 35, maximum(23, 44, 35));
	    System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n", 6.2, 8.8, 7.6, maximum(6.2, 8.8, 7.6));
	    System.out.printf("Maximum of %s, %s and %s is %s\n", "Apple", "Peach", "Banana", maximum ( "Apple", "Peach", "Banana"));

	}
}