package SinglyLinkedList;
import java.util.*;
public class FindStartofLoop {
	

	private Node head;
	
	public void printList() {
		Node current = head;
		while (current!=null) {
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.print( "null ");
		System.out.println( " ");

	}
	
	public Node startNodeinLoop() {
		Node f = head;
		Node s = head;
		while(f!=null && f.next != null) {
			f=f.next.next;
			s=s.next;
			if(f == s) { 
			    return getStartingNode(s);
			}
		}
		return null;
	}
	
	public Node getStartingNode(Node s) {
		Node temp = head;
		
		while(temp != s) {
		   temp=temp.next;
		   s= s.next;
		}
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindStartofLoop list=new FindStartofLoop();
		   list.head = new Node (1);
	       Node second = new Node(2);
	       Node third = new Node(3);
	       Node fourth = new Node(4);
	       Node fifth = new Node(5);
	       Node sixth = new Node(6);
	       list.head.next=second;
	       second.next = third;
	       third.next = fourth;
	       fourth.next = fifth;
	       fifth.next = sixth;
		   sixth.next = fourth;
		   
		   Node startNode = list.startNodeinLoop();
		   System.out.println(startNode.data);
		   
  }
}
