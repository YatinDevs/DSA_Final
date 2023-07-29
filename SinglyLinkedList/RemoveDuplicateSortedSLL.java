package SinglyLinkedList;
import java.util.*;

public class RemoveDuplicateSortedSLL {
    
	private Node head;
	
	public Node removeDuplicate() {
		Node current = head;
		while(current != null && current.next != null) {
			if(current.data == current.next.data) {
				current.next = current.next.next;  // Skips the duplicate Node in Sorted Linked lISt
			}else {
				current = current.next;
			}
		}
		return head;
	}
	
	public void printList() {
		Node current = head;
		while (current!=null) {
			System.out.print(current.data + " --> ");
			current=current.next;
		}
		System.out.print( "null ");
		System.out.println( " ");

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       RemoveDuplicateSortedSLL list = new RemoveDuplicateSortedSLL();
       list.head = new Node (1);
       Node second = new Node(2);
       Node third = new Node(2);
       Node fourth = new Node(4);
       Node fifth = new Node(5);
       Node sixth = new Node(5);
       list.head.next=second;
       second.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = sixth;
   list.printList();
   list.removeDuplicate();
   list.printList();
       
	}

}
