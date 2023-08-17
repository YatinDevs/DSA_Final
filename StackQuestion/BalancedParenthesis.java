package StackQuestion;
import java.util.*;
public class BalancedParenthesis {

    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0;i<x.length();i++){
            char currCh = x.charAt(i);
            if(currCh == '{'|| currCh == '(' || currCh == '['){
                 stack.push(currCh);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char topChar = stack.peek();
                    if((topChar == '(' && currCh==')')||
                    (topChar == '{' && currCh=='}')||
                    (topChar == '[' && currCh==']')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = "{[]()}";
		
		if(ispar(s)){
		    System.out.println("balanced");
		}
		
		else{
		    System.out.println("not balanced");
		}

	}

}
