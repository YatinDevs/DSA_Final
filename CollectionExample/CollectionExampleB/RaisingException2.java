package Exceptionhandlingprograms;
//wap to check if password ==1234 then print welcome else throw exception
//throw --> used to raise exception explicitly 

public class RaisingException2 {

	public static void main(String[] args) {
		
	 try
	 {
		int password=14;
		if( password==1234)
		{
			System.out.println("welcome user ");
		}
		else
			 throw   new ArithmeticException();
		
	 }
	 catch(ArithmeticException g)
	 {
		 System.out.println(" error occured");
	 }
	System.out.println("end of program ");
	}

}
//in above case if exception occur then program will terminate 
