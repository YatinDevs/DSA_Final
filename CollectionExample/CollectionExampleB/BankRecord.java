package CollectionExampleB;
import java.util.Iterator;
//wap to design a class for Accountholder 
//having fields like name accountno and balance 
//design constructor
//design toString  
//create another class and ask five accountholder records from user and store then in collection
import java.util.LinkedList;

class Accountholder
{   String name;
	String accountno;
	int balance;
	public Accountholder(String name, String accountno, int balance) {
		super();
		this.name = name;
		this.accountno = accountno;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accountholder [name=" + name + ", accountno=" + accountno + ", balance=" + balance + "]";
	}
	
	
}
public class BankRecord {

	public static void main(String[] args) {
		
		Accountholder a= new Accountholder ("neha","abc1244", 45000);
		Accountholder a1= new Accountholder("puja","sdbc1244", 45000);
		Accountholder a2= new Accountholder("kamal","agfgc1244", 45000);
		Accountholder a3= new Accountholder("reema","abfh244", 42000);
		Accountholder a4= new Accountholder("xyz","ab544", 45000);
		
		LinkedList <Accountholder> l= new LinkedList<>();
		l.add(a);
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
		//System.out.println(l);
		Iterator i= l.iterator();
		while(i.hasNext())	
		{	
			System.out.println(i.next());	
		}
		
		Accountholder a5= new Accountholder("himani","q123", 35000);
		l.add(0, a5);
		System.out.println(l.get(0));
		

	}

}
