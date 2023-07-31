package CollectionExampleB;
import java.util.*;
public class SetExample {

	public static void main(String[] args) {

		 String a[]= {"amit","rajat","neha","ashu"};
		 //set --> container  that will store data
		 //they can grow and shrink
		 //stores unique record
		 //it has its own algorithm with help of which we can manipulate data
		 //all collection classes are generic class
		 
		 //HashSet<String> s= new HashSet<String>();//random 
		// LinkedHashSet<String> s= new LinkedHashSet<String>();// insertion order
		 TreeSet<String> s= new TreeSet<String>(); //ascending order
		 
		 s.add("amit");
		 s.add("rajat");
		 s.add("neha");
		 s.add("ashu");
		 s.add("ashu");
		 s.add("ashu");
		 s.add("ashu");
		 s.add("ashu");
		 s.add("ashu");	 
		 s.remove("ashu");
		 System.out.println(s);
		 System.out.println(s.size());
		 
		 
		 HashSet <Integer> s1= new HashSet<Integer>();
		 s1.add(123);
		 s1.add(333);
		 System.out.println(s1);
		 
		 

	}

}
