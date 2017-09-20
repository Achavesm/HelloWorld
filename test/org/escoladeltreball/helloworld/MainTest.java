/**
 * 
 */
package org.escoladeltreball.helloworld;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author iaw39397876
 *
 */
public class MainTest {

	private static Main main;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("in setUpBeforeClass method");
		main = new Main();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("in tearDownAfterClass method");
		main = null;
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("in setUp method");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("in tearDown method");
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#findSmallest(int[])}.
	 */
	@Test
	public final void testFindSmallest() {
		assertEquals(1, main.findSmallest(new int[] { 1, 2, 3 }));
		assertEquals(0, main.findSmallest(new int[] { 2, 1, 3, 4, 0 }));
		assertEquals(-8, main.findSmallest(new int[] { 1, 2, 3, -1, -8 }));
		assertEquals(3, main.findSmallest(new int[] { 3 }));
		assertEquals(1, main.findSmallest(new int[] { 1, 1, 1 }));
		
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#sum(int[])}.
	 */
//	@Ignore("El tractarem més tard")
	@Test
	public final void testSum() {
		assertEquals(6, main.sum(new int[] { 1, 2, 3 }));
		assertEquals(4, main.sum(new int[] { -1, 2, 3 }));
		assertEquals(1, main.sum(new int[] { 1 }));
		assertEquals(-7, main.sum(new int[] { -12, 5 }));
		assertEquals(-20, main.sum(new int[] { -10, 10, -20, 5, -5 }));
		assertEquals(1, main.sum(new int[] { 1 }));
		assertEquals(0, main.sum(new int[] {  }));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequency(int[], int)}.
	 */
//	@Ignore("El tractarem més tard")
	@Test
	public final void testFrequency() {
		assertEquals(2, main.frequency(new int[] { 1, 2, 3, 1 }, 1));
		assertEquals(1, main.frequency(new int[] { 1, -1, 2, -2 }, 1));
		assertEquals(0, main.frequency(new int[] { 1, -1, 2, -2 }, 4));
		assertEquals(4, main.frequency(new int[] { 4, 4, 4, 4 }, 4));
	}

	/**
	 * Test method for {@link org.escoladeltreball.helloworld.Main#frequencyPercentage(int[], int)}.
	 */
	//	@Ignore("El tractarem més tard")
	@Test
	public final void testFrequencyPercentage() {
		assertEquals(50.00, main.frequencyPercentage(new int[] { 1, 2, 1, 3 }, 1), 0.001);
		assertEquals(33.333, main.frequencyPercentage(new int[] { 1, 2, 1 }, 2), 0.001);
		assertEquals(100.00, main.frequencyPercentage(new int[] { 1, 1, 1, 1 }, 1), 0.001);
		assertEquals(20.00, main.frequencyPercentage(new int[] { 1, 2, 1, 3, 7 }, 7), 0.001);
	}

}
