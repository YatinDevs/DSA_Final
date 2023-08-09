package Stack;
import java.util.*;
import java.util.Stack;

public class StackImplementation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// Declaration of Stack :	
     Stack<Integer> st = new Stack<>();
               
    // Last in First Out      
    
        
     // All the Methods Of Stack:
             
     // [1]. st.empty();
             // Modifier and Type  ---->	boolean.
             // Method Description ----> The method checks the stack is empty or not.
             if(st.empty()) {
            	 System.out.println("Stack Is Empty!!");
             }
             else {
            	 System.out.println("Stack Is Not Empty!!");
             }
      // [2]. st.push();  
             //  Modifier and Type  ---->	E.
             //  Method Description ----> The method pushes (insert) an element onto the top of the stack.
             st.push(100);
             st.push(200);
             st.push(300);
             st.push(400);
             st.push(500);

             System.out.println(st);

      // [3]. st.pop();
         //  Modifier and Type  ---->	E.
         //  Method Description ---->The method removes an element from the top of the stack and returns
         //  the same element as the value of that function.
            int poppeditem = st.pop();
            System.out.println(poppeditem);
            System.out.println(st);

             
      // [4]. st.peek();
             //  Modifier and Type  ---->	E.
             //  Method Description ---->	The method looks at the top element of the stack without removing it. 
             
             int num = st.peek();
             System.out.println(num);
             System.out.println(st);
       
      // [5]. st.search();     
             //  Modifier and Type  ---->	int.
             //  Method Description ---->	The method searches the specified object and returns the position of the object.
             int idx = st.search(300);
             System.out.println(idx);
             if(st.empty()) {
            	 System.out.println("Stack Is Empty!!");
             }
             else {
            	 System.out.println("Stack Is Not Empty!!");
             }
             
 	}
            
}
