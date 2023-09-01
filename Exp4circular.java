import java.util.Scanner;

class CircularNode {
    int value;
    CircularNode next;

    CircularNode(int val) {
        value = val;
        next = null;
    }
}

class CircularLinkedList {
    CircularNode head;

    void insertAtBeginning(int value) {
        CircularNode newNode = new CircularNode(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void insertAtEnd(int value) {
        CircularNode newNode = new CircularNode(value);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            CircularNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            tail.next = newNode;
            newNode.next = head;
        }
    }

    void deleteAtBeginning() {
        if (head != null) {
            CircularNode tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            head = head.next;
            tail.next = head;
        }
    }

    void deleteAtEnd() {
        if (head != null) {
            CircularNode tail = head;
            CircularNode prev = null;
            while (tail.next != head) {
                prev = tail;
                tail = tail.next;
            }
            prev.next = head;
        }
    }

    void printLinkedList() {
        if (head != null) {
            CircularNode current = head;
            do {
                System.out.print(current.value + " ");
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to insert at beginning: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Enter element to insert at end: ");
        int c=sc.nextInt();
        list.insertAtBeginning(a);
        list.insertAtBeginning(b);
        list.insertAtEnd(c);

        System.out.print("All element's: ");
        list.printLinkedList();

        list.deleteAtBeginning();
        list.deleteAtEnd();
        System.out.print("After deleting first and last node: ");
        list.printLinkedList();
    }
}
