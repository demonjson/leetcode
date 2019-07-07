package code;

import java.util.LinkedList;
import java.util.Queue;

public class NO207 {
	/*
	  *
	  *	 拓扑排序。
	  *	用一个队列存入度为0的节点，依次出队，
	  *	将与出队节点相连的节点的入度减1，如果入度减为0，将其放入队列中，
	  *	直到队列为空。如里最后还有入度不为0的节点的话，说明有环，否则无环。
	 */
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites == null || prerequisites.length < 1 
        		|| prerequisites[0] == null)
        	return true;
        
        //保存节点的入度
        int[] degree = new int [numCourses];
        for(int i = 0; i<prerequisites.length; i++) {
        	int t = prerequisites[i][0];
        	degree[t]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<numCourses; i++) {
        	if(degree[i] == 0)
        		queue.offer(i);
        }
        
        while(!queue.isEmpty()) {
        	int t = queue.poll();
        	
        	for(int i = 0; i<prerequisites.length; i++) {
             	if(t == prerequisites[i][1]) {
             		degree[prerequisites[i][0]]--;
             		if(degree[prerequisites[i][0]] == 0)
             			queue.offer(prerequisites[i][0]);
             	}
             	
            }
        }
        
        for(int i = 0; i<numCourses; i++)
        	if(degree[i] > 0)
        		return false;
        return true;
	}
}
