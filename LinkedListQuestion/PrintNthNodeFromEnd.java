package LinkedListQuestion;
import java.util.*;

public class PrintNthNodeFromEnd {

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
   public void printNth(int n) {
	  int len = 0;
	  Node c = head;
	  while(c!=null) {
		  len++;
		  c= c.next;
	  }
	  if(len<n) {
		  return;
	  }
	  c = head;
	  for(int i=1; i <=len-(n);i++) {
		  c = c.next;
	  }
	System.out.println(c.data);
 
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNthNodeFromEnd list = new PrintNthNodeFromEnd();
		
		list.addFirst(6);
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.printNth(2);
		list.display();
	}
}
