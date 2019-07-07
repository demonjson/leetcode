package code;

public class NO208 {
	
	
		//字典树的数据结构
		//isWord标识是单词还是以当前字符串作为前缀的
		//这里仅有小写字母，所以最多有26个子树，如果对应的子树不为空，则说明含有相对应的小写字母
		
	class TreeNode{
		boolean isWord;
		TreeNode[] next;
		
		public TreeNode() {
			isWord = false;
		    next = new TreeNode[26];
		}
	}
	
	class Trie {
		
		TreeNode root;
		
	    /** Initialize your data structure here. */
	    public Trie() {
	       root = new TreeNode();
	    }
	    
	    /** Inserts a word into the trie. */
	    public void insert(String word) {
	        TreeNode node = root;
	        for(int i = 0; i<word.length();i++) {
	        	if(node.next[word.charAt(i)-'a'] == null) {
	        		TreeNode t = new TreeNode();
	        		node.next[word.charAt(i)-'a'] = t;
	        	}
	        	node = node.next[word.charAt(i)-'a'];
	        }
	        node.isWord = true;
	    }
	    
	    /** Returns if the word is in the trie. */
	    public boolean search(String word) {
	        TreeNode node = root;
	    	for(int i = 0; i<word.length(); i++) {
	        	if(node.next[word.charAt(i)-'a']==null)
	        		return false;
	        	node = node.next[word.charAt(i)-'a'];
	        }
	    	return node.isWord;
	    }
	    
	    /** Returns if there is any word in the trie that starts with the given prefix. */
	    public boolean startsWith(String prefix) {
	    	TreeNode node = root;
	    	for(int i = 0; i<prefix.length(); i++) {
	        	if(node.next[prefix.charAt(i)-'a']==null)
	        		return false;
	        	node = node.next[prefix.charAt(i)-'a'];
	        }
	    	return true;
	    }
	}
}
