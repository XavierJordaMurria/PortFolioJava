/**
 * Basic Array operations class 
 *  
 * @author xj
 *
 */


/**
 * Usage example:
 *   	
   		BasicArrayOps basicArrayOps = new BasicArrayOps();
		
		int[] x = {1,2,3,4,5};
		
		//sumArray
		System.out.print(Arrays.toString(x));
		System.out.print("Result = > " + basicArrayOps.sumArray(x));
		
		//swapArray
		System.out.println(Arrays.toString(x));
		System.out.println("Result = > " + Arrays.toString(basicArrayOps.swapArray(x)));
		System.out.println(Arrays.toString(x));
 */

package xjm.generalAlgorithms;

public class BasicArrayOps 
{

	public BasicArrayOps() 
	{
		// TODO Auto-generated constructor stub
	}
	
    /**
     * SumArray does the additions of all the array elements and it returns it into a long.
     * @param int[] array to sum
     * @return long sumArayy result
     */
	public long sumArray(int[] arr)
	{
		int tmpResult = 0;
		
		for(int i = 0, xMax = arr.length; i<xMax; ++i)
		{
			tmpResult += arr[i]; 
		}
		return tmpResult;
	}
	
    /**
     * Swat all the array elements ex: [1,2,3,4] = [4,3,2,1]
     * @param int[] array to swap
     * @return int[] result of swapping
     */
	public int[] swapArray(int[] arr)
	{
		int[] array2swap = arr; //don't want to modify the original array.
		
		int len = array2swap.length-1;
		int xMax = len/2;
		int tmp;
		
		for(int i = 0; i < xMax; ++i)
		{
			tmp = array2swap[i];
			array2swap[i] = array2swap[len-i];
			array2swap[len-i] = tmp;
		}
		
		return array2swap;
	}
}
