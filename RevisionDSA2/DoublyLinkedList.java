package RevisionDSA2;
import java.util.*;

public class DoublyLinkedList {
    ListNode head;
    ListNode tail;
    private int length;
    
    public boolean empty() {
    	return length == 0;
    }
    
    public int length () {
    	return length;
    }
    
    
    public void addFirst(int data) {
    	ListNode new_node = new ListNode(data);
    	
    	if(head == null) {
    	    tail=new_node;
    	}else {
    		head.prev = new_node;
    	}
		new_node.next = head;
    	head = new_node;
    	length++;

    }
    
    public void addLast(int data) {
    	ListNode new_node = new ListNode(data);
        
    	if(head==null) {
    		head = new_node;
    	}else {
    		tail.next = new_node;
    	}
    	new_node.prev = tail;
    	tail = new_node;
    	length++;
    }
    
    public void add(int data,int pos) {
    	ListNode new_node = new ListNode(data);
    	if(pos==0) {
    		new_node.next = head;
    		head.prev = new_node;
    		head = new_node;
    	}
    	ListNode c = head;
    	for(int i=0;i<pos-1;i++) {
    		c=c.next;
    	}
    	new_node.next = c.next;
    	c.next.prev = new_node;
    	c.next = new_node;
    	new_node.prev = c;
    	
    }
    
    public void displayForward() {
    	 if(head == null) {
        	  return;
    	 }
    	ListNode c = head;
    	while(c!=null) {
    		System.out.print(c.data + " --> ");
    		c=c.next;
    		
    	}
		System.out.print(" null");
		System.out.println(" ");


    }
    public void displayBackward() {
    	 if(tail == null) {
        	  return;
    	 }
    	ListNode c = tail;
    	while(c!=null) {
    		System.out.print(c.data + " --> ");
    		c=c.prev;
    		
    	}
		System.out.print(" null");
		System.out.println(" ");

    }
    
    public void removeFirst() {
    	ListNode c = head;
    	head = head.next;
    	if(head.next == null) {
    		tail.next = null;
    	}
    }
    public void remove(int pos) {
    	ListNode c = head;
    	if(pos == 0) {
    		head.next.prev = null;
    		head = head.next;
    		c.next =null;
    		return;
    	}
    	for(int i=0;i<pos-1;i++) {
    		c= c.next;
    	}
    	c.next = c.next.next;
    	c.next.prev = c;
    	c.next.next.prev=null;
    	c.next.prev=null;
    }

    public void removeLast(){
	    ListNode c= tail;
	    tail =tail.prev;
	    if(tail.prev == null){
		    head.next = null;
	    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		
         list.addFirst(5);
         list.addFirst(4);
         list.addLast(3);
         list.addFirst(2);
         list.addLast(1);
         list.add(100,2);
        System.out.println(list.empty());
        //list.removeFirst();
        //list.remove(5);
        list.displayForward();
       // list.displayBackward();

	}

}

