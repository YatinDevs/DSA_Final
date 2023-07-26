package SinglyLinkedList;

public class PrintSinglyLinkedList {
	
   // Declaring Head Node
    private Node head;
	
    public void printList() {
    	
    	Node current = head;
    	
    	while(current!=null) {
    		System.out.print(current.data + " --> ");
    		current = current.next;
    	}
    	System.out.print("null");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // creating object of head List
         PrintSinglyLinkedList list = new PrintSinglyLinkedList();
         // Adding Data to Nodes of LinkedList.
         list.head = new Node(9);   // head Node   --> data=9/next=null
         Node second = new Node(2); // second Node --> data=2/next=null
         Node third  = new Node(7); // third Node  --> data=7/next=null
         Node fourth = new Node(5); // fourth Node --> data=5/next=null
              
        // Linking Nodes of LinkedList to Form a Chain.
        list.head.next = second; // 9 --> 2 --> null
        second.next = third;     // 9 --> 2 --> 7 --> null
        third.next = fourth;     // 9 --> 2 --> 7 --> 5 --> null
        
        // Printing Data of LinkedList
        list.printList();
	}

}
