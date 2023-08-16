package LinkedListQuestion;
import java.util.*;

public class DeleteMiddleElement {
	private Node head;
	private int length;
	
	public boolean empty() {
		return length==0;
	}
	
	public int size() {
		return length;
	}
	
	public void addFirst(int data) {
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
	
	public  Node deleteMiddleElement() {
		Node s = head;
		Node f = head;
		Node p = null;
		while(f!=null && f.next!=null) {
			p = s;
			s = s.next;
			f = f.next.next;
		}
		p.next = s.next;
		return head;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddleElement list = new DeleteMiddleElement();
		list.addFirst(6);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
        list.deleteMiddleElement();
		list.display();
	}

}
