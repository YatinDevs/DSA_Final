package RevisionDSA2;
import java.util.*;

import LinkedList.Node;

public class SinglyLinkedList {
    
	private ListNode head;
	private int length;
	
	public boolean empty() {
		
		if(head == null) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return length;
	}
	// size
	public int getCount() {
		int count = 0;
		ListNode c = head;
		while(c!=null) {
			c = c.next;
			count++;
			
		}
		return count;
	}
	// Display 
	public void display() {
		ListNode c = head;
		while(c!=null) {
			System.out.print(c.data + " --> ");
			c = c.next;
		}
		System.out.print("null");
		System.out.println(" ");

	}
	// Insertion in SLL
	
	public void addFirst(int data) {
		length++;
		ListNode new_node = new ListNode(data);
	    new_node.next = head;
	    head = new_node;
	}
	
	public void addLast(int data) {
		length++;
		ListNode new_node = new ListNode(data);
		ListNode c = head;
		while(c.next!=null) {
			c = c.next;
		}
		c.next = new_node;
	}
	
	public void add(int data,int pos) {
		length++;

		ListNode  new_node = new ListNode(data);
		ListNode c = head;
		if(pos == 0) {
			new_node.next = head;
			head = new_node;
			return;
		}
		for(int i=0;c!=null && i<pos-1;i++) {
			c = c.next;
		}
		if(c == null || c.next ==null) {
			return;
		}
		ListNode temp = c.next;
		c.next = new_node;
		new_node.next = temp;
	}
	// Deletion in LL
	public void deleteFirst() {
		length--;

		ListNode c = head;
		head = head.next;
		c.next = null;
	}
	public void deleteLast() {
		length--;

		ListNode c = head;
		while(c.next.next!=null) {
			c=c.next;
		}
		c.next = null;
	}
	public void delete(int pos) {
		length--;
		ListNode c = head;
		if(head == null) {
			return;
		}
		if(pos == 0) {
            head = head.next;
            c.next = null;
            return;
		}
		
		for(int i=0;i<pos-1;i++) {
			c=c.next;
		}

		if(c==null || c.next==null) {
			return;
		}
		
		c.next = c.next.next;	
	}
	
	// Reverse a Linked List
	
	public ListNode reversePI() {
		
		ListNode previous = null;
		ListNode current = head;
		while(current!=null) {
			ListNode next = current.next;
        	current.next = previous;

			previous = current;
			current = next;
		}
		head.next = null;
		head = previous;
		return head;
		
	}
	
	// Search An Element
   public int indexOf(int target, ListNode head ) {
	   ListNode c = head;
	   int idx = 0;
	   while(c!=null) {
		   if(c.data == target) {
			   return idx;
		   }
		   c = c.next;
		   idx++;
	   }
	   return -1;
   } 
   
// Delete the Linked List
	public void deletelist() {
		head = null;
	}
   /* 
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
	*/
	// Print Middle of Given LL.
	public void middleElement() {
		if(head ==null) {
			return;
		}
		ListNode  c = head;
		int middleidx = size()/2;
		while(middleidx!=0) {
			c=c.next;
			middleidx--;
		}
		System.out.println(c.data +" ");
		// O(size), overall time complexity
	} 
	
	public void middleEle() {
		ListNode s = head;
		ListNode f = head;
		while(f!=null && f.next!=null) {
			s = s.next;
			f = f.next.next;
		}
		
		System.out.println(s.data +" ");

	}
	// O(size) time complexity\
	
	// Java program to count occurrences in a linked list
	
	public int countOfOccurence(ListNode head,int search_for) {
		int count = 0;
		ListNode c = head;
		while(c!=null) {
			if(c.data == search_for) {
				count++;
			}
			c=c.next;
		}
		return count;
	}

	public static void main(String[] args) {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		//System.out.println(list.empty());
	    //System.out.println(list.getCount());

		list.addFirst(100);
		list.addFirst(200);
		list.addLast(300);
		list.addLast(400);
		list.addLast(300);
	//	list.addLast(300);

		list.add(700,1);
   /*
		//list.deleteFirst();
     	//	list.deleteLast();
		//list.delete(5);
		System.out.println(list.getCount());
		System.out.println(list.empty());
		System.out.println(list.size());
		//list.reversePI();
		//list.deletelist();
		System.out.println(list.indexOf(100,list.head));
		
	*/
		
		  list.display();
       // list.middleEle();
		  int result =list.countOfOccurence(list.head, 300);
          System.out.println(result);
	}

}
