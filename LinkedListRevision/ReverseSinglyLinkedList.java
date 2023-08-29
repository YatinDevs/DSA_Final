package LinkedListRevision;

import RevisionDSA2.Node;

public class ReverseSinglyLinkedList {
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

 	public  void ReversePI() {
 		
 		if(head == null || head.next==null) {
     		return ;
     	} 
 		
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
 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSinglyLinkedList list = new ReverseSinglyLinkedList();
		list.addFirst(6);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
       // list.reversePI();
		list.display();
		
        list.head = list.reverseRecursive(list.head);
		
//		list.ReversePI();
		list.display();
	}

}
