package CollectionExample;

import  java.util.*;

public class VectorExample {

	public static void main(String[] args) {
		//Vector <String>v= new Vector<String>(); //capacity is 10 
		//Vector <String>v= new Vector<String>(3);// capacity  is 3 in case if data volumn increases capacity becomes double 
		Vector <String>v= new Vector<String>(3,4); //
		v.add("neha");
		v.add("ashu");
		v.add("gagan");
		v.add("priya");
		v.add(null);
		v.add(null);
		//v.add("neha");
		//System.out.println(v.size() +"  " + v.capacity());
		System.out.println(v.get(0));
		Iterator w= v.iterator();
		while(w.hasNext())
		{
			System.out.println(w.next());
		}
	}

}
