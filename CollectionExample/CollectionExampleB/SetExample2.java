package CollectionExampleB;
import java.util.*;

public class SetExample2 {

	public static void main(String[] args)
	{
	 HashSet e= new HashSet();	//by default type is Object
	 //LinkedHashSet  e= new LinkedHashSet();	//by default type is Object
    //treeset will not work with different datatype
		/*
     * 
     * 
     * TreeSet e= new TreeSet();//works on fixed type
     */
    e.add("neha");
    e.add(23);
    e.add(134.434f);
    e.add(true);
    e.add(null);
    System.out.println(e);
	 
		
	TreeSet  s= new TreeSet();
	s.add("neha");
	s.add("gagan");
	//s.add(null); cannot add null in treeset 
	}

}
