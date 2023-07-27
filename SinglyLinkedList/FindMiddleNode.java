package SinglyLinkedList;

public class FindMiddleNode {
	
	private Node head;
	
	   public Node middleNode(Node head) {
	    
	    
	           if (head == null)
	            return null;

	           Node slow = head;
	           Node fast = head;

	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        return slow;
	        
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
		
		FindMiddleNode list = new FindMiddleNode();
		
	      list.prepend(10);
	      list.prepend(5);
	      list.prepend(7);
	      list.prepend(3);
	      list.prepend(15);
       System.out.println(list.middleNode(list.head).data);
       

	}

}
