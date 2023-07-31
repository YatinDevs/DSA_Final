package CollectionExample;
//problem statement 
//array size and tyep are fixed that cannot grow or reduce
//c++  --> template 
//java --> Generic classes 
class Calculator<T>
{
	T a,b;
	
	T  sum ( T x,T  y)
	{
	 	a=x;
		b=y;
		//if(a instanceof Integer && b instanceof Integer )
			
		//return (Integer)(((Integer)(a)).intValue()) + (((Integer)(b)).intValue());
		
		//else if(a instanceof Float && b instanceof Float )
		//    return (Float) (a+b);
		
		//else 
			return null;
		
}}
 

public class GenericExample1 {

	public static void main(String a[])
	{
		Calculator <Integer>c= new Calculator<Integer>();
		System.out.println(c.sum(10,20));
		Calculator <Float>c1= new Calculator<Float>();
		System.out.println(c1.sum(10.3f,20.4f));
		Calculator <String>c3= new Calculator();
		System.out.println(c3.sum("hello","world"));
		
		
		
	}
}
