package RevisionDSA2;
import java.util.*;

public class RecursiveReverseLL {
	
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
    public void printList(Node head) {
	    	
	    	Node current = head;
	    	
	    	while(current!=null) {
	    		System.out.print(current.data + " --> ");
	    		current = current.next;
	    	}
	    	System.out.print("null");
	    	System.out.println(" ");

	    }
	
		
		public Node reverseRecur(Node head) {
			
			if(head == null || head.next == null) {
				return head;
			}
			
			Node rest = reverseRecur(head.next);
			head.next.next = head;
			head.next = null;
			head = rest;
			
			return rest;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveReverseLL list = new RecursiveReverseLL();
		
		list.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(40);
		Node fourth = new Node(50);
		Node fifth = new Node(60);
		
		list.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
        list.printList(list.head);
		list.reverseRecur(list.head);
        list.printList(list.head);
	}

}
