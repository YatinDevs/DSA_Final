package Stack;
import java.util.*;

public class StackImplinLL {
   
	private Node top;
	private int length;
	
	public boolean empty() {
		
		if(top == null) {
			return true;
		}
		return false;
	}
   
	public int size() {
		return length;
	}
	
	public void push(int data) {
		Node n = new Node(data);
		if(top == null) {
		    top = n;
		}
		else {
			n.next = top;
			top = n;
			
		}
		length++;
	}
	public int pop() {
		int popped;
		if(top == null) {
	          return -1;
		}else {
			Node n = top;
			popped = n.data;
			top = n.next;
			n.next = null;
		}
		return popped;
	}
	public int peek() {
		if(top == null) {
			return -1;
		}
		Node n = top;
		return n.data;
	}
	public void printStack() {
		Node c = top;
		while(c!=null) {
			System.out.print(c.data + " --> ");
			c = c.next;
		}
		System.out.print("null");
		System.out.println(" ");
	}
	public int search(int target) {
		Node n = top;
		while(n!=null) {
			if(n.data == target) {
				 return n.data; 
			}
			n = n.next;
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          StackImplinLL stack = new StackImplinLL();
          stack.push(100);
          stack.push(200);
          stack.push(300);
          stack.printStack();
    	System.out.println(stack.pop());
          stack.push(400);
          stack.push(500);
  		System.out.println( stack.peek());
          stack.printStack();
   	System.out.println( stack.search(300));
   	System.out.println( stack.search(200));

	}

}
