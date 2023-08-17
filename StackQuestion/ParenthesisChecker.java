package StackQuestion;
import java.util.*;

public class ParenthesisChecker {
	
	 public static boolean checkParenthesis(String x) {
		 
		 Stack<Character> stack = new Stack<>();
		 
		 for(int i=0;i<x.length();i++) {
			  char currentch = x.charAt(i);
			  
			  if(currentch == '(' || currentch == '{' || currentch == '[') {
				   stack.push(currentch);
				   continue;
			  }
			  
			  if(stack.empty()) {
				  return false;
			  }
			  
			  char topChar = stack.peek();
			  stack.pop();
			  
			  switch (currentch) {
			case ')': 
				if(topChar=='{' || topChar == '[') {
				return false;
			    }
				break;
			case '}': 
				if(topChar=='(' || topChar == '[') {
				return false;
			    }
				break;
		   case ']': 
				if(topChar=='{' || topChar == '(') {
					return false;
				  }
				break;
		
			}
		 }
		 
		 if(stack.empty()) {
			 return true;
		 }
		 return false;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		
		if(checkParenthesis(x)) {
			System.out.println("Is Balanced.");
		}else {
			System.out.println("Is Not Balanced.");

		}
		
	}

}
