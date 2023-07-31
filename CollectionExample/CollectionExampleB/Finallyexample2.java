package Exceptionhandlingprograms;

public class Finallyexample2 {

	public static void main(String[] args) {

	    try{
	    	
	    	  int y[]= new int [10];
			  y[550]= 1245;
	    }
	    catch(Exception f)
	    {
	    	System.out.println(" excepytion occured");
	    	f.printStackTrace();
	    }
	    finally 
	    {
	    	System.out.println(" thanks and bye ");
	    }
	 }
	}
