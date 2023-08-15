package Hashing;
import java.util.*;

public class HashMapImpl {
       
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	  HashMap <Integer,String> map = new HashMap<>();
	//	HashMap map =new HashMap();
		
	//	System.out.println(map.isEmpty());             //true

		map.put(101,"Yatin");
		map.put(102,"Pankaj");
		map.put(103,"Yatin");
		map.put(104,"Siddesh");
		map.put(102,"ABC"); 
		map.put(105,"rakesh");
		map.put(106,"Nishant");
		map.put(107,"Sanju");
      
        
		System.out.println(map);   //{101=Yatin, 102=ABC, 103=Yatin, 104=Siddesh, 105=rakesh, 106=Nishant, 107=Sanju}

		
		System.out.println(map.get(101));  // Yatin
		
		map.remove(107);
		 
		System.out.println(map);    //{101=Yatin, 102=ABC, 103=Yatin, 104=Siddesh, 105=rakesh, 106=Nishant}

		
	//	System.out.println(map.containsKey(107));       // false
	//	System.out.println(map.containsKey(106));       // true

	//	System.out.println(map.containsValue("Yatin")); // true
	//	System.out.println(map.containsValue("adad"));  // false
		
	//	System.out.println(map.isEmpty()); // false
		
	//	System.out.println(map.keySet()); // [101, 102, 103, 104, 105, 106]

	//	System.out.println(map.values()); //  [Yatin, ABC, Yatin, Siddesh, rakesh, Nishant

	//	System.out.println(map.keySet());
		
	//	System.out.println(map.values());

    //	System.out.println(map.entrySet());
		
		
	
				
     /*   
      
         for(Object i : map.keySet()) {
      
        	System.out.println(i);   
        }

        for(Object i : map.values()) {
        	System.out.println(i);   
        }
        
        */

		/*
        for(Object i : map.entrySet()) {
        	
        	System.out.println(i);   
        }
        
       */
		
	/*
		for(Object i : map.keySet()) {
		      
        	System.out.println(i + " " + map.get(i));   
        }
     */
		
		// ********* Entry Methods ***********
		
		// Entry Interface.

	/*
		 
		for( Map.Entry entry : map.entrySet()) {
			  System.out.println( entry.getKey() + " :: " + entry.getValue() );
		}
		
	*/
		
	     Set entries = map.entrySet();
         
	     Iterator  itr = entries.iterator();
	     
	     while (itr.hasNext()) {
	    	 
	    	   Map.Entry entry =(Map.Entry) itr.next(); 
			   System.out.println( entry.getKey() + " :: " + entry.getValue());
		}
	}

}
