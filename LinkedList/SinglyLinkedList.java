package LinkedList;
import java.util.*;
public class SinglyLinkedList {
	
	private Node head; // Declaring Head Node Which is Always Null at Beginning.      Head ----> Null
	
	public void display() {
	      Node current = head;
	      
	      while(current!= null) {
	    	  System.out.print(current.data + " ---> ");
	    	  current=current.next;
	      }
	      System.out.print("null");
	      System.out.println("");

	}
	
	public void addAtFirst(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head= newNode;
	}
	
	public void addAtEnd(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node current=head;
		while(current.next!=null) {
			current=current.next;
		}
		current.next=newNode;
	}
	
	public void insertAt(int data,int position) {
		
		 Node temp = new Node(data);
		 /*
		    temp.data=data;
		    temp.next=null;
		 */
		 Node n = this.head;
		 
		 for(int i=1;i<=position-2;i++) {
			 n=n.next;
		 }
		 
		 temp.next= n.next;
		 n.next=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList list=new SinglyLinkedList();
		
		list.head=new Node(10); // Initializing Assigning Value to Head //   data: 10    next : null
		Node second= new Node(1);  //   data: 1    next : null
		Node third = new Node(8);  //   data: 8    next : null
		Node fourth = new Node(11);//   data: 11    next : null
		
		// Now we will connect all Nodes Together to form Chain
		
        list.head.next= second; // 10 ---> 1 ----> null
        second.next =third;     // 10 ---> 1 ----> 8 ----> null
        third.next = fourth;    // 10 ---> 1 ----> 8 ---> 11 ----> null
        
        // Print the Linked List
        list.display();
       // Adding Node at Beginning of Singly Linked List
        list.addAtFirst(21);
        list.display();
        // Adding Node at End of Singly Linked List
        list.addAtEnd(5);
        list.display();
        
        // Adding at any Position
        list.insertAt(3, 4);
        list.display();

        
	}

}
