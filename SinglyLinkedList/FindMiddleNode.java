package SinglyLinkedList;

public class FindMiddleNode {
	
	private Node head;
	
	   public Node middleNode( ) {
	        Node s = head;
	        Node f = head;
           
	        while(f!=null && f.next != null) {
	        	s = s.next;
	        	f = f.next.next;
	        }
	        
		   return s;
	          /*
	        int count = 0;
	        Node temp = head;
	        while (temp != null) {
	            ++count;
	            temp = temp.next;
	        }

	        // find the middle
	        temp = head;
	        int middle = count / 2;
	        while (middle-- > 0) {
	            temp = temp.next;
	        }

	        return temp;
	        */
	    }
	
	    public void printList(Node head) {
	    	
	    	Node current = head;
	    	
	    	while(current!=null) {
	    		System.out.print(current.data + " --> ");
	    		current = current.next;
	    	}
	    	System.out.print("null");
	    	System.out.println(" ");
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindMiddleNode list = new FindMiddleNode();
		
	      list.head = new Node (1);
	       Node second = new Node(2);
	       Node third = new Node(3);
	       Node fourth = new Node(4);
	       Node fifth = new Node(5);
	       Node sixth = new Node(6);
	       list.head.next=second;
	       second.next = third;
	       third.next = fourth;
	       fourth.next = fifth;
	       fifth.next = sixth;
	      list.printList(list.head);
	      Node middleNode = list.middleNode();
         System.out.println(middleNode.data);
	      list.printList(list.head);
       

	}

}
