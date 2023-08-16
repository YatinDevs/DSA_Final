package LinkedListQuestion;
import java.util.*;

public class PrintMiddleofLinkedList {
    
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
	/*
	 * Hence, the time complexity of this code is O(N), where N is the number of nodes in the linked list. The constant 
	 * factor is relatively small due to the fast pointer moving twice as fast, but this doesn't change 
	 * the overall complexity classification.
	 */
	public void printMiddle() {
		Node sptr = head;
		Node fptr = head;
		while(fptr!=null && fptr.next!=null) {
			sptr = sptr.next;
			fptr = fptr.next.next;
		}
		System.out.println("Index of Middle : " + sptr + " data : " + sptr.data);
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
	/*
	 * The dominant factor here is the traversal of the linked list
       which takes O(N) time. The ArrayList operations are negligible compared to the linked list traversal.
	 */
	public void printMiddleElement () {
		ArrayList<Integer> list = new ArrayList<>();
		Node c = head;
		while(c!=null) {
			list.add(c.data);
			c= c.next;
		}
		System.out.print(list.get(list.size()/2));
 	}
	
	 public int getLen()
	    {
	        int length = 0;
	        Node temp = head;
	        while (temp != null) {
	            length++;
	            temp = temp.next;
	        }
	        return length;
	    }
	 
	    /*Printing the middle element of the list.*/
	    public void printMiddleEle()
	    {
	        if (head != null) {
	            int length = getLen();
	            Node temp = head;
	            int middleLength = length / 2;
	            while (middleLength != 0) {
	                temp = temp.next;
	                middleLength--;
	            }
	            System.out.print("The middle element is ["
	                             + temp.data + "]");
	            System.out.println();
	        }
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMiddleofLinkedList list = new PrintMiddleofLinkedList();
		list.addFirst(1);
		list.addFirst(5);
		list.addFirst(7);
		list.addFirst(6);
		list.addFirst(4);
		list.addFirst(2);

		list.display();
		list.printMiddle();
		list.printMiddleElement();
	}

}
