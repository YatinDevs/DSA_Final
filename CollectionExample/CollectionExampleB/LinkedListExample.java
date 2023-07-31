package CollectionExampleB;
import java.util.*;
public class LinkedListExample
{

	public static void main(String[] args)
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("neha");
		l.add("ashu");
		l.add(3,"priya");
		 l.remove(1);
		//l.get(0);
		System.out.println(l);
		ListIterator li= l.listIterator();
		while(li.hasNext())
		{
			System.out.print ( "  "+ li.next());
		}
		System.out.println();
		while(li.hasPrevious())
		{	System.out.print ( "  "+li.previous());
	    }
		
		}
	
	}
 
