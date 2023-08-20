package LinkedListQuestion;
import java.util.*;

public class LinkedListBalance {
	// class Node {
//  int data;
//  Node next;

//  public Node(int data) {
//      this.data = data;
//      this.next = null;
//  }
//} 

public static boolean findDifference(Node head) {
//write your code here
//write your code here 
if(head == null){
   return false;
}
 Node c =head;
 int sum = 0;
 int count = 0;
 while(c!=null){
    sum+=c.data;
    count++;
    c=c.next;
 }
 return sum%count == 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Problem Statement
Given a LinkedList, you have to return whether the sum of all the nodes' 
data values in a linked list is evenly divisible by the length of the list.
 Return true if it is divisible else return false.
Input
User Task:
Since this will be a functional problem, you don't have to take input
 You just have to complete the function findDifference() that takes the 
 head of the list as parameter.

Constraints
1<=N<=100
1<=Node. data<=109
Output
Return true if it is divisible else return false.
Example
Input:
1- > 2- > 3- > 5- > 6- > 6
Output:
false
Explanation:
The sum of all nodes' values equals (1+2+3+5+6+6) 23 which is not divisible by 
length of linkedList (6), so we return false.
*/