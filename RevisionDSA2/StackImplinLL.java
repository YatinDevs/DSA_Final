package RevisionDSA2;
import java.util.*;

public class StackImplinLL {
    
	private ListNode top;
    private int length ; 
    
    public boolean isEmpty() {
    	return top==null;
    }
    public void push (int data) {
    	ListNode new_node = new ListNode(data);
    	new_node.next = top;
    	top = new_node;
    	length++;
    }
    
    public int pop() {
    	if(top==null) {
    		return -1;
    	}
    	int result = top.data;
    	ListNode c = top;
    	top = top.next;
    	c.next =null;
    	length--;
    	return result;
    }
    
    public int peek() {
    	if(top==null) {
    		return -1;
    	}
    	return top.data;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
      Stack<Integer> s = new Stack<>();
		*/
		StackImplinLL s = new StackImplinLL();
		s.push(7);
		s.push(9);
		s.push(4);
		s.push(5);
		s.push(3);
	//	s.pop();
		if(s.isEmpty()){
		    System.out.println("empty");
		}
		else{
		    System.out.println("not empty");
		}
		
		int num = s.peek();
		System.out.println(s.length);
      
	}

}
