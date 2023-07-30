package SinglyLinkedList;
import java.util.*;
public class ReversePointerIterative {
	/*
	  In summary, the reversePI method has a time complexity of O(n)
	  and a space complexity of O(1). It efficiently reverses the
	  linked list by updating pointers without using any 
	  additional data structures.
	  
	  3 Pointers Approach.
	  
	 */
	private Node head;
	
	public void add(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	public void display() {
		Node c = head;
		while(c!=null) {
			System.out.print(c.data + " --> ");
			c=c.next;
		}
		System.out.print("null");
		System.out.println(" ");

	}
	// 1. Get Size of LL
    public int countNode(Node head) {
    	int size = 0;
    	Node c = head;
    	while(c!=null) {
    		c = c.next;
    		size++;
    	}
    	return size;
    }
    public Node reversePI() {
    	if(head == null || head.next==null) {
    		return head;
    	}
    	Node c = head;
    	Node p = null;
    	while(c!=null) {
    		
    		Node next = c.next;
    		c.next = p;
    		// update
    		p = c;
    		c = next; 

    	}
    	head.next = null;
    	head = p;
    	return head;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversePointerIterative list = new ReversePointerIterative();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       
        list.display();
        list.reversePI();
        list.display();
	}

}

