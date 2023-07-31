package CollectionExample;
import java.util.*;

public class LinkedListExampleForQueue {

	public static void main(String[] args) {
		
		Queue l= new LinkedList();
		l.add("neha");
		l.add("aman");
		l.add("gagan");
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l.peek());
		System.out.println(l.poll());
		
		System.out.println(l.remove());//throw exception if queue is empty 
		

	}

}
