package CollectionExampleB;

import java.util.*;
//FIFo - first in first out 
public class PriorityQueueExample
{

	public static void main(String[] args) {
      
        // Instantiate PriorityQueue
        PriorityQueue < String > pq = new PriorityQueue < String > ();

        // By using add() method is add
        // the given element into priority
        // queue
        pq.add("C");
        pq.add("BORLAND");
        pq.add("JAVA");
        pq.add("PHP");
        pq.add("ANDROID");

        // Display PriorityQueue
        System.out.println("PriorityQueue: " + pq);

        // By using comparator() method is
        // used to order the priority queue
        // elements
        Comparator com = pq.comparator();

        // Display Updated PriorityQueue
        System.out.println("pq.comparator(): " + com);

  
     
     
  
    
	}

}
