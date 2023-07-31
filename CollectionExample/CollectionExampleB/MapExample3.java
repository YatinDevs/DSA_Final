package CollectionExampleB;

import java.util.*;
import java.util.Map.Entry;

//traverse the map using Set

public class MapExample3 {

	public static void main(String[] args) {
	
		//Map <String,Integer>m= new  HashMap<String,Integer>()
		//insertion order  
		Map <String,Integer>m= new LinkedHashMap<String,Integer>();
		//Map <String,Integer>m= new TreeMap<String,Integer>();
		
		m.put("bina", 1356);
		m.put("rajan",12334);
		m.put("kamal",33433);
		m.put("ashu",2335);
		m.put("bina", 2300);
		//m.put(null, 12232);
		//storing map data to collection 
		 Collection c= m.values();
		 //using iterator we are travering map
		 
		 Iterator i= c.iterator();
		 while(i.hasNext())
		 {
			 System.out.println(i.next());
		 }

	}

}
