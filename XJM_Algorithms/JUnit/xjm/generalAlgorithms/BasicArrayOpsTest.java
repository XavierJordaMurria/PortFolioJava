/**
 * 
 */
package xjm.generalAlgorithms;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import xjm.generalAlgorithms.testUtils.Utils;

/**
 * @author xj
 */

public class BasicArrayOpsTest 
{
	 /** Basic test case for the bubble sort algorithm. It consists in 
	  *   passing an array and comparing the result with its sorted counterpart.
	  */
	@Test
	public void testSumArray() 
	{
		System.out.println("testSumArray -->");
   		BasicArrayOps basicArrayOps = new BasicArrayOps();
		
		int[] x = {1,2,3,4,5};
		int expectedResult = 15;
		
		//sumArray
		System.out.println(Arrays.toString(x));
		System.out.println("Result = > " + basicArrayOps.sumArray(x));
		
		assertTrue(expectedResult == basicArrayOps.sumArray(x));
	}
	
	 /** Basic test case for the bubble sort algorithm. It consists in 
	  *   passing an array and comparing the result with the same array sorted by the OS.
	  */
	@Test
	public void testSwapArray() 
	{
		System.out.println("\ntestSwapArray -->");
		
   		BasicArrayOps basicArrayOps = new BasicArrayOps();
		
		int[] x = {1,2,3,4,5};
		int[] arraySwappedExpected = {5,4,3,2,1};
		
		//swapArray
		System.out.println("arrayOriginal => " + Arrays.toString(x));
		System.out.println("arraySwappedExpected => " + Arrays.toString(arraySwappedExpected));
		
		int[] arrResult  = basicArrayOps.swapArray(x);
		System.out.println("Result = > " + Arrays.toString(arrResult));
		assertTrue(Utils.compareArrays(arraySwappedExpected, arrResult));
	}
}
