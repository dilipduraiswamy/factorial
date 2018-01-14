/**
 * 
 */
package com.one.jan.one;

/**
 * @author dilip.duraiswamy
 *
 */
public class Factorial {

	/**
	 * @param n
	 * @return factorial of n
	 * @author dilip.duraiswamy
	 */
	public int factorial(int n) throws Exception {
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}

}
