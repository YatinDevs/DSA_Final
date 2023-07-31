package CollectionExample;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
//array list dynamic array 
//array  data storage is in contiguous 
// slow in comparision to linked list		
		
		ArrayList <Object>k= new ArrayList<Object>();
		k.add("ritu");
		k.add("neha");
		k.add(1,"puja");
        k.add(778);
        k.add(23.3f);
        //k.set(0, "jayant");
        k.add(123.44f);
        k.add(true);
        k.add(null);
         
		//System.out.println(k);
		Iterator i= k.iterator();
		int count=0;
		while(i.hasNext())
		{
			 Object l=i.next();
			//if(i.next()  instanceof Float )				count++;
			//fetch data and move next
			if(l instanceof Float )
				System.out.println(l);
			 
		}
		System.out.print (count);
	}

}
