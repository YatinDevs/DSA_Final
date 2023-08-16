package LinkedListQuestion;
import java.util.*;

public class ReverseDoublyLL {
    private Node head;
    private Node tail;
    
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
		if(head==null) {
			tail = n;
		}else {
			n.next = head;
			head.prev = n;
		}
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
	
	public void reverse() {
		Node temp = null;
		Node c = head;
		while(c!=null) {
			temp = c.prev;
			c.prev = c.next;
			c.next=temp;
			
            c = c.prev;
		}
		if(temp!=null) {
			head = temp.prev;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ReverseDoublyLL list = new ReverseDoublyLL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        //list.reverse();
        list.display();
        
	}

}
