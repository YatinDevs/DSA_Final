package Revision;
import java.util.*;

import LinkedList.Node;

public class SinglyLinkedListImpl {
  /*
   * 
   Topics : String, LinkedLists, Stack, Queue, Hashing.
   
  Sample questions :	Implementation of LL, STACK, Queue & their functions by 
  code, traversal , insertion, deletion, finding duplicates, merging two linked
  lists, merging linked lists in reverse
  
   */
	private Node head;
	private int length;
	
	// Check Empty
	public  boolean isempty() {
	     if(head==null) {
		      return true;
	      }
	    return false;
	
	}
	
	// Check Size
	public  int size() {
		
		return length;
	}
	
	// Display Data in LL. Traversal
	public void printList() {
         Node current = head;
	      
	      while(current!= null) {
	    	  System.out.print(current.data + " --> ");
	    	  current=current.next;
	      }
	      System.out.print("null");
	      System.out.println("");
	}
	
	// Insertion In LL.
	
	public void addFirst(int val) {
		length++;

		Node n = new Node(val);
		n.next=head;
		head = n;
		
	}
	
	public void addLast(int data) {
		length++;

		Node n = new Node(data);
		while(head==null) {
			head = n;
		}
		Node c = head;
		while(c.next!=null) {
			c=c.next;
		}
		c.next = n;	
	}
	public void add(int data,int pos) {
		length++;
		
		Node n = new Node(data);
		Node c = head;
		if(pos==0) {
			n.next = head;
			head = n;
			return;
		}
		for(int i=0;i<pos-1;i++) {
			c= c.next;
		}
		n.next = c.next;
		c.next = n;	
	}

	// Deletion Of LL.
	
	public void removeFirst() {
		length--;
		Node c = head;
		head = head.next;
		c.next = null;	
	}
	
	public void removeLast() {
		length--;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node c = head;
		while(c.next.next!=null) {
			c=c.next;
		}
		c.next = null;
	}
	public void remove(int pos) {
	   length--;
		if(head==null) {
			System.out.println("List is Empty");
			return;
		}
		Node  c = head;
		
		if(pos == 0) {
			head = c.next;
			return;
		}
		
        for(int i=0;c!=null&& i<pos-1;i++) {
            c=c.next;	 
		}
        
        if(c==null||c.next==null) {return;}
        
  		Node next = c.next.next;
  		c.next= next;
  		
	}
	// Search an Element in a Linkedlist
	public boolean search(int target) {
		Node c = head;
		while(c!=null) {
			if(c.data == target) {
				return true;
			}
		    c=c.next;

		}
		return false; // not found
	}
	// Find Length of Linked list
	 
	public int getCount() {
		int count = 0;
		Node c = head;
		while(c!=null) {
			count++;
			c=c.next;
		}
		return count;
	}
	
	// Reverse the LinkedList
	/*
	 Time Complexity: O(N), Traversing over the linked list of size N. 
     Auxiliary Space: O(1)
	 */
	public Node ReversePI() {
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
	
	public Node ReversePI(Node node) {
		//if(head == null || head.next==null) {
    		//return head;
    	//}
    	Node c = node;
    	Node p = null;
    	while(c!=null) {
    		
    		Node next = c.next;
    		c.next = p;
    		// update
    		p = c;
    		c = next; 

    	}
    	
    	node = p;
    	return node;
	}
	
	// Delete the Linked List
	public void deletelist() {
		head = null;
	}
    
	// Delete the Last Node in LL
	public void deleteLast() {
		Node temp = head;
		while(temp.next.next!=null) {
			temp = temp.next;
		}
		temp.next = null;
	}
	// Delete the First Node in LL
		public void deleteFirst() {
			Node temp = head;
			head = head.next;
			temp = null;
		}
	
	// Find Duplicates in Linked list
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedListImpl list = new SinglyLinkedListImpl();
		
		System.out.println(list.size());
		
		System.out.println(list.isempty());
		
		list.addFirst(300);
		list.addFirst(200);
		list.addFirst(100);
		
	
		list.printList();
		System.out.println(list.size());
		System.out.println(list.isempty());

		list.addLast(400);
		list.addLast(500);

		list.printList();
		System.out.println(list.size());
		System.out.println(list.isempty());
		
		list.add(400,2);
		list.printList();
		System.out.println(list.size());
		System.out.println(list.isempty());
		
		//list.removeFirst();
		//list.removeFirst();
       // list.removeLast();
        list.remove(4);
		list.printList();
		//System.out.println(list.search(30));
		System.out.println(list.getCount());
		
		list.ReversePI();
		list.printList();		

	}

}
