package CollectionExampleB;

import java.util.Scanner;

//collection with multiple type 
class Data3<T ,T1>
{
	T x;
	T1 y;
	public Data3(T x, T1 y) {
		super(); //to call parent class constructor 
		this.x = x;
		this.y = y;
	}
	
	void display()
	{
		System.out.println(this.x + "  "+ this.y);
		
		
	}
}


public class GenericMultipleType {

	public static void main(String[] args)
	{
		
		Scanner s= new Scanner(System.in);
		int a= s.nextInt();
		String b= s.next();
		
		Data3<Integer,String> w= new Data3(a,b);
		
		
		w.display();
		Data3<String, Integer> w1= new Data3("Neha",1234);
		w1.display();

	}

}
