package Stack;
import java.util.*;

public class StackImplementationInLL {
	
     private Node top;
     private int length;
     
     public void push(int data) {
    	 
    	  Node n = new Node(data);
    	  
    	  if(top == null) {
    		  top = n;
    	  }else {
    		  n.next = top;
    		  top = n;
        	  length++;
    	  }	  
     }
     
     public int pop() {
    	 int temp;
    	 if(top == null) {
    		  return -1;
   		  }
    	 else {
    	   Node n = top;
    	   temp = n.data;
    	   top = n.next;
           n.next = null;
           
    	 }
    	 return temp;
     }
     
     public boolean empty() {
    	 if(top == null) {
    		 return true;
    	 }
    	return false;
     }
     
     public int peek () {
    	 if(top == null) {
    		 return -1;
    	 }	 
    	 Node n = top;   	 
    	 return n.data;
     }
     
     public void printStack() {
    	 if(top == null) {
    			System.out.println("Stack is Empty!!");
    	 }
    	 else {
    		 Node n = top;
    		 
  			 System.out.print("[");
        	 while(n!= null) {
     			System.out.print( n.data + "," );
     			n = n.next;
    		 }
  			 System.out.print("]");

    	 }
     }
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImplementationInLL stack = new StackImplementationInLL();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		
		int num = stack.peek();
		System.out.println(num);
       
		boolean isEmpty = stack.empty();
		System.out.println(isEmpty);
        
		int deleteditem = stack.pop();
		System.out.println(deleteditem);
		
		stack.printStack();

	}

}
