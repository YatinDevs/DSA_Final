package DSAself;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {
	
	 private static String reverseString(String input) {
	        char[] chars = input.toCharArray();
	        int left = 0;
	        int right = chars.length - 1;
	        
	        while (left < right) {
	            char temp = chars[left];
	            chars[left] = chars[right];
	            chars[right] = temp;
	            left++;
	            right--;
	        }
	        
	        return new String(chars);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(in);
		  System.out.print("Enter a string: ");
		  
          String input = bf.readLine();

          String reversed = reverseString(input);

          System.out.println("Reversed string: " + reversed);
		  } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
