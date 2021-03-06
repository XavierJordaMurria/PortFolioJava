package xjm.lru.algorithm;
import java.util.ArrayList;
/**
 * This class implements and LRU data structure. whereas the LRU cache is a hash table of keys and double linked nodes.
 * @author xj
 *
 */
import java.util.HashMap;

public class LRUCache 
{
	private int capacity;
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private Node head=null;
	private Node end=null;

	private Object lock = new Object();

	public LRUCache(int capacity) 
	{
		this.capacity = capacity;
	}

	/**
	 * Look for an element in the map list and return its value if it exist.
	 * @param key int value assosiate to the value that we want to find in the map list
	 * @return -1 if the key doesn't exist in the list or the value corresponding to that key.
	 */
	public int find(int key) 
	{
		synchronized(lock) 
		{
			if(map.containsKey(key))
			{
				Node n = map.get(key);
				remove(n);
				setHead(n);
				return n.value;
			}
		}
		return -1;
	}

	/**
	 * Adds a new node into the list
	 * @param key (Key-value pair)
	 * @param value (value-key pair)
	 */
	public void add(int key, int value) 
	{
		synchronized(lock) 
		{
			if(map.containsKey(key))
			{
				Node old = map.get(key);
				old.value = value;
				remove(old);
				setHead(old);
			}
			else
			{
				Node created = new Node(key, value);

				if(map.size() >= capacity)
				{
					map.remove(end.key);
					remove(end);
					setHead(created);
				}
				else
				{
					setHead(created);
				}    

				map.put(key, created);
			}
		}
	}

	/**
	 * Remove the use node from the double linked list. The idea is to keep 
	 * in this list the least recently usded elements. And if we need to remove
	 * any element from our map list the first choice will be the element pointed by end.
	 * @param n
	 */
	public void remove(Node n)
	{
		if(n.pre != null)
		{
			n.pre.next = n.next;
		}
		else
		{
			head = n.next;
		}

		if(n.next != null)
		{
			n.next.pre = n.pre;
		}
		else
		{
			end = n.pre;
		}
	}

	public void setHead(Node n)
	{
		n.next = head;
		n.pre = null;

		if(head != null)
		{
			head.pre = n;
		}

		head = n;

		if(end == null)
		{
			end = head;
		}
	}

	/**
	 * Get all the current keys in the map list
	 * @return a string with all the keys in the map list.
	 */
	public String getKeysList()
	{
		ArrayList<Integer> keysList = new ArrayList<Integer>();

		for (Integer key : map.keySet()) 
		{
			keysList.add(key);
		}

		return keysList.toString();
	}
}
