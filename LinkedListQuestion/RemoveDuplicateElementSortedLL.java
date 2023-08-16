package LinkedListQuestion;
import java.util.*;

public class RemoveDuplicateElementSortedLL {
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
	public Node removeDuplicates(Node head) {
	    
		Node c = head;
		while(c!=null && c.next !=null) {
			if(c.data == c.next.data) {
				c.next = c.next.next;
			}
			c = c.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicateElementSortedLL list = new RemoveDuplicateElementSortedLL();
		list.addFirst(2);
		list.addFirst(2);
		list.addFirst(4);
		list.addFirst(5);
		list.addFirst(8);
		
		list.removeDuplicates(list.head);
		list.display();
	}

}
