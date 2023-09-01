
import java.util.*;
class Node {
    int value;
    Node next;

    Node(int val) {
        value = val;
        next = null;
    }
}
public class Exp4singly {
    public static Node insertAtBeginning(Node head, int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static Node insertAtEnd(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }

    public static Node deleteAtBeginning(Node head) {
        if (head == null) {
            return null;
        }
        Node newHead = head.next;
        head = null;
        return newHead;
    }

    public static Node deleteAtEnd(Node head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            return null;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return head;
    }

    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to insert at beginning: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter element to insert at end: ");
        int c=sc.nextInt();
        Node head = null;
        head = insertAtBeginning(head, a);
        head = insertAtBeginning(head, b);
        head = insertAtEnd(head, c);
        System.out.print("All element's: ");
        printLinkedList(head);
        head = deleteAtBeginning(head);
        head = deleteAtEnd(head);
        System.out.print("After deleting first and last node: ");
        printLinkedList(head);
        while (head != null) {
            Node temp = head;
            head = head.next;
            temp = null;
        }
    }
}
