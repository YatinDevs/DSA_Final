package RevisionDSA2;
import java.util.*;



public class ReverseLinkedList {
	
	private Node head;
	private int length;
	
	public int size() {
		return length;
	}
	public boolean empty() {
		if(head==null && length==0) {
			return true;
		}
		return false;
	}
	/* Display */
	public void display() {
	
		
		Node c = head;
     	if(empty()) {
     		System.out.println("[]");
     		return;
		}
		System.out.print("[");
		while(c!=null) {
			System.out.print(c.data + " ");
		  
			c=c.next;
		}
		System.out.print("]");
		System.out.println("");


	}
	/* Insertion */
	public void addFirst(int data) {
		Node n = new Node(data);
		
		n.next = head;
		head = n;
		length++;
	}
	
	public  void ReversePI() {
		
		if(head == null || head.next==null) {
    		return ;
    	} 
		/*
		  
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
		 */
		 Node curr = head;
		 Node prev = null;
		 while(curr!=null) {
			 Node next = curr.next;
			 curr.next = prev;
			 
			 prev = curr;
			 curr = next;
		 }
		 head.next = null;
		 head = prev;
		 
		 return ;
	}
	
	public static Node reverseRecursive(Node head) {
		
		if(head == null || head.next==null) {
    		return head;
     	} 
		
	   Node rest = reverseRecursive(head.next);
		head.next.next = head;
		head.next = null;
		
		head = rest;
			
		return rest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList list = new ReverseLinkedList();
		
		
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(40);
		Node fourth = new Node(50);
		Node fifth = new Node(60);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
        list.display();
		list.ReversePI();
		list.display();

		
/*
 
Input: Head of following linked list 
1->2->3->4->NULL 
Output: Linked list should be changed to, 
4->3->2->1->NULL

Input: Head of following linked list 
1->2->3->4->5->NULL 
Output: Linked list should be changed to, 
5->4->3->2->1->NULL

*/
	}

}
