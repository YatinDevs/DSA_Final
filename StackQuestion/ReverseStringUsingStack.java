package StackQuestion;
import java.util.*;

public class ReverseStringUsingStack {
	
	public static String  reverseString(String str) {
		Stack<Character> stack = new Stack<>();
		char charArr[]=str.toCharArray();
		
		for(int i=0;i<charArr.length;i++) {
			char ch = charArr[i];
			stack.push(ch);
		}
		

		for(int i=0;i<charArr.length;i++) {
			charArr[i]=stack.pop();
		}
		
		
		return new String(charArr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         String str = "GeeksforGeeks";
         String revString = reverseString(str);
         System.out.println(revString);
      }

}
