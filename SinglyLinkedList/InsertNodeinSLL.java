package SinglyLinkedList;

public class InsertNodeinSLL {
	
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
    
    public void prepend(int data) {
    
    Node new_node = new Node(data);
    
    new_node.next = head;
    head = new_node;
    	
    }
    
    public void append(int data) {
    	
    	Node  new_node = new Node(data);
    	if(head == null) {
    		head = new_node;
    		return;
    	}
    	else {
    		Node current = head;
    		while(current.next!=null) {
    			current = current.next;
    		}
    		current.next=new_node;
    	}
    	
    }
    
    public void insertAt(int pos,int data) {
    	Node new_node = new Node(data);
    	
       if(pos == 1) {
    	   new_node.next = head;
    	   head = new_node;
       }
       else {
    	   Node previous = head;
    	   int count=1;
    	   while(count<pos-1) { // 1 2 
    		   previous = previous.next; // 2 3 
    		   count++;
    	   } 
           Node current = previous.next;
    	   previous.next = new_node;
    	   new_node.next=current;

       }
    }
    
	 public void add(int val, int k) {
		 Node new_node = new Node(val);
		 
		 Node current = head;
		 
		 for(int i=1;i<=k-2;i++) {
			 current=current.next;
		 }
		 
		 new_node.next= current.next;
		 current.next=new_node;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       InsertNodeinSLL list = new InsertNodeinSLL();
       
       // Adding Data to Nodes of LinkedList.
       list.head = new Node(9);   // head Node   --> data=9/next=null
       Node second = new Node(2); // second Node --> data=2/next=null
       Node third  = new Node(7); // third Node  --> data=7/next=null
       Node fourth = new Node(5); // fourth Node --> data=5/next=null
            
      // Linking Nodes of LinkedList to Form a Chain.
      list.head.next = second; // 9 --> 2 --> null
      second.next = third;     // 9 --> 2 --> 7 --> null
      third.next = fourth;     // 9 --> 2 --> 7 --> 5 --> null
     
      // Inserting At Beginning
      list.prepend(17);
      list.printList();
      
      // Inserting At Last
      list.append(13);
      list.printList();
      
      // Inserting At Given Position 
      list.add( 15,4);
      list.printList();

	}

}
