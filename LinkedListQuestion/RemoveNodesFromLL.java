package LinkedListQuestion;
import java.util.*;

public class RemoveNodesFromLL {
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
	
	public Node removeNodes(Node head) {
		if(head == null || head.next == null) {
			return head;
		}
		ArrayList<Integer> stack = new ArrayList();
		
		Node c = head;
		int prevdata = head.data;
		while(c!=null) {
			  prevdata =c.data;
              c = c.next;
			if(c.data > prevdata && c!=null) {
				 stack.add(c.data);
			}					
		}
		
		c=head;
		int i=0;
		while(!stack.isEmpty()) {
			c.data = stack.get(i);	
			i++;
		}
		c.next = null;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveNodesFromLL list = new RemoveNodesFromLL();
		list.addFirst(8);
		list.addFirst(3);
		list.addFirst(13);
		list.addFirst(2);
		list.addFirst(5);
		
		list.removeNodes(list.head);
		list.display();

	}

}
