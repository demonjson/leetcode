package code;

import java.util.LinkedList;
import java.util.Queue;

public class NO207 {
	/*
	  *
	  *	 ��������
	  *	��һ�����д����Ϊ0�Ľڵ㣬���γ��ӣ�
	  *	������ӽڵ������Ľڵ����ȼ�1�������ȼ�Ϊ0�������������У�
	  *	ֱ������Ϊ�ա������������Ȳ�Ϊ0�Ľڵ�Ļ���˵���л��������޻���
	 */
	public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(prerequisites == null || prerequisites.length < 1 
        		|| prerequisites[0] == null)
        	return true;
        
        //����ڵ�����
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
