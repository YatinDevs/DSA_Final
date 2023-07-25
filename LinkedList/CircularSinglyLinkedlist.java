package LinkedList;
import java.util.*;

public class CircularSinglyLinkedlist {

    private Node head;
    private Node tail;

    public CircularSinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void prepend(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            head = newNode;
            tail.next = head;
        }
    }

    public void delete(int data) {
        if (isEmpty()) {
            return;
        }

        if (head.data == data) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        Node current = head;
        Node prev = null;
        while (current.next != head) {
            prev = current;
            current = current.next;
            if (current.data == data) {
                prev.next = current.next;
                if (current == tail) {
                    tail = prev;
                }
                return;
            }
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    
    public static void main(String[] args) {
    	CircularSinglyLinkedlist cll = new CircularSinglyLinkedlist();
        cll.append(1);
        cll.append(2);
        cll.append(3);
        cll.display();

        cll.prepend(0);
        cll.display();

        cll.delete(2);
        cll.display();
    }
}