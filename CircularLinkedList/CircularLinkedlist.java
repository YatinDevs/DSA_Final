package CircularLinkedList;
import java.util.*;

public class CircularLinkedlist {
	Node head;
	Node tail;
	
	public void addLast(int val) {
		Node temp = new Node(val);
		if(this.head==null) {
			this.head=temp;
			this.tail=temp;
		}
		
		else {
			this.tail.next=temp;
			this.tail=this.tail.next;
			
		}
		
		this.tail.next=this.head;
		
	}
	
	public void addFirst(int val) {
		Node temp = new Node(val);
		if(this.head==null) {
			this.head=temp;
			this.tail=temp;	
		}
		
		else {
			temp.next=this.head;
			this.head=temp;
			
		}
		
		this.tail.next=this.head;
	}
	
	public void removeLast() {
		if(this.head.next==this.head) {
			this.head.next = null;
			this.head = this.head.next;
			this.tail = this.tail.next;
		}
		
		else {
			Node n = this.head;
			while(n.next!=tail) {
				n=n.next;
			}
			this.tail.next=null;
			n.next=this.head;
			this.tail=n;
			
		}
		
	}
	
	public void removeFirst() {
		if(this.head.next==this.head) 
		{
			this.head.next = null;
			this.head = this.head.next;
			this.tail = this.tail.next;
		}
		
		else {
			Node n = this.head;
			this.head=this.head.next;
			n.next=null;
			this.tail.next=this.head;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      CircularLinkedlist list = new CircularLinkedlist();
      list.addFirst(1);
      list.addFirst(2);
      list.addFirst(3);

	}

}
