package xjm.generalAlgorithms;

import java.util.Arrays;

public class Main 
{

	public Main() 
	{
	}
	
	public static void main(String[] args) 
	{	
//		String finalResult = "";
//		finalResult = Number2Name.printNumberWithLetters(1201004);
//		System.out.println(finalResult);
		
   		BasicArrayOps basicArrayOps = new BasicArrayOps();
		
		int[] x = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(x));
		System.out.println("Result = > " + Arrays.toString(basicArrayOps.swapArray(x)));
		System.out.println(Arrays.toString(x));
	}

}
