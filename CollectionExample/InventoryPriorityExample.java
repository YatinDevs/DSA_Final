package CollectionExample;
import java.util.*;

class Inventory
{
	String pname;
	int price;
	public Inventory(String pname, int price) {
		super();
		this.pname = pname;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n  [pname=" + pname + ", price=" + price + "]";
	}
	
}
class priceComparator implements Comparator<Inventory>
{

	@Override
	public int compare(Inventory o1, Inventory o2) 
	{
		 if(o1.price>o2.price)  
			 {
			 return  1;
			 }
		 else if(o1.price<o2.price)
			 {
			 
			 return  -1;
			 }
		 return 0;
	}
	
}
public class InventoryPriorityExample {

	public static void main(String[] args) {
//    PriorityQueue <String> n= new	PriorityQueue();
//    n.add("amit");
//    n.add("neha");
//    n.add("bina");
//    n.add("kamal");
//    n.add("cheena");
//    System.out.println(n.poll());
//    System.out.println(n.poll());
//    System.out.println(n.poll());
//    System.out.println(n.poll());
    
		PriorityQueue <Inventory> n= new	PriorityQueue(10, new priceComparator());
		n.add(new Inventory("monitor", 2300));
		n.add(new Inventory("keyboard", 1300));
		n.add(new Inventory("cpu", 22300));
		n.add(new Inventory("mouse", 600));
		n.add(new Inventory("router", 4678));
		System.out.println(n.poll());
		System.out.println(n.poll());
		System.out.println(n.poll());
		System.out.println(n.poll());
	}

}
