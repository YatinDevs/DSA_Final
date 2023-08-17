package Stack;
import java.util.*;

public class StackImpUsingArray {
	private int top ;
	private int arr[];
	
	
	public StackImpUsingArray(int capacity) {
		top = -1;
		arr = new int [capacity];
	}
	
	public StackImpUsingArray() {
		this(10);
	}
   
	public int size() {
		return top+1;
	}
	public boolean isFull() {
		
		return arr.length == size();
	}
	
	public boolean isEmpty() {
		return top<0;
	}
	// constructors
	
	public void push (int data) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full");
		}
		top++;
		arr[top] = data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("Stack is Empty");
		}
		int result = arr[top];
		top--;
		return result;
	}
	
	public int peek() {
		if(isEmpty()) {
			return -1;
		}
		return arr[top];
	}
	public void printStack() {
		
		if(top<0) {
			throw new RuntimeException("Stack is Empty");
		}else {
		for(int i=top;i>-1;i--) {
		     System.out.print( arr[i] + " ");

		}
	     System.out.println(  " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImpUsingArray stack = new StackImpUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
        stack.push(50);
        
        stack.printStack();

     int popped =  stack.pop();
     System.out.println("popped element : "+popped);
     System.out.println("Top ELement : "+ stack.peek());
     stack.pop();
     System.out.println("Top ELement : "+ stack.peek());
     stack.printStack();

	}
}
