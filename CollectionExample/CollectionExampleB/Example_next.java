package Exceptionhandlingprograms;
// unchecked checked --> need not be handled in source code they checked at runtime 
//class SpeedCheckException extends RuntimeException
//checked exception 
class SpeedCheckException extends Exception

{
	SpeedCheckException()
	{
	System.out.println(" plz control speed of your vehicle ");
	}
	
}
class vehicle
{
	void speed(int y)       throws SpeedCheckException
	{
		if( y>160) 			throw new SpeedCheckException();
	}	
}
 public class Example_next 
 
 {

	public static void main(String[] args)//  throws   SpeedCheckException,Exception
	{
		try	
		{
		    vehicle v= new vehicle();
		
		    v.speed(180);
		
		 } catch(SpeedCheckException r)	
		     {
			 System.out.println(" speed limit is 120");		
			 }
	}

}
