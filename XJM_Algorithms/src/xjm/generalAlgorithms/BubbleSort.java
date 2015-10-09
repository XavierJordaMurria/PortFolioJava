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

package xjm.generalAlgorithms;

public class BubbleSort 
{
	private int[] array2BeSorted;
	
	public BubbleSort() {}
	
	public void setArray2BeSorted(int[] arr)
	{
		array2BeSorted = arr;
	}
	
	public int[] getSortedArray() throws GeneralException
	{
		return getSortedArray(array2BeSorted);
	}
	
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
