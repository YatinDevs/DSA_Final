package CollectionExampleB;

import java.util.*;
//FIFo - first in first out 
public class QueueExample {

	public static void main(String[] args) {
      //List u  = new LinkedList();
      Queue <String> r = new LinkedList();
      
      r.add("amit");
      r.add("bina");
      r.add("gagan");
      r.add("jayant");
      System.out.println(r.poll());
     
      System.out.println(r);
      System.out.println(r.poll());
      System.out.println(r.remove());
     
  
     
     
  
    
	}

}
