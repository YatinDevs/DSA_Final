package Exceptionhandlingprograms;

public class CheckedUnchecked {

	public static void main(String[] args) {
try{
   int y=100;
   
   if( y>50)           throw new Exception();  //checked exception
   else if (y>30)	   throw new ArithmeticException();//unchecked
   else          	   throw new ArrayIndexOutOfBoundsException();//unchecked
   
}
catch(ArithmeticException t){}
catch(ArrayIndexOutOfBoundsException kk){}
catch(Exception f){}


	}

}
