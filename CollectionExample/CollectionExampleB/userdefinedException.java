package Exceptionhandlingprograms;
//this example demonstrate how to create yuser defined exception 
//Test1 is checked exception bcz it inherits Exception class
//test2 is Runtime bcz it inherits Runtime Exception class
//checked exception
class Test1 extends Exception 
{
Test1()
{
	System.out.println("wrong value ");
}
}
//========uncheckedException
class Test2 extends RuntimeException
{
	Test2()
	{
		System.out.println("plz verify data ");
	}
}

public class userdefinedException {

	public static void main(String[] args) {
		int age =10;
		 try		 {
		if( age==10)  throw new Test1();
		else          throw new Test2();
			
		}
		catch(Exception f){			System.out.println(" exception in catch");		}
		
			
			
			
			
			
			
			

	}

}
