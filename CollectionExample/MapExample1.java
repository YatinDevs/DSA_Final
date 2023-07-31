package CollectionExample;
import java.util.*;

public class MapExample1 
{

	public static void main(String[] args) {
//Map - interface  | HashMap |TreeMap |LinkedHashMap
//in map keys are always unique 		 
		
		Map <String ,Integer>m= new HashMap(); //run fast
		//Map <String ,Integer>m= new LinkedHashMap();//insertion order
		//Map <String ,Integer>m= new TreeMap();//sorted order of keys
		m.put("rajan",1);
		m.put("neha",null);
		m.put("kamal",null);
		m.put("gagan",4);
		m.put("neha",5);
		m.put(null,6); //null is not allowed in treemap
		m.put(null,22);
		m.put(null,33);
		
		 
		System.out.println(m);
		
		//traverse data in Map using values method as iterator is not present in map
		 
		Collection c= m.values();
		
		Iterator i= c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
