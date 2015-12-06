package xjm.generalAlgorithms.testUtils;

public class Utils {

	public Utils() 
	{
		// TODO Auto-generated constructor stub
	}

	public static boolean compareArrays(int[] array1, int[] array2) 
	{
		if (array1 == null) return false;
		
		if (array2 == null) return false;
		
		if (array1.length != array2.length)return false;

		for (int i = 0; i < array1.length; i++)
		{
			if (array1[i] != array2[i]) return false;
		}

		return true;
	}
}
