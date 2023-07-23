package DSAself;

import java.util.Scanner;

public class StringOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Write a function that takes a string and a target character as input and counts the
		 *  number of occurrences of the target character in the string.

           For example, if the inputs are "Hello" and "l", the function should return 2.
           
		 */
		Scanner sc=new Scanner(System.in);
		
		 String str = sc.nextLine();
	        char target = 'l';
	        
	        int count = 0;
	        
	        for (int i = 0; i < str.length(); i++) {
	        	
	            if (str.charAt(i) == target) {
	                count++;
	            }
	        }
	    
	        
	        
	        
	        
	        System.out.println("occurrences :" + count);
	}

}
