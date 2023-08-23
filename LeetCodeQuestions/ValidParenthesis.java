package LeetCodeQuestions;
import java.util.*;

public class ValidParenthesis {
    
	  public boolean isValid(String s) {
	         Stack<Character> sstack = new Stack<>();
	         
	         for(int i=0;i<s.length();i++){
	             char currch = s.charAt(i);
	             if(currch == '[' || currch == '(' ||currch == '{'  ){
	                 sstack.push(currch);
	             }else{
	                 if(sstack.isEmpty()){
	                     return false;
	                 }else{

	                     char topChar = sstack.peek();

	                     if((topChar == '(' && currch == ')') ||
	                    (topChar == '{' && currch == '}') ||
	                    (topChar == '[' && currch == ']') ){
	                        sstack.pop();
	                    }else{
	                        return false;
	                    }
	                 }
	             }
	         }
	         return sstack.isEmpty();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
