/**
 * 
 */
package org.escoladeltreball.helloworld;

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
//		int[] values = new int[] {2, 4, 4, 10, -5};
//		Main main = new Main();
//		System.out.println("El número menor es: " + main.findSmallest(values));
//		System.out.println("La suma de todos los números es: " + main.sum(values));
//		System.out.println("El número introducido se repite " + main.frequency(values, 4) + " veces");
//		System.out.println("El número introducido aparece un " + main.frequencyPercentage(values, 4) + "% de veces en la array");
		
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

}