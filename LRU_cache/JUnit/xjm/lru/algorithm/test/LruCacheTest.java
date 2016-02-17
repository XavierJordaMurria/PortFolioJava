package xjm.lru.algorithm.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import org.junit.Test;

import xjm.lru.algorithm.LRUCache;

public class LruCacheTest 
{

	public LruCacheTest() {}
	
	/**
	 * Test to check that if we keep adding elements into the lruList 
	 * but we don't check/update any, the lruList should remove the oldest ones.
	 */
	@Test
	public void testAddElementsFindNone() 
	{
		System.out.println("testAddElementsFindNone -->");

		String expectedResult = "[3, 4, 5, 6, 7]";
		
		LRUCache lr = getFulllList();
		
		System.out.println(lr.getKeysList());
		
		lr.add(6, 6);
		lr.add(7, 7);
		
		System.out.println(lr.getKeysList());
		
		assertTrue(expectedResult.equals(lr.getKeysList()));
		
	}
	
	/**
	 * Test to check that the least visited element is the first one to be removed.
	 */
	@Test
	public void testReplaceLRU() 
	{
		String expectedResult = "[1, 2, 3, 5, 6]";
		
		System.out.println("testReplaceLRU -->");
		
		LRUCache lr = getFulllList();
		
		System.out.println(lr.getKeysList());
		
		int val1=lr.find(1);
		System.out.println(val1);
		
		lr.find(2);
		lr.find(3);
		lr.find(5);

		lr.add(6, 6);// the lru will run out of space and 
		//it will remove the least recent used element. in this case the one with
		// key=4.
		
		System.out.println(lr.getKeysList());
		
		int valx=lr.find(4);//the LRU shoud have removed the element with
		//index 4 because is the least recent used element, therefore we should get a -1.
		
		System.out.println(valx);
		
		assertTrue(expectedResult.equals(lr.getKeysList()));
	}
	
	/**
	 * Create, fullfill and return a LRUCache list
	 */
	public LRUCache getFulllList()
	{
		LRUCache lr=new LRUCache(5);
		lr.add(1, 1);
		lr.add(2,2);
		lr.add(3, 3);
		lr.add(4, 4);
		lr.add(5, 5);
		
		return lr;
	}

}
