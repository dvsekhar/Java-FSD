package maps;
import java.util.*;

public class Maps {

	    public static void main(String args[]) 
	    { 
	  
	    	   System.out.println("\nHashMap:");
	    	   Map<String, Integer> map = new HashMap<>(); 
	    	   
	           map.put("vishal", 10); 
	           map.put("sachin", 30); 
	           map.put("vaibhav", 20); 
	           
	           for (Map.Entry<String, Integer> e : map.entrySet()) 
	               System.out.println(e.getKey() + " "+ e.getValue());
	        
	           System.out.println("\nLinkedHashMap:");
	           Map<String, Integer> map1 = new LinkedHashMap<>(); 
	           
	           map1.put("vishal", 10); 
	           map1.put("sachin", 30); 
	           map1.put("vaibhav", 20); 
	     
	           for (Map.Entry<String, Integer> e : map1.entrySet()) 
	     
	               System.out.println(e.getKey() + " "+ e.getValue());
	           
	           System.out.println("\nTreeMap:");
	           Map<String, Integer> map2 = new TreeMap<>(); 
	           
	           map.put("vishal", 10); 
	           map.put("sachin", 30); 
	           map.put("vaibhav", 20); 
	     
	           for (Map.Entry<String, Integer> e : map.entrySet()) 

	               System.out.println(e.getKey() + " "+ e.getValue());
	    }

}
