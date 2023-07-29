package SinglyLinkedList;

public class ReverseSinglyLinkedList {
        public Node head;
        
	    public static Node reverseList(Node head) {
	    	Node current = head;
	    	Node previous = null;
	    	Node next = null;
	    	while(current != null) {
	    		
	    		next = current.next;
	    		current.next = previous;
	    		previous = current;
	    		current = next;
	    	}
	        return previous;
	    }
	    public void printList(Node head) {
	    	
	    	Node current = head;
	    	
	    	while(current!=null) {
	    		System.out.print(current.data + " --> ");
	    		current = current.next;
	    	}
	    	System.out.print("null");
	    	System.out.println(" ");

	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();

		   list.head = new Node (1);
	       Node second = new Node(2);
	       Node third = new Node(3);
	       Node fourth = new Node(4);
	       Node fifth = new Node(5);
	       Node sixth = new Node(6);
	       list.head.next=second;
	       second.next = third;
	       third.next = fourth;
	       fourth.next = fifth;
	       fifth.next = sixth;
	   list.printList(list.head);
	   Node startNode= list.reverseList(list.head);
	   list.printList(startNode);


	}

}
