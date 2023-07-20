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
    
	public void removeFirst() {
		if(head==null) {
			return ;
		}
		
        Node temp=head;
		head=head.next;
		temp.next=null;
		
	}
	
	public void deleteLast() {
		
		if(head==null||head.next==null) {
			return;
		}
		Node current=head;
		Node previous=null;
       while(null!=current.next) {
    	   previous=current;
    	   current=previous.next;
    	  
       }
       previous.next=null;
	 
	
	}
	
	public void deleteAtPos(int pos) { //4
		 if(pos==1) {
		     	head=head.next;
			}else {
				Node previous=head; // 	
				int count=1; // 1 2 3 4
				while(count<pos-1) { // 1!=4 2!=4 3!=4 4=4
					previous=previous.next; // 1  2  3
					count++; // 2 3 4
				}
				Node current=previous.next;
				previous.next=current.next;
			}
	
		
   
	}
	
	 
	 public int listSize() {
		 int count=0;
		 
		 Node n = this.head;
		 while(n!=null) {
			 count++;
			 n=n.next;
		 }
		 
		 return count;
	 }
	 
	 public boolean isListEmpty() {
		 if(this.head==null) {
			 return true;
		 }
		 
		 return false;
	 }
	 
	 public void remove(int k) {
		 Node n = this.head;
		 
		 for(int i=1;i<=k-2;i++) {
			 n=n.next;
		 }
		 
		 Node temp = n.next;
		 n.next=temp.next;
		 temp.next=null;
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
       /* 
        // Remove First Element
        list.removeFirst();
      //  list.removeFirst();
        list.display();
        //Remove Last Element
        list.deleteLast();
      //  list.display();
        list.deleteLast();

         list.display();
       */
        
        list.deleteAtPos(4);
        list.display();
        
        System.out.println(list.listSize());
        System.out.println(list.isListEmpty());

	
	}

}

/*
 * The following function takes a single-linked list of integers as a parameter and rearranges the elements of the list. The function is called with the list containing the integers 1, 2, 3, 4, 5, 6, 7 in the given order. What will be the contents of the list after the function completes execution?

class Node {

	int value;

	Node next;

}

void rearrange(Node list) {

	Node p, q;

	int temp;



	if (list == null || list.next == null) {

		return;

	}



	p = list;

	q = list.next;



	while (q != null) {

		temp = p.value;

		p.value = q.value;

		q.value = temp;

		p = q.next;

		q = p != null ? p.next : null;

	}

}
 * 
 * */
 