package LinkedListQuestion;
import java.util.*;

public class DeleteLastOccurenceOfItemfromLL {
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
	
	public Node deleteLastOccurrence(Node head,int key) {
		if(head == null)return head;
		
		Node ptr = null;
		Node c = head;
		while(c!=null) {
			if(c.data == key) {
				ptr = c;
			}
			c=c.next;

		}
		c=head;
		while(c.next!=ptr) {
			c=c.next;
		}
		c.next = c.next.next;
		
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteLastOccurenceOfItemfromLL list = new DeleteLastOccurenceOfItemfromLL ();
	   
	     	list.addFirst(4);
	        list.addFirst(4);
	        list.addFirst(5);
	        list.addFirst(4);
	        list.addFirst(3);
	        list.addFirst(2);
	        list.addFirst(1);
	        //list.reverse()
            list.deleteLastOccurrence(list.head, 4);
	        list.display();
	}

}
