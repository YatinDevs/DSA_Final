package CollectionExample;

import java.util.*;

class Book5
{
	String name;
	String aname;
	public Book5(String name, String aname) {
		super();
		this.name = name;
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Book5 [name=" + name + ", aname=" + aname + "]";
	}
	
	public void display(){
		System.out.println( "  [name=" + name + ", aname=" + aname + "]");
	}
	
	
}
public class MapBookRecord {

	public static void main(String[] args) {

    Map <String ,Book5>r= new HashMap<>();
    r.put("1",new Book5("java","herbert"));
    r.put("2",new Book5("c++","dennis"));
    r.put("3",new Book5("php","abc"));
    r.put("4",new Book5("cloud","pqr"));
    r.put("5",new Book5("xyz","e122"));
    
    //System.out.println(r);
    Collection c= r.values();
	Iterator i= c.iterator();
	//only values are displayed 
	while(i.hasNext())
	{
	//	System.out.println(i.next());//to String
		Book5 e= (Book5)i.next();
		e.display();
	}
	

	}

}
