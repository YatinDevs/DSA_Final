package Exceptionhandlingprograms;

import java.util.*;

public class Example1 {

	public static void main(String[] args) 
	{
		
		try
		{
		Scanner s= new Scanner(System.in);
		System.out.println("enter two numbers ");
		int x=s.nextInt();
		int y= s.nextInt();
		int z= x/y;
		System.out.println("divsion ="+ z);
	   }	
	
		catch(ArithmeticException abc)
	   {
		System.out.println( " cannot divide by zero");
		System.out.println(abc);
		System.out.println(abc.getMessage());
		//abc.printStackTrace();
		
	   }
		catch(InputMismatchException  mi)
		{
			System.out.println(" plz enter correct format of data ");
			mi.printStackTrace();
		}
		//exception  is always written on last 
		catch(Exception d)
		{
			System.out.println("other error");
		}
		
		System.out.println(" end of program ");

}}
