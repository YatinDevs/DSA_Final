package RevisionDSA2;
import java.util.*;
import java.util.NoSuchElementException;


public class DoublyLinkedListImplementation {
	private Node head;
	private Node tail;
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
	/* Insertion  */
	
	public void insertAtBeginning(int data)
	{
	    Node temp = new Node(data);
	    if (head == null) {
	        head = temp;
	        tail = temp;
	    }
	    else {
	        temp.next = head;
	        head.prev = temp;
	        head = temp;
	    }
	}
	public void insertAtEnd(int data) {
		Node node =new Node(data);
		
		if(tail == null) {
			head = node;
			tail = node;
		}
		else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	} 
	
	public void insertAt(int data,int pos) {
		
		Node node = new Node(data);
		if(pos==1) {
			insertAtBeginning(data);
		}
		else {
			Node curr = head;
			int currpos = 1;
			while(curr!=null && currpos < pos) { //  1 < 2
				curr = curr .next; // 2nd pos = curr
				currpos++; // 2
			}
			if(curr == null) {
				insertAtEnd(data);
			}
			
			node.next = curr;
			node.prev = curr.prev;
			curr.prev.next = node;
			curr.prev = node;
			
		}
	}
	
	/* Delete */
	public void deleteAtBeginning() {
		
		if (head == null) {
	        return;
	    }
		
		 if (head == tail) {
		        head = null;
		        tail = null;
		        return;
		    }
		Node node = head;
		
		head = head.next;
		node.next = null;
		head.prev = null;
		
	}
	
	public void deleteAt(int pos) {
		if (head == null) {
	        return;
	    }
		
		 if (pos == 1) {
		        deleteAtBeginning();
		        return;
		    }
		 
		 Node curr = head;
		 int currpost = 1;
		 
		 while(curr != null && currpost != pos) {
			 curr = curr.next;
			 currpost++;
		 }
		 if (curr == null) {
		        System.out.println("Position wrong");
		        return;
		   }
		 if(curr == tail) {
			 deleteAtEnd();
			 return;
		 }
		 curr.prev.next = curr.next;
		 curr.next.prev = curr.prev;
		 curr.prev =null;
		 curr.next = null;
		  
	}
	
	public void deleteAtEnd() {
		 
		if(tail == null) {
			return;
		}
		
		if(head==tail) {
			head= null;
			tail = null;
			return;
		}
		
		Node curr = tail;
		tail = tail.prev;
		curr.prev = null;
		tail.next = null;
		
	}
	/* Display Forward*/
	 
    public void  displayforward() {
       Node temp = head;
       while(temp != null) {
    	   System.out.print(temp.data + " --> ");
    	   temp = temp.next;
       }
	   System.out.print( "null");
	   System.out.println( "");

    }
	/* Display Backward */
    public void  displaybackward() {
        
        if(tail == null) {
     	  return;
        }
        Node temp = tail;
        while(temp != null) {
     	   System.out.print(temp.data + " --> ");
     	   temp = temp.prev;
        } 	   System.out.print( "null");
 	   System.out.println( "");

     }
	public static void main(String[] args) {
		// TODO Auto-generated method 
		DoublyLinkedListImplementation list = new DoublyLinkedListImplementation();
		list.insertAtBeginning(60);
		list.insertAtBeginning(50);
		list.insertAtBeginning(40);
		list.insertAtBeginning(30);
		list.insertAtBeginning(20);
		list.insertAt(10,2);
		list.displayforward();
        list.displaybackward();
	}
}
