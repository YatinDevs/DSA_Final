package DSAself;

public class StringPalindrome {
	
	 public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        
	        return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
	          1. Write a function to check if a string contains only digits.

              2. Write a function to find the longest word in a sentence.

              3. Write a function to check if two strings are anagrams (contain the same characters in any order).
         
         */

		 String str = "racecar";
	        System.out.println(isPalindrome(str));  // Output: true

	        str = "hello";
	        System.out.println(isPalindrome(str));  // Output: false
	}

}
