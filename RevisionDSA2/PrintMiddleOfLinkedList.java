package RevisionDSA2;
import java.util.*;

public class PrintMiddleOfLinkedList {
	
	Node head;
	int length;
	
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
			if(c.next!=null) {
			System.out.print(c.data + ",");
			}else {
			System.out.print(c.data);
			}
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
	
	/* Print Middle of Node */
	public void middleElement(Node head) {
		
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			
			   slowPtr = slowPtr.next;
			   fastPtr = fastPtr.next.next;
		}
		
		System.out.println(slowPtr.data);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMiddleOfLinkedList list = new PrintMiddleOfLinkedList();
//		list.addFirst(50);
//		list.addFirst(40);
//		list.addFirst(30);
//		list.addFirst(20);
		list.addFirst(10);
		
		list.display();
		
		list.middleElement(list.head);
		
		list.display();
		
		/*
		  [10,20,30,40,50]
          30
          [10,20,30,40,50]

		  [10,20,30,40]
           30
          [10,20,30,40]
          
          [10,20,30]
          20
          [10,20,30]
          
          [10,20]
          20
          [10,20]
          
          [10]
          10
          [10]



		 */
  
		
		

	}

}
