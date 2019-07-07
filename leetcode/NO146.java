package code;

import java.util.HashMap;
import java.util.Map;

public class NO146 {

}

//双向链表+hashmap实现
class Node{
	int key;
	int value;
	Node pre;
	Node next;
	
	public Node(int key,int value) {
		this.key = key;
		this.value = value;
	}
}

/*
 * 利用双向链表和hashmap。当需要插入新的数据项的时候，如果新数据项在链表中存在（一般称为命中），
 * 则把该节点移到链表头部，如果不存在，则新建一个节点，放到链表头部，若缓存满了，则把链表最后一个节点删除即可。
 * 在访问数据的时候，如果数据项在链表中存在，则把该节点移到链表头部，否则返回-1。
 * 这样一来在链表尾部的节点就是最近最久未访问的数据项。
 */
class LRUCache {

	Node head; //链表的头结点
	Node tail; //链表的尾结点
	Map<Integer, Node> hashmap = new HashMap<Integer, Node>();
	int capacity; //缓存的最大容量
	
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        //如果hashmap中没有，返回-1
    	if(hashmap.get(key) == null)
    		return -1;
    	
    	//存在的话，要将此节点放到链表的最前面
    	Node node = hashmap.get(key);
    	
    	//删除当前节点
    	remove(node);
    	//将该节点放到链表头部
    	insert(node);
    	return node.value;
    }
    
    public void put(int key, int value) {
    	//put操作不算访问
        if(hashmap.containsKey(key)) {
        	Node node = hashmap.get(key);
        	node.value = value;
        		
        	remove(node);
        	insert(node);
        }else {
        	if(hashmap.size() >= capacity) {
        		hashmap.remove(tail.key);
        		remove(tail);
        	}
        	Node node = new Node(key,value);
        	insert(node);
        	hashmap.put(key, node);
        }
    }
    
    public void remove(Node node) {
    	//该节点不是头结点
    	if(node.pre!=null) {
    		node.pre.next = node.next;
    	}else { //该节点是头结点
    		head = node.next;
    	}
    	
    	//该节点不是尾结点
    	if(node.next!=null) {
    		node.next.pre = node.pre;
    	}else {
    		tail = node.pre;
    	}
    }
    
    //把当前节点放至链表头结点
    public void insert(Node node) {
    	//头尾节点为空节点
    	if(head == null) {
    		head = node;
    		tail = node;
    	}else {
    		head.pre = node;
    		node.next = head;
    		node.pre = null;
    		head = node;
    	}	
    }
    
   
} 
