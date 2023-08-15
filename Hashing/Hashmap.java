package Hashing;
import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        // String --> Key Type  Integer --> Value type
		HashMap<String,Integer> map= new HashMap<>();
		// Key Value Pair 
		map.put("first",11);
		map.put("second",22);
		map.put("third",33);
		map.put("fourth",44);

		 System.out.println(map);
		 
		 // Get Value Through Key .
         int value = map.get("second"); // Get through Key .

		 System.out.println(value);
        
		 // Update the Existing Value With help of Key.
		 map.put("third",44);
		 System.out.println(map);

		 // Manipulating Data in Hash Map
		 map.put("second",map.get("second")+5);
		 System.out.println(map);
		 
		 // Remove Data With help of Key
		 map.remove("fourth");
		 System.out.println(map);
          
		 // contains method predefined (boolean Output)
		 if(map.containsKey("third")) {
			 System.out.println("present");
		 }else {
			 System.out.println("absent");
          }
		 
		 // Size method
		 
		 int size = map.size();
		 System.out.println(size);
		 
		 // How to Traverse through HashMap.
		 
		  Set keys = map.keySet();
		  System.out.println(keys);
		  
		  for(String i : map.keySet()) {
			   System.out.println(i + " --> " + map.get(i));
		  }
		 
			HashMap<String,Integer> marks= new HashMap<>();
			// Key Value Pair 
			marks.put("first",95);
			marks.put("second",85);
			marks.put("third",92);
			marks.put("fourth",82);
			marks.put("fifth",93);
			
			Set <String> keys2 = marks.keySet();
			
			  for(String i : keys2) {
				   System.out.println(i + " --> " + marks.get(i));
			  }
			
			System.out.println(keys2);
			 
			
	}

}
