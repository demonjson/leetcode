package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class NO399 {
	//https://segmentfault.com/a/1190000019073059?utm_source=tag-newest
		public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
	        Map<String, List<String>> map1 = new HashMap<>(); 
	        Map<String, List<Double>> map2 = new HashMap<>(); 
	        
	        for(int i = 0; i < equations.size(); i++) {
	        	List<String> equation = equations.get(i);
	        	String a = equation.get(0);
	        	String b = equation.get(1);
	        	
	        	if(!map1.containsKey(a)) {
	        		map1.put(a, new ArrayList<>());
	        		map2.put(a, new ArrayList<>());
	        	}
	        	if(!map1.containsKey(b)) {
	        		map1.put(b, new ArrayList<>());
	        		map2.put(b, new ArrayList<>());
	        	}
	        	
	        	map1.get(a).add(b);
	        	map1.get(b).add(a);
	        	map2.get(a).add(values[i]);
	        	map2.get(b).add(1.0/values[i]);
	        	
	        }
	        
	        double[] res = new double[queries.size()];
	        for(int i = 0; i < queries.size(); i++) {
	        	res[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), map1, map2, new HashSet<>(), 1.0);
	        	res[i] = res[i]==0.0? -1.0:res[i];
	        }
	        return res;
		}
	    
	    public double dfs(String a, String b, Map<String, List<String>> map1, 
	    		Map<String, List<Double>> map2, Set<String> visited, double curResult) {
	        if(!map1.containsKey(a))
	        	return 0.0;
	        if(visited.contains(a))
	        	return 0.0;
	        if(a.equals(b))
	        	return curResult;
	        visited.add(a);
	        
	        List<String> adj = map1.get(a);
	        List<Double> value = map2.get(a);
	        double temp = 0.0;
	        for(int i = 0; i < adj.size(); i++) {
	        	temp = dfs(adj.get(i), b, map1, map2, visited, curResult * value.get(i));
	        	if(temp != 0.0)
	        		break;
	        }
	        visited.remove(a);
	        return temp;
	    }
}
