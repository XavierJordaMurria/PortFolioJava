package xjm.lru.algorithm;
/**
 * This class node holds the elements that our LRU will contain
 * @author xj
 *
 */
public class Node 
{
    int key;
    int value;
    Node pre;
    Node next;
 
    public Node(int key, int value)
    {
        this.key = key;
        this.value = value;
    }

}
