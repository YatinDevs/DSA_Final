package CollectionExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) 
	{
		Stack<String> s= new Stack<String>();
		s.add("neha");
		s.add("puja");
		s.add("kamal");
		s.push("Om"); //push is used to add data
		System.out.println(s.peek());//peek is used to  show last element 
		System.out.println(s.pop());//pop is used to remove data 
		System.out.println(s.pop());//pop is used to remove data 
		//System.out.println(s.pop());//pop is used to remove data 
		
		
		
		
	
	}

}
