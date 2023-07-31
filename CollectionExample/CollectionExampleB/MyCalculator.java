package Exceptionhandlingprograms;

public class MyCalculator {

	
 
static int power(int n,int p)throws Exception
{
//try {
if  (n<0 ||p<0)              throw new Exception(" number cannot be negative");

if  ( n==0|| p==0)           throw new Exception(" number cannot be zero");

//}catch( Exception f)  {System.out.println(f.getMessage());}

return  (int)Math.pow(n,p);// power function return double so we typecasted double to int 
 
}

public static void main(String args[]) 
{
	try
	{
      System.out.println(power(2,3));

	}catch(Exception r){System.out.println("in main exception");} 
	
	System.out.println("javba world");
}
	
}