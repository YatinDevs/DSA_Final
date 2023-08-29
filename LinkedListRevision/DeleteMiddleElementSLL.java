package LinkedListRevision;

public class DeleteMiddleElementSLL {
     
	 private Node head;
	 private int length;
	
	public boolean empty() {
		return length==0;
	}
	
	public int size() {
		return length;
	}
	
	public void addFirst(int data) {
		length++;
		Node n = new Node(data);
		
		n.next = head;
		head = n;
	}
	public void display() {
		Node c = head;
		while(c!=null) {
			System.out.print(c.data + " --> ");
			c =c.next;

		}
		System.out.print("null");
		System.out.println("  ");
	}
	
	public Node deletemiddleElement(Node head) {
		if (head == null) return null;
        if (head.next == null) {
            return null;
        }
		
		Node f = head;
		Node s = head;
		Node prev = null;
		while(f!=null && f.next!=null) {
			prev =s;
			s = s.next;
			f = f.next.next;
		}
		
		prev.next = s.next;
		
		return head;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeleteMiddleElementSLL list = new DeleteMiddleElementSLL();
		
//		list.addFirst(50);
//		list.addFirst(40);
//		list.addFirst(30);
//		list.addFirst(20);
		list.addFirst(10);
			
		list.display();
		
		System.out.println(list.deletemiddleElement(list.head));

		
		list.display();
		
		/*
		  [10,20,30,40,50]
         30
         [10,20,40,50]

		  [10,20,30,40]
          30
         [10,20,40]
         
         [10,20,30]
         20
         [10,30]
         
         [10,20]
         20
         [10]
         
         [10]
         10
         [10]



		 */
 
	}

}
