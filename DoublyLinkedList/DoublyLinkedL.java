package DoublyLinkedList;
import java.util.*;
public class DoublyLinkedL {
    private ListNode head;
    private ListNode tail;
    private int length;
    
    private class ListNode {
    	private int data;
    	private ListNode next;
    	private ListNode previous;
    	
    	public ListNode(int data) {
    		this.data = data;
    		
    	}
    }
    
    public DoublyLinkedL() {
    	this.head = null;
    	this.tail = null;
    	this.length = 0;
    }
    
    public boolean isEmpty() {
    	return length == 0;
		
	}
    
    public int length () {
    	return length;
    }
    
    // print forward
    public void  displayforward() {
       ListNode temp = head;
       while(temp != null) {
    	   System.out.print(temp.data + " --> ");
    	   temp = temp.next;
       }
	   System.out.print( "null");
	   System.out.println( "");

    }
    // print backward
    public void  displaybackward() {
        
        if(tail == null) {
     	  return;
        }
        ListNode temp = tail;
        while(temp != null) {
     	   System.out.print(temp.data + " --> ");
     	   temp = temp.previous;
        } 	   System.out.print( "null");
 	   System.out.println( "");

     }
    
    // Insert Node at First Of DLL
    public void prepend(int data) {
    	ListNode new_node = new ListNode(data);
    	if(isEmpty()) {
    		tail = new_node;
    	}else {
    		head.previous = new_node;
    	}
    	new_node.next = head;
    	head = new_node;
    	length++;
    }
    
    // Insert Node at end Of DLL
    public void append(int data) {
    	ListNode new_node = new ListNode(data);
    	if(isEmpty()) {
    		head = new_node;
    	}else {
    	   tail.next = new_node;
            new_node.previous = tail;
    	}
    	tail = new_node;
    	length++;
    }
    
    // Delete First Node
    public ListNode deleteFirst() {
    	
    	if(isEmpty()) { //     	if(head == null) 
             throw new NoSuchElementException();
    	}
    	
    	ListNode current = head;
    	if(head == tail) {
    		tail = null;
    	}
    	else {
    		head.next.previous= null;
    	}
    	head = head.next;
    	current.next = null;
    	length--;
        return current;

    }
    
    // Delete Last Node
    public ListNode deleteLast() {
    	
    	if(isEmpty()) { //     	if(head == null) 
             throw new NoSuchElementException();
    	}
    	
    	ListNode current = tail;
    	if(head == tail) {
    		head = null;
    	}
    	else {
    		tail.previous.next= null;
    	}
    	tail = tail.previous;
    	current.previous = null;
    	length--;
    	return current;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DoublyLinkedL list = new DoublyLinkedL();
		 list.prepend(1); //  null <-- 1 --> null
		 list.prepend(2); //  null <-- 2 <-- 1 --> null
		 list.append(3);  //  null <-- 2 <-- 1 --> 3 --> null;
		 list.append(4);  //  null <-- 2 <-- 1 --> 3 --> 4 --> null;		 
		 list.displaybackward();
		// list.displaybackward();
		/* 
		 list.deleteFirst();
		 list.displayforward();

		 list.deleteFirst();
		 list.displayforward();

		 list.deleteFirst();
		 list.displayforward();

		 list.deleteFirst();
		 list.displayforward();

		 list.deleteFirst();
		 list.displayforward();
		 */
		 /*
		 list.deleteLast();
		 list.displaybackward();
		 list.deleteLast();
		 list.displaybackward();
		 list.deleteLast();
		 list.displaybackward();
		 list.deleteLast();
		 list.displaybackward();
		 list.deleteLast();
		 list.displaybackward();

         */
	}

}
