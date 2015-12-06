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

public class BubbleSortTest 
{
	 /** Basic test case for the bubble sort algorithm. It consists in 
	  *   passing an array and comparing the result with its sorted counterpart.
	  */
	@Test
	public void bubbleSortTest() 
	{
		System.out.println("\nbubbleSortTest -->");
		
		final int[] resultExpected = {1,2,3,4,5,6,7,8};
		int[] arrayTobeSorted = {8,7,6,5,4,3,2,1};
		
  		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.setArray2BeSorted(arrayTobeSorted);
		try 
		{
			System.out.println("sortedArray =>");
			bubbleSort.printArray(bubbleSort.getSortedArray());
			System.out.println("resultExpected =>");
			bubbleSort.printArray(resultExpected);
			assertTrue(Utils.compareArrays(resultExpected, bubbleSort.getSortedArray()));
		} 
		catch (GeneralException e) 
		{
			e.printStackTrace();
		}
	}
	
	 /** Basic test case for the bubble sort algorithm. It consists in 
	  *   passing an array and comparing the result with the same array sorted by the OS.
	  */
	@Test
	public void bubbleSortTest2() 
	{
		System.out.println("\nbubbleSortTest2 -->");
		
		int[] arraySortedByOS = {12,11,6,51,4,3,23,1};
		int[] arrayTobeSorted = {12,11,6,51,4,3,23,1};
		
  		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.setArray2BeSorted(arrayTobeSorted);
		try 
		{
			Arrays.sort(arraySortedByOS);
			System.out.println("sortedArray =>");
			bubbleSort.printArray(bubbleSort.getSortedArray());
			System.out.println("arraySortedByOS =>");
			bubbleSort.printArray(arraySortedByOS);
			
			assertTrue(Utils.compareArrays(arraySortedByOS, bubbleSort.getSortedArray()));
		} 
		catch (GeneralException e) 
		{
			e.printStackTrace();
		}
	}
}
