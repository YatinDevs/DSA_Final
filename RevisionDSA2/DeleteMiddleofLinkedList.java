package RevisionDSA2;
import java.util.*;

public class DeleteMiddleofLinkedList {

	private Node head;
	private int length;
	
	public int size() {
		return length;
	}
	public boolean empty() {
		if(head==null && length==0) {
			return true;
		}
		return false;
	}
	/* Display */
	public void display() {
	
		
		Node c = head;
     	if(empty()) {
     		System.out.println("[]");
     		return;
		}
		System.out.print("[");
		while(c!=null) {
			if(c.next!=null) {
			System.out.print(c.data + ",");
			}else {
			System.out.print(c.data);
			}
			c=c.next;
		}
		System.out.print("]");
		System.out.println("");


	}
	/* Insertion */
	public void addFirst(int data) {
		Node n = new Node(data);
		
		n.next = head;
		head = n;
		length++;
	}
	
	/* Delete Middle Element*/
	public Node deletemiddleElement(Node head) {
		
		if(head==null) {
			return head;
		}
		
		Node s	= head;
		Node f  = head;
		Node  prev = null;
		while(f!=null && f.next!=null){
			prev = s;
			s = s.next;
			f = f.next.next;
			
		}
		prev.next = s.next;
		
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddleofLinkedList list = new DeleteMiddleofLinkedList();
		list.addFirst(1);
		list.addFirst(5);
     	list.addFirst(7);
		list.addFirst(6);
		list.addFirst(4);
		list.addFirst(2);

		
		list.display();
		
		list.deletemiddleElement(list.head);
		
		list.display();
		
		/*Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 1 2 4 5
Example 2:

Input:
LinkedList: 2->4->6->7->5->1
Output: 2 4 6 5 1
		  
		 */
	}

}
