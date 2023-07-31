package Exceptionhandlingprograms;

//can we write try without catch  --yes  
public class FinallyExample {

	public static void main(String[] args) {

    try{
    	
    
		  int y[]= new int [10];
		  
		  y[550]= 1245;
		  
    }
    //finally block will be always executed in presence or absence of 
    //exception 
    //if exception occure then iyt will execute finally and program will terminate
    
    finally 
    {
    	System.out.println(" thanks and bye ");
    }
    System.out.println("end of program");
	}

}
