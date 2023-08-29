package LinkedListRevision;

public class PrintMiddleElementSLL {
	
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
	
	public void middleElement(Node head) {
		
		Node f = head;
		Node s = head;
		
		while(f!=null && f.next!=null) {
			s = s.next;
			f = f.next.next;
		}
		
		System.out.println( s.data + "  ");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintMiddleElementSLL list = new PrintMiddleElementSLL();
		
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		
		list.display();
		
		list.middleElement(list.head);
		
		list.display();
		
		/*
		  [10,20,30,40,50]
         30
         [10,20,30,40,50]

		  [10,20,30,40]
          30
         [10,20,30,40]
         
         [10,20,30]
         20
         [10,20,30]
         
         [10,20]
         20
         [10,20]
         
         [10]
         10
         [10]



		 */
 
	}

}
