/**
 *  Is a simple sorting algorithm that repeatedly steps through the list to be sorted, 
 *  compares each pair of adjacent items and swaps them if they are in the wrong order. 
 *  The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted
 *  
 *  Bubble sort has worst-case and average complexity both О(n2),
 *  where n is the number of items being sorted. 
 *  Therefore, bubble sort is not a practical sorting algorithm when n is large.
 *  
 *  
 * @author xj
 *
 */


/**
 * 		Example of how to try it in the Main file.
 
  		BubbleSort bubbleSort = new BubbleSort();
		
		int[] x = {8,7,6,5,4,3,2,1};
		
		bubbleSort.printArray(x);
		bubbleSort.setArray2BeSorted(x);
		try 
		{
			bubbleSort.printArray(bubbleSort.getSortedArray());
		} 
		catch (GeneralException e) 
		{
			e.printStackTrace();
		}
 */

package xjm.generalAlgorithms;

public class BubbleSort 
{
	private int[] array2BeSorted;
	
	public BubbleSort() {}
	
    /**
     * Set the member variable array2BeSorted with an int[]
     * @param int[] array
     */
	public void setArray2BeSorted(int[] arr)
	{
		array2BeSorted = arr;
	}
	
    /**
     * It Sorts int arrays.
     * @throws custom general exception
     * 
     * @return int[] sorted array
     */
	public int[] getSortedArray() throws GeneralException
	{
		return getSortedArray(array2BeSorted);
	}
	
    /**
     * It Sorts int arrays.
     * @param int[] array to be sorted
     * @throws custom general exception
     * 
     * @return int[] sorted array
     */
	public int[] getSortedArray(int[] arr) throws GeneralException
	{
		if(arr == null)
		{
			throw new GeneralException("Can't sort an empty array");
		}
		else if( arr.length == 1)
		{
			return arr;
		}
		else
		{
			int len = arr.length-1;
			boolean swiped;
			int tmp;
			
			do
			{
				swiped = false;
				
				for(int i=0; i<len; i++)
				{
					if(arr[i] > arr[i+1])
					{
						tmp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = tmp;
						swiped = true;
					}
				}
				
			}while(swiped);
		}
		return arr;
	}
	
	public void printArray(int[] arr)
	{
		String rest = "[";
		int len = arr.length;
		for(int i = 0; i < len; i++)
		{
			if(i<len-1)
			{
				rest = rest + String.valueOf(arr[i]) + ",";	
			}
			else
			{
				rest = rest + String.valueOf(arr[i]);
			}
		}
		rest = rest + "]";
		
		System.out.println(rest);
	}
}
