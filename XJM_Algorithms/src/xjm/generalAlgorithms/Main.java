package xjm.generalAlgorithms;

public class Main 
{

	public Main() 
	{
	}
	
	public static void main(String[] args) 
	{	
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
	}

}
