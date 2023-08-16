package LinkedListQuestion;
import java.util.*;

import SinglyLinkedList.Node;

public class DetectLoopinLL {
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
	
	 public static boolean detectLoop(Node head){
	        // Add code here
	        Node s = head;
	        Node f = head;
	        while(f!=null && f.next!=null){
	            s=s.next;
	            f=f.next.next;
	            if(s==f){
	                return true;
	            }
	        }
	        return false;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      DetectLoopinLL list = new DetectLoopinLL();
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
	  
	  System.out.println(detectLoop(list.head));
	}

}
