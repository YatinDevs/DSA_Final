package CollectionExampleB;

import java.util.*;

class Product1 implements Comparable<Product1>
{
	String name;
	int price;
	public Product1(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n  [name=" + name + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Product1 x) 
	{  // System.out.println(this.price  + "  "+ x.price);
	 if(this.price> x.price)  {
		 
		 return 1;
	 }
	 else if (this.price<x.price) return -1;
		return 0;
	}
	
}
public class ProductComparable 
{

	public static void main(String[] args) {
		
		ArrayList <Product1> r= new ArrayList<Product1>();
		
		r.add(new Product1("monitor", 2300));
		r.add(new Product1("Keyboard", 1300));
		r.add(new Product1("mouse", 300));
		r.add(new Product1("switch", 5300));
		
		System.out.println(r);
		Collections.sort(r); // comparable  | comparator 
		System.out.println(r);
		

	}

}
