package RevisionDSA2;
import java.util.*;


public class SinglyLinkedListImplementation {
     
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
	public void addLast(int data) {
		
		 Node n = new Node(data);
		 Node  c = head;
		 
		 while(c.next!=null) {
			 c = c.next;
		 }
		 c.next = n;
		 length++;
	}
	public void add(int data,int pos) {
		Node n = new Node(data);
		if(pos==0) {
			addFirst(data);
			length++;
            return;
		}
		
		Node c = head;
		
		for(int i=0;c!=null & i<pos-1;i++) {
			
			 c=c.next;
		}
		
		if(c==null) {
			return;
		}
			n.next = c.next;
			c.next = n;
			length++;	
	}
	/* deletion */
	public void deleteFirst()  {
		length--;
		if(head==null) {
			System.out.println("Empty Linkedlist");
		}
		Node n = head;
		head = head.next;
		n.next = null;
		
	}
	
	public void deleteLast() {
		length--;
		if(head==null) {
			System.out.println("Empty Linkedlist");
			return;
		}
		
		if(head.next==null) {
			head=null;
			return;
		}
		
		Node c = head;
		while(c.next.next!= null ) {
			c=c.next;
		}
		c.next = null;
	}
	
   public void deleteAt(int pos) {
	   if(head==null) {
		   System.out.println("Linkedlist is Empty!");
	   }
	   
	   if(pos == 0) {
		   deleteFirst();
		   return;
	   }
	   
	   Node c = head;
	   for(int i=0;i<pos-1;i++) {
		   c=c.next;
	   }
	   
	   if(c.next==null) {
		   return;
	   }
	   c.next=c.next.next;
	   
	   
    }
	public static void main(String[] args) {
		// TODO Auto-generated method 
		SinglyLinkedListImplementation list = new SinglyLinkedListImplementation();
		
//		System.out.println(list.empty());
//		System.out.println(list.size());
//		
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
        list.add(5,9);
		list.display();
		
//		list.deleteFirst();
//		list.deleteLast();
		list.deleteAt(8);



//		System.out.println(list.empty());
//		System.out.println(list.size());
//		
		list.display();

 
	}

}
