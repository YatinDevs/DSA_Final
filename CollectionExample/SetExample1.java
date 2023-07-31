package CollectionExample;
import java.util.*;

public class SetExample1 {

	public static void main(String[] args) {

		String r[]= {"neha","gagan","ashu"}; // array is used to store data 
		
		//all collection are generic
		//by default object 
		//HashSet<String> k= new HashSet<String>();  //works faster 
		//LinkedHashSet <String> k= new LinkedHashSet(); //data is stored in insertion
		TreeSet <String>k = new TreeSet();// works very slow
		
		
		k.add("neha");
		k.add("gagan");
		k.add("ashu");
		//k.add(null);//In hashSet Null value will come in begining
		            //in treeset we cannot take null value 
		k.add("abc");
		 System.out.println(k.first() +"  "+ k.last());
		System.out.println(k);
		k.remove("gagan");
		System.out.println(k);
		System.out.println(k.contains("neha"));
		Iterator i= k.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
			 
		}
		
		}
		

	}

