package StringQue;
import java.util.*;
public class reverse_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Input ");
          
         String str = sc.next();
          int n = str.length();
          
          
         // 1. Using StringBuilder . 
          StringBuilder reverseStr = new StringBuilder(str).reverse();
          
          // 2. Using Char arr.
          
          char [] strchars= str.toCharArray();
          int low = 0;
          int high = strchars.length -1;
          
         while(low<high) {
        	 
        	 char temp = strchars[low];
        	 strchars[low] = strchars[high];
        	 strchars[high] = temp;
        	 low++;
        	 high--;
        	 
         }       	 
        	 
        	 
         
         
         String newreverseStr = new String(strchars);
         
         System.out.println("Hello World " + newreverseStr + " "  + str  + " "  + n);
	}

}
