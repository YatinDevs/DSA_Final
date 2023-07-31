package CollectionExampleB;
import java.util.*;
//creating a priorty queue based on length of string eneter by user 
//created a class that implmenets Comparator and override compare method
// compare function will compare two string and if they are same  then it will return zero 
  class MyComparator implements Comparator<String>
{
   @Override
   public int compare(String x, String y)
   {
      return y.length() - x.length();
   }
}

public class PriorityQueueExample2 {

	public static void main(String[] args) 
	{
		
       //PriorityQueue<String> queue =  new PriorityQueue (15, new MyComparator());
		PriorityQueue<String> queue =  new PriorityQueue (10,new MyComparator());
        
        queue.add("Tyrion Lannister");
        queue.add("Daenerys Targaryen");
        queue.add("Arya Stark");
        queue.add("Petyr 'Littlefinger' Baelish");
        
        while (queue.size() != 0)
        {
            System.out.println(queue.poll());
      	}}
}