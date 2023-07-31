package CollectionExampleB;
import java.util.*;
//list --duplicate 
// list work with index 
//array list is good when we want to store data & access data 
//for performing insertion |deletion in that case array is slow 
public class ArrayListRemove 
{

	public static void main(String[] args) 
	{

    ArrayList<Integer> l=new ArrayList();
    
    l.add(234); 
    l.add(new Integer(10));
    l.add(new Integer(1));
    l.add(new Integer(2));
    l.add(new Integer(3));
    l.add(new Integer(0));
    System.out.println(l); 
    System.out.println(l.size());
    l.remove(1);//remove value at index 1 
    l.remove(2);//remove value at index 2
    l.remove(new Integer(2)); //remove object with value 0 
    System.out.println(l.size());
    System.out.println(l);
    
	
    ArrayList<String> l2=new ArrayList();
    
    l2.add("kamal"); 
    l2.add("puja");
    l2.add(   "neha");
    l2.remove(3);
    l2.remove(new String("neha"));
    System.out.println(l);
	
	
	
	
	
	
	
	
	
	}}
