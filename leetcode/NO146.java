package code;

import java.util.HashMap;
import java.util.Map;

public class NO146 {

}

//˫������+hashmapʵ��
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
 * ����˫�������hashmap������Ҫ�����µ��������ʱ��������������������д��ڣ�һ���Ϊ���У���
 * ��Ѹýڵ��Ƶ�����ͷ������������ڣ����½�һ���ڵ㣬�ŵ�����ͷ�������������ˣ�����������һ���ڵ�ɾ�����ɡ�
 * �ڷ������ݵ�ʱ������������������д��ڣ���Ѹýڵ��Ƶ�����ͷ�������򷵻�-1��
 * ����һ��������β���Ľڵ����������δ���ʵ������
 */
class LRUCache {

	Node head; //�����ͷ���
	Node tail; //�����β���
	Map<Integer, Node> hashmap = new HashMap<Integer, Node>();
	int capacity; //������������
	
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        //���hashmap��û�У�����-1
    	if(hashmap.get(key) == null)
    		return -1;
    	
    	//���ڵĻ���Ҫ���˽ڵ�ŵ��������ǰ��
    	Node node = hashmap.get(key);
    	
    	//ɾ����ǰ�ڵ�
    	remove(node);
    	//���ýڵ�ŵ�����ͷ��
    	insert(node);
    	return node.value;
    }
    
    public void put(int key, int value) {
    	//put�����������
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
    	//�ýڵ㲻��ͷ���
    	if(node.pre!=null) {
    		node.pre.next = node.next;
    	}else { //�ýڵ���ͷ���
    		head = node.next;
    	}
    	
    	//�ýڵ㲻��β���
    	if(node.next!=null) {
    		node.next.pre = node.pre;
    	}else {
    		tail = node.pre;
    	}
    }
    
    //�ѵ�ǰ�ڵ��������ͷ���
    public void insert(Node node) {
    	//ͷβ�ڵ�Ϊ�սڵ�
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
