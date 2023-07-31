package CollectionExample;

import java.util.ArrayList;
import java.util.Collections;

 


public class ArrayListIntegerSorteddata {

	public static void main(String[] args) {
		ArrayList <Integer> l= new ArrayList();
		l.add(434);
		l.add(23);
		l.add(2311);
		l.add(223);
		l.add(2463);
		l.add(273);
		System.out.println(l);
		
		Collections.sort(l);
		
		System.out.println(l);
		

	}

}
