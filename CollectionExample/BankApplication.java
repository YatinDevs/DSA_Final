package CollectionExample;

import java.util.Iterator;
import java.util.*;
class accountholder
{
	String name;
	String accno;
	int balance;
	public accountholder(String name, String accno, int balance) {
		super();
		this.name = name;
		this.accno = accno;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Welcome [name=" + name + ", accno=" + accno + ", balance=" + balance + "]";
	}
	
}
public class BankApplication {

	public static void main(String[] args) 
	{
	
		accountholder x= new accountholder("amit","a1223",45000);
		accountholder x1= new accountholder("neha","b31223",454000);
		accountholder x2= new accountholder("gagan","c41223",235000);
		//LinkedList<accountholder> l= new LinkedList();
		Stack<accountholder> l= new Stack();
	//TreeSet<accountholder> l= new TreeSet();
	     l.add(x);
	     l.add(x1);
	     l.add(x2); 
      Iterator i= l.iterator();
      while(i.hasNext())
     {
    	   System.out.println(i.next());
    		
     }
     	

	}

}
