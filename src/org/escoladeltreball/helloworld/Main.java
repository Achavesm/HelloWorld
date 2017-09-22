/**
 * 
 */
package org.escoladeltreball.helloworld;

import java.util.Arrays;

/**
 * @author iaw39397876
 *
 */
public final class Main implements Utils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.out.println("Hello World");
		int[] values = new int[] {1, 2, 3, 4, 5, 6, 8};
		Main main = new Main();
//		System.out.println("El número menor es: " + main.findSmallest(values));
//		System.out.println("La suma de todos los números es: " + main.sum(values));
//		System.out.println("El número introducido se repite " + main.frequency(values, 4) + " veces");
//		System.out.println("El número introducido aparece un " + main.frequencyPercentage(values, 4) + "% de veces en la array");
		System.out.println("La array nueva es: " + main.merge(values, 9));
	}

	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloworld.Utils#findSmallest(int[])
	 */
	@Override
	public int findSmallest(int[] values) {
		// TODO Auto-generated method stub
		int smallest = values[0];
		int toCompare = smallest;
		
		for (int i = 0; i < values.length; i++) {
			toCompare = values[i];
			if (toCompare < smallest) {
				smallest = values[i];
			}
		}
		
		return smallest;
	}

	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloworld.Utils#sum(int[])
	 */
	@Override
	public int sum(int[] values) {
		// TODO Auto-generated method stub
		int total = 0;
		
		for (int i = 0; i < values.length; i++) {
			total += values[i];
		}
		
		return total;
	}

	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloworld.Utils#frequency(int[], int)
	 */
	@Override
	public int frequency(int[] values, int n) {
		// TODO Auto-generated method stub
		int frequency = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == n) {
				frequency++;
			}
		}
		return frequency;
	}

	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloworld.Utils#frequencyPercentage(int[], int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		// TODO Auto-generated method stub
		double frequency = 0;
		double percentage = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == n) {
				frequency++;
			}
		}
		percentage = frequency / values.length * 100;
		return percentage;
	}

	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloworld.Utils#isPresent(int[], int)
	 */
	@Override
	public boolean isPresent(int[] values, int n) {
		// TODO Auto-generated method stub
		boolean isPresent = false;
		for (int i = 0; i < values.length; i++) {
			if (values[i] == n) {
				isPresent = true;
			}
		}
		return isPresent;
	}

	/*
	 * (non-Javadoc)
	 * Stub
	 * @see org.escoladeltreball.helloworld.Utils#merge(int[], int)
	 */
	@Override
	public String merge(int[] values, int n) {
		// TODO Auto-generated method stub
		int[] newValues = new int[values.length + 1];
		int z = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] < n && values[i + 1] > n) {
				newValues[z] = values[i];
				newValues[z + 1] = n;
				z++;
			} else if ( values[values.length - 1] < n) {
				System.out.println("i = " + i + " -- TOTAL = " + values.length);
				if (i == values.length - 2) {

					z++;
				} else {
					newValues[z] = values[i];
				}
			} else {
			newValues[z] = values[i];
			}
			z++;
		}
		return Arrays.toString(newValues);
	}

}