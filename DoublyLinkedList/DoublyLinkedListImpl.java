package DoublyLinkedList;

import java.util.*;

public class DoublyLinkedListImpl {
	
	  Node head;
	  Node tail;
		
		public void addFirst(int val) {
			Node temp = new Node(val);
			if(head==null) {
				this.tail=temp;
			}
			
			else {
				temp.next=this.head;
				this.head.prev=temp;
				
			}
			
			this.head=temp;
			
		}
		

	  public void addLast(int val) {
			Node temp = new Node(val);
			if(head==null) {
				this.head=temp;	
			}
			
			else {
				this.tail.next=temp;
				temp.prev=tail;
			}
			this.tail=temp;
		}


		public void add(int val, int loc) {
			Node temp = new Node(val);
			Node n = this.head;
			for(int i=1;i<=loc-2;i++) {
				n=n.next;
			}
			
			temp.next=n.next;
			n.next.prev = temp;
			n.next= temp;
			temp.prev= n;
		}
		
		public void remove(int loc) {
			Node n = this.head;
			for(int i=1;i<=loc-2;i++) {
				n=n.next;
			}
			
			Node temp = n.next;
			
			n.next=temp.next;
			temp.next.prev=n;
			temp.next=null;
			n.next=null;
		}
		
		public void removeFirst() {
			Node temp = this.head;
			
			head=head.next;
			
			if(head.next==null) {
				tail.next=null;
			}
		}
		
		public void removeLast() {
			Node temp = this.tail.prev;
			temp.next=null;
			tail.prev=  null;
			tail = temp;
			
			if( head.next==null) {
				head=null;
			}
		}
		
		public void printReverse() {
			Node n = this.tail;
			while(n!=null) {
				System.out.print(n.data+" --> ");
				n=n.prev;
			}
			System.out.print("null");
	    	System.out.println(" ");
		}
	

	    public void printList() {
	    	
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
      DoublyLinkedListImpl list = new DoublyLinkedListImpl();
      list.addFirst(10);// 10
      list.addFirst(7); // 7 --> 10
      list.addFirst(3); // 3 --> 7 --> 10
      list.addFirst(4); // 4 --> 3 --> 7 --> 10
      list.addLast(8);  // 4 --> 3 --> 7 --> 10 -->8
      
	  list.printList(); //  4 --> 3 --> 7 --> 10 --> 8 --> null 

      list.printReverse(); // 8 --> 10 --> 7 --> 3 --> 4 --> null 

      
	}

}
