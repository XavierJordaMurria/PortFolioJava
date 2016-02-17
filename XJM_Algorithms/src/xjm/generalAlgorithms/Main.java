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
		
		Fibonacci fib = new Fibonacci();
		
		System.out.println("res => " + fib.fibonacciRec(14));
		
		System.out.println("res => " + fib.fibonacciLoop(14));
	}

}
