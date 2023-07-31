package CollectionExample;

import java.util.*;
 
public class PriorityExample {

	public static void main(String[] args) {
		PriorityQueue r= new PriorityQueue(10);
		r.add("amit");
		r.add("neha");
		r.add("bina");
		r.add("ajay");
		//r.add(null);
		//r.add(233);
		//r.add(34.34f);
		System.out.println(r);
		System.out.println(r.poll());
		System.out.println(r.poll());
		

	}

}
