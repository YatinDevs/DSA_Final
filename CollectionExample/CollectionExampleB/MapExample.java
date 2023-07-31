package CollectionExampleB;

import java.util.*;
public class MapExample {

	public static void main(String[] args) {
	
		
		//Map works on key value pair 
		//value can be duplicate 
		//keys must be unique 
		Map <String,Integer>m= new HashMap<String,Integer>();
		
		m.put("rajan",12334);
		m.put("kamal",33433);
		m.put("ashu",2335);
		m.put("bina", 1356);
		m.put("bina", 2300);
		
		System.out.println(m);
		System.out.println(m.get("rajan"));
		
		Map<Integer,Integer> k= new HashMap();
	
		k.put(1, 45);
		k.put(2, 48);
		k.put(2, 38);
		k.put(3, 56);
		System.out.println(k);
		
		
		

	}

}
