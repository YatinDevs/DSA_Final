package SinglyLinkedList;

import java.util.*;

public class ReverseDataIterative {
     
	private Node head;
	
	public void add(int data) {
		Node n = new Node(data);
		n.next = head;
		head = n;
	}
	public void display() {
		Node c = head;
		while(c!=null) {
			System.out.print(c.data + " --> ");
			c=c.next;
		}
		System.out.print("null");
		System.out.println(" ");

	}
	// 1. Get Size of LL
    public int countNode(Node head) {
    	int size = 0;
    	Node c = head;
    	while(c!=null) {
    		c = c.next;
    		size++;
    	}
    	return size;
    }
    
    public Node reverseDI(Node head) {
    	// 2. Get Data and add in Array in Reverse order
    	Node c = head;
    	int size = countNode(head);
    	int arr[]=new int[size];
        while(c!=null) {
        	arr[--size] = c.data;
        	c = c.next;
        }
    	
        // 3. update data in LL from reversed data in array
        c = head;
        int idx=0;
        while(c!=null) {
        	c.data = arr[idx++];
        	c = c.next;
        }
        
    	return head;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ReverseDataIterative list = new ReverseDataIterative();
         
          list.add(1);
          list.add(2);
          list.add(3);
          list.add(4);
         
          list.display();
          list.reverseDI(list.head);
          list.display();
	}  

}
/*
 Step 1: Collecting the data and storing it in an array in reverse order

Initialize a variable c to point to the head of the linked list.
Create a new array arr of size size, where size is the number of nodes in the linked list 
(calculated using the countNode method).
While traversing the linked list with the pointer c, store the data of each node in the array arr in reverse order.
The traversal involves visiting each node once, so this step takes O(n) time, where n is the number of nodes in 
the linked list.

Step 2: Updating the data in the linked list with the reversed data from the array

Initialize the pointer c to the head of the linked list again.
Using a separate variable idx, traverse the array arr and update the data of each node in the linked list 
with the reversed data from the array.
This traversal also involves visiting each node once, so this step also takes O(n) time, where n is the 
number of nodes in the linked list.

Overall Time Complexity:

Since both steps (Step 1 and Step 2) involve traversing the linked list once and each traversal takes O(n) time,
 the overall time complexity of the reverseDI method is O(n) + O(n) = O(n).
Thus, the time complexity of the reverseDI method is linear with respect to the number of nodes in the linked list,
 making it an efficient approach for reversing the data in the linked list.
 
 */
