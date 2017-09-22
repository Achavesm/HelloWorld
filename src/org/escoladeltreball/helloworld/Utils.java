/**
 * 
 */
package org.escoladeltreball.helloworld;

/**
 * @author iaw39397876
 *
 */
public interface Utils {

	/*
	 * This method returns the smallest value in an integer array
	 */
	public abstract int findSmallest(int[] values);	
	
	/*
	 * This method returns the sum of values in an integer array
	 */
	public abstract int sum(int[] values);
	
	
	/*
	 * This method returns the frequency of n in an integer array
	 */
	public abstract int frequency(int[] values, int n);
	
	/*
	 * This method returns the percentage of times that n appears in an integer array
	 */
	public abstract double frequencyPercentage(int[]values, int n);
	
	/*
	 * This method returns true if n is present in values
	 */
	public abstract boolean isPresent(int[] values, int n);
	
	/*
	 * This method returns an integer array with n in its place
	 * NOTE: values is an ordered array
	 */
	public abstract String merge(int[] values, int n);
}
