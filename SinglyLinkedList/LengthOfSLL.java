package SinglyLinkedList;

public class LengthOfSLL {
	 // Declaring Head Node
     private Node head;
     
     public int lengthOf() {
    	 Node current = head;
    	 int size=0;
    	 while(current!=null) {
    		 current = current.next;
    		 size++;
    	 }
    	 return size;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LengthOfSLL list = new LengthOfSLL();
	         // Adding Data to Nodes of LinkedList.
	         list.head = new Node(9);   // head Node   --> data=9/next=null
	         Node second = new Node(2); // second Node --> data=2/next=null
	         Node third  = new Node(7); // third Node  --> data=7/next=null
	         Node fourth = new Node(5); // fourth Node --> data=5/next=null
	              
	        // Linking Nodes of LinkedList to Form a Chain.
	        list.head.next = second; // 9 --> 2 --> null
	        second.next = third;     // 9 --> 2 --> 7 --> null
	        third.next = fourth;     // 9 --> 2 --> 7 --> 5 --> null
	        
          // Get the Length of Node
	        int result=list.lengthOf();
	        System.out.println(" Size of LinkedList : " +result);
	}

}
