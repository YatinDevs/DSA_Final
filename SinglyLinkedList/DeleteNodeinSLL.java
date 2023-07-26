package SinglyLinkedList;

public class DeleteNodeinSLL {
	private Node head;
	

    public void printList() {
    	
    	Node current = head;
    	
    	while(current!=null) {
    		System.out.print(current.data + " --> ");
    		current = current.next;
    	}
    	System.out.print("null");
    	System.out.println(" ");

    }
    
	 public boolean isListEmpty() {
		 if(head==null) {
			 return true;
		 }
		 
		 return false;
	 }

    public void deleteFirst() {
    	 Node n = head;
          head = n.next;
          n.next = null;
    	 
    }
    

    public Node deleteLast() {
    	
    	if(head == null || head.next == null) {
    		return head;
    	}
    	  Node current = head;
    	  Node previous = null;
          while(current.next!=null) {
        	  previous =current;
        	  current = current.next;
          }
          previous.next = null;
    	  return current;
    }
    
    public void removeLast() {
		 if(this.head==null) {
			 System.out.println("LinkedList is empty");
			 return;
		 }
		 Node n = this.head;
		 while(n.next.next!=null) {
			 n=n.next;
		 }
		 
		 n.next=null;
	 }
   
    public void removeAt(int pos) { // 5
    	Node current = head; // 1
        for(int i=1;i<=pos-2;i++) { // 1 2 3    5-2=3
        	current = current.next; // 2 3 4
        }
        Node temp = current.next;
        current.next = temp.next;
        temp.next = null ;
     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteNodeinSLL list = new  DeleteNodeinSLL();
		   // Adding Data to Nodes of LinkedList.
	       list.head = new Node(9);   // head Node   --> data=9/next=null
	       Node second = new Node(2); // second Node --> data=2/next=null
	       Node third  = new Node(7); // third Node  --> data=7/next=null
	       Node fourth = new Node(5); // fourth Node --> data=5/next=null
	            
	      // Linking Nodes of LinkedList to Form a Chain.
	      list.head.next = second; // 9 --> 2 --> null
	      second.next = third;     // 9 --> 2 --> 7 --> null
	      third.next = fourth;     // 9 --> 2 --> 7 --> 5 --> null
	     /*
	      // Remove At Beginning
	      list.deleteFirst();
	      list.printList();
	      
	      // Remove At Last
	      list.deleteLast();
	      list.printList();
	     */
	      // Remove At Given Position 
	      list.removeAt(3);
	      list.printList();
	      
	}

}
