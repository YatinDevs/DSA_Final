package LeetCodeQuestions;
import java.util.*;

public class ReverseString {
	
	 public static void reverseString(char[] s) {
         int start = 0;
         int end = s.length-1;
         
         while(start<=end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
         }
      
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /*
        Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
       */
		char s[] = {'h','e','l','l','o'};
		
	
		
	}

}
