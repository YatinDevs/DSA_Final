package CollectionExample;

 
 

import java.util.ArrayList;
import java.util.Collections;

class customer implements Comparable<customer>
{
	String cname;
	int age ;
	@Override
	public String toString() {
		return "customer [cname=" + cname + ", price=" + age + "]";
	}
	public customer(String cname, int age) {
		super();
		this.cname = cname;
		this.age = age;
	}
	@Override
	public int compareTo(customer o) {
		 if(this.age>o.age) return  1;
		 else if (this.age<o.age) return -1;
		return 0; 
	}
	
}
public class CustomercomparableExample {

	public static void main(String[] args) {
		 ArrayList <customer> c= new ArrayList();
		 c.add(new customer("neha", 23));
		 c.add(new customer("amit", 33));
		 c.add(new customer("gagan", 13));
		 c.add(new customer("ritu", 53));
		 c.add(new customer("kamal", 28));
		 
		System.out.println(c);
		
		Collections.sort(c);
		
		System.out.println(c);
		

	}

}

