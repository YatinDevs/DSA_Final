package CollectionExample;
import java.util.*;

public class MapExample2 {

	public static void main(String[] args) {
//algorithm        put remove
//interface        Map   --> key value pair
//in all map keys are unique
//values can be duplicate
//max one null key  and multiple null values can be there 
//implementation   HashMap LinkedHash TreeMap		
		//Map <String ,Integer> m= new HashMap();
		//Map <String ,Integer> m= new LinkedHashMap(); //insertion order
		Map <String ,Integer> m= new TreeMap();//sorting on basis of key 
		                              //in treemap null is not allowed
		m.put("raman", 1);
		m.put("amit", 2);
		m.put("anil", 3);
		m.put("neha", 4);
		m.put("bina", 5);

		System.out.println(m);
		
		Collection c= m.values();
		Iterator i= c.iterator();
		//only values are displayed 
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		//display value with key
		for(Map.Entry e : m.entrySet())
		{
			System.out.println("name="+e.getKey()  +  "rollno=  "+ e.getValue());
		}
		 
		
		
		

	}

}
