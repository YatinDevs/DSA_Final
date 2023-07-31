package CollectionExampleB;
import java.util.*;

public class VectorExample {

	public static void main(String[] args) {
//default capacity = 10   if size grows it becomes double 20
//Vector r= new Vector(2); ==set capacity to 2 
//will be double 		
   
   int y[]= new int [12];
   
   Vector r= new Vector(2,4);
   
   r.add("rajan");
   r.add("kamal");
   r.add("neha");
   r.add("rajan");
   r.add("kamal");
   r.add("neha");
   r.add("puja");
   System.out.print(r.hashCode());
 
    System.out.println(r.size());
    System.out.println(r.capacity());
    System.out.println(r);
  

	}

}
