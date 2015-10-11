package xjm.generalAlgorithms;

public class Number2Name 
{

	private Number2Name() 
	{
	}
	
	static String printNumberWithLetters(long num)
	{
		String finalName = "";
	
		if(num < 100)
		{
			finalName = numSmallerThan100((int)num);
		}
		else if (num < 1000)
		{
			finalName = numSmallerThan15((int)(num/100)) + " hundred " + numSmallerThan100((int)(num%100)) ;
		}
		else if (num >= 1000 && num < 1000000)
		{
			finalName = printNumberWithLetters(num/1000) + " thousand " + printNumberWithLetters(num%1000);
		}
		else if (num >= 1000000)
		{
			finalName = printNumberWithLetters(num/1000000) + " million " + printNumberWithLetters(num%1000000);
		}
		return finalName;
	}
	
	private static String numSmallerThan15(int num)
	{
		String num2Letters = "";
		switch(num)
		{
			case 1:
				num2Letters = "one";
				break;
			case 2:
				num2Letters = "two";
				break;
			case 3:
				num2Letters = "three";
				break;
			case 4:
				num2Letters = "four";
				break;
			case 5:
				num2Letters = "five";
				break;
			case 6:
				num2Letters = "six";
				break;
			case 7:
				num2Letters = "seven";
				break;
			case 8:
				num2Letters = "eight";
				break;
			case 9:
				num2Letters = "nine";
				break;
			case 10:
				num2Letters = "ten";
				break;
			case 11:
				num2Letters = "eleven";
				break;
			case 12:
				num2Letters = "twelve";
				break;
			case 13:
				num2Letters = "thirteen";
				break;
			case 14:
				num2Letters = "fourteen";
				break;
			case 15:
				num2Letters = "fifteen";
				break;
			default:
				num2Letters = "";
				break;
		}
		return num2Letters;
	}
	
	private static String numSmallerThan100(int num)
	{
		String finalName = "";
		
		if(num <= 15)
		{
			finalName = numSmallerThan15((int) num);
		}
		else if(num > 15 && (num < 20 ))
		{
			System.out.println("GOT here with n => "+num);
			if(num == 18)
			{
				finalName = "eighteen";
			}
			else
			{
				finalName = numSmallerThan15((int) (num % 10)) + "teen";	
			}
		}
		else if ((num >= 20) && (num < 30))
		{
			if( num == 20)
			{
				finalName = "twenty";
			}
			else
			{
				finalName = "twenty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 20) && (num < 30))
		{
			if( num == 20)
			{
				finalName = "twenty";
			}
			else
			{
				finalName = "twenty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 30) && (num < 40))
		{
			if( num == 30)
			{
				finalName = "thirty";
			}
			else
			{
				finalName = "thirty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 40) && (num < 50))
		{
			if( num == 40)
			{
				finalName = "fourty";
			}
			else
			{
				finalName = "fourty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 50) && (num < 60))
		{
			if( num == 50)
			{
				finalName = "fifty";
			}
			else
			{
				finalName = "fifty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 60) && (num < 70))
		{
			if( num == 60)
			{
				finalName = "sixty";
			}
			else
			{
				finalName = "sixty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 70) && (num < 80))
		{
			if( num == 70)
			{
				finalName = "seventy";
			}
			else
			{
				finalName = "seventy-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 80) && (num < 90))
		{
			if( num == 80)
			{
				finalName = "eighty";
			}
			else
			{
				finalName = "eighty-" + numSmallerThan15((int) (num % 10));
			}
		}
		else if ((num >= 90) && (num < 100))
		{
			if( num == 90)
			{
				finalName = "ninety";
			}
			else
			{
				finalName = "ninety-" + numSmallerThan15((int) (num % 10));
			}
		}
		
		return finalName;
	}
}
