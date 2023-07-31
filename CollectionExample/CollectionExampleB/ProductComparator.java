package CollectionExampleB;
import java.util.*;
class Product3
{
	String name;
	int price;
	@Override
	public String toString() {
		return "\n [name=" + name + ", price=" + price + "]";
	}
	public Product3(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}

class productpriceComparator implements Comparator<Product3>
{

	@Override
	public int compare(Product3 a, Product3 b) {
		
		if(a.price>b.price)
			return  1;
		
		else if(a.price<b.price) 
			return -1;
		
		return 0;
	}
	
}
public class ProductComparator {

	public static void main(String[] args) {
		ArrayList <Product3> p= new ArrayList();
		p.add(new Product3("table",1230));
		p.add(new Product3("lamp",2500));
		p.add(new Product3("decorativeitem",2200));
		
		System.out.println(p);
		Collections.sort(p,new productpriceComparator());
		System.out.println(p);
		
		

	}

}
