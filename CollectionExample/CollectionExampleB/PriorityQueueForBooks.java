package CollectionExampleB;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Vector;

class BookData
{
	String bname;
	int price;
	 
	public BookData(){}
	@Override
	public String toString() {
		return "\n [bname=" + bname + ", price=" + price  +"";
	}
	public BookData(String bname, int price) {
		super();
		this.bname = bname;
		this.price = price;
		 
	}
	
}
public class PriorityQueueForBooks {

	public static void main(String[] args) {
		
		BookData b= new BookData("java",10);
		BookData b1= new BookData("c"  ,20);
		BookData b2= new BookData("c++",23);
		BookData b3= new BookData("oracle",10);
		BookData b4= new BookData("OS",30);
		BookData b5= new BookData("php",200);
		BookData b6= new BookData("cloud",26300);
		
     // Vector<BookData> v= new Vector();
		PriorityQueue <BookData> v = new PriorityQueue<BookData> (10, new BookComparator());//Comparator -->compare
      v.add(b);
      v.add(b1);
      v.add(b2);
      v.add(b3);
      v.add(b4);
      v.add(b5);
      v.add(b6);
      System.out.println(v.poll() );
      System.out.println(v.poll());
      System.out.println(v.poll());
      
      
	}

}

class BookComparator implements Comparator<BookData>
{

	@Override
	public int compare(BookData o1, BookData o2) 
	{
		 if(o1.price > o2.price)
			 return 34;
		   if(o1.price<o2.price)
			 return  -1;
		  
			 return 0;
	}
	
}
