package CollectionExample;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class BookRecord
{
	String bname;
	int price;
	public BookRecord(String bname, int price) {
		super();
		this.bname = bname;
		this.price = price;
	}
	 void display()
	 {
		 System.out.println(this.bname + "  "+ this.price);
	 }
	@Override
	public String toString() {
		return "BookRecord [bname=" + bname + ", price=" + price + "]";
	}
}
public class BookVectorSolution {

	public static void main(String[] args) 
	{
		Vector <BookRecord>y= new Vector();
		Scanner s= new Scanner(System.in);
		String ch="";
		do
		{
		System.out.println("enter book name and price");
		String x1=s.next();
		int y1= s.nextInt();
		y.add(new BookRecord(x1,y1));
		System.out.println("Add more books press yes or no");
		ch= s.next();
		}
		while(!ch.equals("no"));
	
		
		
		y.forEach((temp)->{System.out.println(temp);});
		
		
		for(int i=0;i<y.size();i++)
		{			BookRecord k= y.get(i);
		             if(k.price>1000)
			            k.display();
		}
		
		Iterator  i= y.iterator();
		while(i.hasNext())
		{
			 BookRecord t=(BookRecord)i.next();
			 
			 t.display();
		}
		
		
		
	
	}
	
	 
}
