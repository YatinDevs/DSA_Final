package CollectionExample;
import java.util.*;
public class ListExample {

	public static void main(String[] args) {
		//list can have duplicate record 
		
		LinkedList<String> l= new LinkedList<String>();
		
		l.add("neha");
		l.add("gagan");
		l.add("ashu");
		l.add("tina");
		//l.remove(8);// IndexOutOfBoundsException:
	  
		l.add("ashu");
		l.remove("ashu");//FIFO  first in first out 
		 System.out.println(l.size());
		 
		
		//l.add("neha");
		//l.add("neha");
		//l.add("gagan");
		
		
		System.out.println(l);
		System.out.println(l.get(0));
		System.out.println(l.getFirst() + "  "+ l.getLast());

	}

}
