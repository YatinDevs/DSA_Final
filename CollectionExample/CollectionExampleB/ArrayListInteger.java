package CollectionExampleB;
import java.util.*;

//wap to store integer in array list and sort them in ascending order
public class ArrayListInteger {

	public static void main(String[] args) {
		//integer class inherits Comparable interface 
		ArrayList <Integer> i= new ArrayList();
		i.add(233);
		i.add(253);
		i.add(123);
		i.add(200);
		i.add(100);
		System.out.println( i);
		//sort will work on comparable data 
		Collections.sort(i);
		
		System.out.println( i);
	}

}
