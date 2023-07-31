package CollectionExampleB;
import java.util.*;
//list --duplicate 
// list work with index 
//array list is good when we want to store data & access data 
//for performing insertion |deletion in that case array is slow 
public class ListExample1 {

	public static void main(String[] args) 
	{
		
		String a[]= {"neha","gagan","ashu"};
		
    ArrayList<String> l=new ArrayList();
	//LinkedHashSet l= new LinkedHashSet();	
    l.add("neha");
    l.add("gagan");
    l.add("ashu");
    l.add("priya");
    l.add("kamal");
    System.out.println(l.size()); 
    l.remove(0);
    l.remove(0);
    l.remove("kamal");
    
    System.out.println(l.size());

    l.add(2,"pooja");
    System.out.println(l);
    System.out.println(l.get(0));
    l.remove("pooja");
    System.out.println(l.remove(0));
	}

}
