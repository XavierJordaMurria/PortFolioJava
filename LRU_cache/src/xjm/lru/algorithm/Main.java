package xjm.lru.algorithm;

public class Main 
{
	public static void main(String[] args) 
	{	
		LRUCache lr=new LRUCache(5);
		lr.add(1, 1);
		lr.add(2,2);
		lr.add(3, 3);
		lr.add(4, 4);
		lr.add(5, 5);
		
		lr.printList();
		
		int val1=lr.find(1);
		int val2=lr.find(2);
		int val3=lr.find(3);
		int val5=lr.find(5);
		
		System.out.println(""+val1);
		
		lr.add(6, 6);
		
		lr.printList();
		
		int valx=lr.find(2);
		
		System.out.println(""+val2);
	}
}