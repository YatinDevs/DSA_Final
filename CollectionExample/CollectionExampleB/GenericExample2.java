package CollectionExampleB;

//this is an example for generic classes
class Calculator2<T>
{
	T a;
	T sum(T a,T b)
	{
		if(a instanceof Integer  && b instanceof Integer) 
		{
			System.out.println("integer sum ");
			
		   return (T) ( new Integer((Integer)a+    (Integer)b));
		   
		}
		else if(a instanceof Float  && b instanceof Float)
		{System.out.println("Float sum ");
			   return (T)(new Float((Float)a+(Float)b));
		}
		else
			return null;
	}
	void sum2(T a,T b)
	{
		if(a instanceof Integer  && b instanceof Integer) 
		{
			System.out.println("integer sum ");
			
		   System.out.println(( ((Integer)a+  (Integer)  b)));
		   
		}
		else if(a instanceof Float  && b instanceof Float)
		{System.out.println("Float sum ");
		System.out.println(((new Float((Float)a+(Float)b))));
		}
		else
			System.out.println(" wrong value ");
	}
}
public class GenericExample2 {

		
	
	public static void main(String[] args) {
        
		Calculator2 <Integer> u= new Calculator2();
		int e= u.sum(10, 20);
		System.out.println("sum="+ e );
		
		Calculator2 <Float> u1= new Calculator2();
		System.out.println("sum=" + u1.sum(10.2f, 20.5f));
		
		
		Calculator2 <String> u3= new Calculator2();
		 u3.sum2("hello" ,"world");
		 

	}
}
