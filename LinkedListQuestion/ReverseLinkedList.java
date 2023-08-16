package LinkedListQuestion;
import java.util.*;

public class ReverseLinkedList {
	private Node head;
	private int length;
	
	public boolean empty() {
		return length==0;
	}
	
	public int size() {
		return length;
	}
	
	public void addFirst(int data) {
		length++;
		Node n = new Node(data);
		
		n.next = head;
		head = n;
	}
	public void display() {
		Node c = head;
		while(c!=null) {
			System.out.print(c.data + " --> ");
			c =c.next;

		}
		System.out.print("null");
		System.out.println("  ");
	}
	public Node reversePI() {
		if(head==null) {
			return head;
		}
		Node p = null;
		Node c = head;
		while(c!=null) {
			Node n = c.next;
			c.next = p ;
			
			p = c;
			c = n;
		}
        head.next = null;
        head = p;
		return head;
	}
	// Time Complexity: O(N), Traversing over the linked list of size N. 
    // Auxiliary Space: O(1)

    public Node reverseRecursive(Node head) {
    	if(head == null || head.next == null) {
    		return head;
    	}
    	Node restlist = reverseRecursive(head.next);
    	head.next.next = head;
    	head.next = null;
    	return restlist;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedList list = new ReverseLinkedList();
		
		list.addFirst(6);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
       // list.reversePI();
        list.head = list.reverseRecursive(list.head);
		list.display();
	}

}
