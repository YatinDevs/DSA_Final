package LinkedListQuestion;
import java.util.*;

public class ORofANDwithMiddle {
	/*
	    class Node {
	        Node next;
	        int val;

	        Node(int val) {
	            this.val = val;
	            next = null;
	        }
	    }
	*/

	 public static int orOfAnd(Node head) {
	       
	       if(head==null || head.next==null){
	           return 0;
	       }

	      Node s = head;
	      Node f = head;
	      while(f!=null && f.next!=null){
	          s = s.next;
	          f = f.next.next;
	      }

	      int middlevalue=s.data;
	      
	      int result =0;
	      Node c= head;
	      while(c!=null){
	          result |=(c.data & middlevalue);
	          c=c.next;
	      }
	      return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Problem Statement
You are given a linked list head you have to find the AND of values of each node with
 value of middle node of the linked list and then do OR of AND of every node's value and return it.

Note: size of linked list is odd.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to
 complete the function orOfAnd() that takes the linked list head as parameter.

Constraints:
1 ≤ length of linkedlist ≤ 100
1 ≤ value of node ≤ 100
Output
Print the OR of AND of all values with middle node's value.
Example
Sample Input:
3
2 4 6
Sample Output:
4
Sample Explanation:
middle node value is 4.
2 & 4 = 0
4 & 4 = 4
6 & 4 = 4
then OR of all these values = 0 | 4 | 4 = 4.
 */
	}

}
