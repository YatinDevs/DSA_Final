package Exceptionhandlingprograms;

import java.util.*;

public class Example2 {

	public static void main(String[] args) {
		 
		try
		{
		Scanner s= new Scanner(System.in);
		System.out.println("enter two numbers ");
		int x=s.nextInt();
		int y= s.nextInt();
		int z= x/y;
		System.out.println("divsion ="+ z);
	   }	
			
		// in case if we want standard error message for all exception then define only 1 Exception 
		//in catch block
		catch(Exception d)
		{
			System.out.println("exception occured");
			System.out.println(d);
		}
		
		System.out.println(" end of program ");

}}
