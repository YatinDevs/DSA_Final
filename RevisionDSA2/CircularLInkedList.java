package RevisionDSA2;
import java.util.*;

public class CircularLInkedList {
     private ListNode head;
     private ListNode tail;
     private int length;
     
     public int length() {
    	 return length;
     }
     public boolean empty() {
    	 return length==0;
     }
     public void addFirst(int data) {
    	 ListNode new_node = new ListNode(data);
    	 if(head==null) {
    		 tail = new_node;
    		 head = new_node;
    	 }else {
    		 new_node.next = head;
    		 head =new_node;
    	 }
    	 tail.next = head;
     }
     public void addLast(int data) {
    	 ListNode new_node = new ListNode(data);
    	 if(head==null) {
    		 tail = new_node;
    		 head = new_node;
    	 }else {
    		 tail.next = new_node;
    		 tail =tail.next;
    	 }
    	 tail.next = head;
     }
     public void display() {
    	 
    	 if(head==null) {
    		 return;
    	 }
    	 ListNode c=head;
    	 while(c!=head);
         {
    		 c=c.next;
    		 System.out.print(c.data +" --> ");
    	 }
		 System.out.println(" ");

     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLInkedList list = new CircularLInkedList();
		list.addFirst(5);
		list.addLast(2);
		list.display();
	}

}
