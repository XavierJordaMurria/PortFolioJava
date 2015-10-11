package xjm.generalAlgorithms;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class Number2NameTest 
{

	 /**  Basic test case for the Number2Name algorithm. It consists in 
	  *   passing a long(hashMap key) to the printNumberWithLetters method
	  *   and comparing the result with the hashMap value.
	  */
	@Test
	public final void test() 
	{
		HashMap<Integer, String> dataValues = new HashMap<Integer, String>();
		
	     /*Adding elements to HashMap*/
		dataValues.put(7, "seven");
		dataValues.put(73, "seventy three");
		dataValues.put(307, "three hundred seven");
		dataValues.put(997, "nine hundred ninety seven");
		dataValues.put(104707, "one hundred four thousand seven hundred seven");
		
		
		 /* Display content using Iterator*/
	      Set set = dataValues.entrySet();
	      Iterator iterator = set.iterator();
	      
	      while(iterator.hasNext()) 
	      {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         
	         long dataValuesKey =  Long.valueOf(((Integer) mentry.getKey()).longValue());
	         String dataValuesValue = String.valueOf((String)mentry.getValue());

	         String tmpResult = Number2Name.printNumberWithLetters(dataValuesKey);
	        
	         System.out.print("key is: "+ dataValuesKey + " & Value is: \n");
	         System.out.println(dataValuesValue);
	         System.out.println(Number2Name.printNumberWithLetters(dataValuesKey));
	         
	         assertTrue(tmpResult.equals(dataValuesValue));

	      }
	}
}
