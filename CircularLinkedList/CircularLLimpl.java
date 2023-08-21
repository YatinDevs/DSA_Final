package CircularLinkedList;
import java.util.*;

public class CircularLLimpl {
    private Node head;
    
    public CircularLLimpl() {
		// TODO Auto-generated constructor stub
    	head = null;
	}
    
    public void addFirst(int data){
    	Node new_node = new Node(data);
    	if(head==null) {
    		head=new_node;
    		head.next=head;
    	}else {
           Node c = head;
           while(c.next!=head) {
        	   c=c.next;
           }
           c.next=new_node;
           new_node.next=head;
           head = new_node;
    	}   	
    }
    public void addLast(int data) {
    	Node new_node = new Node(data);
    	if(head==null) {
    		head=new_node;
    		head.next=head;
    	}else {
    		Node c = head;
    		while(c.next!=head) {
    			c=c.next;
    		}
    		c.next=new_node;
    		new_node.next=head;
    	}
    }
    public void add(int data,int position) {
    	 if (position < 0) {
             System.out.println("Invalid position");
             return;
         }
         Node newNode = new Node(data);
    	 if (head == null) {
             if (position == 0) {
                 head = newNode;
                 head.next = head; // Point to itself to create a circular reference
             } else {
                 System.out.println("Invalid position");
             }
         } else if (position == 0) {
             addFirst(data);
         } else {
             Node temp = head;
             int count = 0;
             while (count < position - 1 && temp.next != head) {
                 temp = temp.next;
                 count++;
             }
             newNode.next = temp.next;
             temp.next = newNode;
         }
    }
    
    public void deleteFirst() {
        if (head == null) {
            return;
        }

        Node c = head;
        while (c.next != head) {
            c = c.next;
        }

        head = head.next;
        c.next = head;
    }
    
    public void deleteLast() {
    	  if (head == null) {
    	        return; 
    	    }

    	    Node current = head;
    	    Node prev = null;

    	    
    	    do {
    	        prev = current;
    	        current = current.next;
    	    } while (current != head);

    	  

    	    if (prev == current) {
    	        head = null;
    	    } else {
    	        
    	        prev.next = current.next;
    	        head = prev; 
    	    }
    }
    public void deleteAtPosition(int position) {
        if (head == null || position < 0) {
            return;
        }

        if (position == 0) {
            deleteFirst();
        } else {
            Node current = head;
            Node prev = null;
            int count = 0;

            do {
                prev = current;
                current = current.next;
                count++;
            } while (current != head && count < position);

            if (count == position) {
                prev.next = current.next;
            }
        }
    }
    
    public void display() {
        if (head == null) {
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + "--> ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLLimpl list = new CircularLLimpl();
		list.addFirst(1);
		list.add(2,2);
        list.addLast(3);
        list.addLast(5);
        list.add(4,3);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);

       
		list.display();
		list.deleteFirst();
		list.deleteLast();
		list.deleteAtPosition(5);
		list.display();
		
  
	}

}
