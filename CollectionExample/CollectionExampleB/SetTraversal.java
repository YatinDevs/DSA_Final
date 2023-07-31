package CollectionExampleB;

import java.util.*;

//wap to store names of employee in collection .
//Remove duplicate record and print data in ascending order 
//line by line 
public class SetTraversal {

	public static void main(String[] args) {
	
		TreeSet<String> t= new TreeSet();
		
		t.add("neha");
		t.add("gagan");
		t.add("ashu");
		t.add("kamal");
        //to traverse the data we use Iterator
       // Iterator i  = t.iterator();
       Iterator i= t.descendingIterator();
        while(i.hasNext())
        {
        	  	System.out.println(i.next());//fetch record and move to next record
        }
        System.out.println(t.first()+  "  "+ t.last());
    
	}
}
