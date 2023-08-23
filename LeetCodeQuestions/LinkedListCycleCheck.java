package LeetCodeQuestions;

public class LinkedListCycleCheck {
	       class ListNode {
		     int val;
		      ListNode next;
		      ListNode(int x) {
		         val = x;
		          next = null;
		    }
		  }
		 
		public class Solution {
		    public boolean hasCycle(ListNode head) {

		        ListNode s = head;
		        ListNode f = head;
		        while(f!=null && f.next!=null){
		            s = s.next;
		            f = f.next.next;
		            if(s==f){
		                return true;
		            }
		        }
		        return false;
		        
		    }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
