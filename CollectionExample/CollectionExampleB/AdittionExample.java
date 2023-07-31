package CollectionExampleB;
class Addition<T>
{
	T sum( T a,T b)
	{
		
  if( a instanceof String && b instanceof String)
  {	 System.out.println("string ");
		String  result2=  (String)a  + (String)b ;
		return   (T)result2;
  }	
  else if( a instanceof Float && b instanceof Float)
  { System.out.println("float ");
	  		
		Float result1=  (Float)a  + (Float)b ;
		return   (T)result1;
  }	
  else if( a instanceof Integer && b instanceof Integer)
	  	
  { System.out.println("Integer ");
		Integer result=  (Integer)a  + (Integer)b ;
		return   (T)result;
  }
    else	  return null;
			}
}



public class AdittionExample {

	public static void main(String[] args) {
 
		Addition <Integer> x= new Addition();
		System.out.println(x.sum(10, 20));
		
		
		Addition <String> x1= new Addition();
		System.out.println(x1.sum("hello" ," java"));
		
		
		
		
		

	}

}
