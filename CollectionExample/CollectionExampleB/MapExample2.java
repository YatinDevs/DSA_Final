package CollectionExampleB;

import java.util.*;
import java.util.Map.Entry;

//traverse the map using Set

public class MapExample2 {

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
		
		//System.out.println(m);
		//System.out.println(m.get("rajan"));
		 
		for(Map.Entry e : m.entrySet())
		{
			System.out.println("name="+e.getKey()  +  "code=  "+ e.getValue());
		}
		 

	}

}
