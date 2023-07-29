package SinglyLinkedList;

public class SearchAnElement {
           
	public Node head;
	
	public boolean  searchElement(Node head,int target) {
		if(head == null) {
			return false;
		}
		Node current = head;
		while(current!=null) {
			if(current.data == target) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SearchAnElement list = new SearchAnElement();
	       // Adding Data to Nodes of LinkedList.
	       Node head = new Node(9);   // head Node   --> data=9/next=null
	       Node second = new Node(2); // second Node --> data=2/next=null
	       Node third  = new Node(7); // third Node  --> data=7/next=null
	       Node fourth = new Node(5); // fourth Node --> data=5/next=null
	            
	      // Linking Nodes of LinkedList to Form a Chain.
	      head.next = second; // 9 --> 2 --> null
	      second.next = third;     // 9 --> 2 --> 7 --> null
	      third.next = fourth;     // 9 --> 2 --> 7 --> 5 --> null
	
           if(list.searchElement(head,5)){
        	   System.out.println("Element Found in List");
           }else {
        	   System.out.println("Element Not Found in List");

           }
 	}

}
