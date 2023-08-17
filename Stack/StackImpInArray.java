package Stack;
import java.util.*;

public class StackImpInArray {
     
	private int top;
	private int arr[];
	
	public StackImpInArray(int capacity) {
		top=-1;
		arr = new int[capacity];
    }
	public StackImpInArray()
	{
		this(10);
	}	
	
	public int size() {
		return top+1;
	}
	public boolean empty() {
		return top<0;
	}
	public boolean isFull() {
		return arr.length == size();
	}
	public void push(int data) {
		if(isFull()) {
			throw new RuntimeException("Stack is Full.");
		}
		else {
			arr[++top] = data;
		}
	}
	public int pop() {
		if(empty()) {
			throw new RuntimeException("Stack is Empty.");
		}
	
			int result = arr[top];
			top--;
	
		return result;
	}
	public int peek() {
		if(empty()){
			return -1;
		}
		int result = arr[top];
		return result;
	}
	public int search(int target) {
		
		for(int i=0;i<top;i++) {
			if(arr[i]==target) {
				return arr[i];
			}
		}
		return -1;
	}
	public void printStack() {
		
		System.out.print("[");
		for(int i=0;i<top;i++) {
			if(i<top-1) {
			System.out.print(arr[i]+",");
			}else {
			System.out.print(arr[i]);
			}
		}
		System.out.print("]");
		System.out.println("");


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackImpInArray stack = new StackImpInArray();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
	 stack.printStack();
	 int popped =  stack.pop();
	 System.out.println("popped element : "+popped);
	 System.out.println("Top ELement : "+ stack.peek());
	 stack.pop();
     System.out.println("Top ELement : "+ stack.peek());
     stack.printStack();
 	System.out.println( stack.search(500));
   	System.out.println( stack.search(200));


	}

}
