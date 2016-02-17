package xjm.generalAlgorithms;

public class Fibonacci 
{
	public Fibonacci() 
	{}

	public long fibonacciRec(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else if(n == 1)
		{
			return 1;
		}
		
		return fibonacciRec(n-1) + fibonacciRec(n-2);
	}
	
	public long fibonacciLoop(int n)
	{	
        int prev2 = 0, prev = 1;
        int saveprev2;
        
        for(int i=0; i<n; i++) 
        {
            saveprev2 = prev2;
            prev2 = prev;
            prev = saveprev2 + prev;
        }
        return prev2;
	}
}
