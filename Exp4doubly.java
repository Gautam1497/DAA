import java.util.Scanner;

class DoublyNode {
    int value;
    DoublyNode prev;
    DoublyNode next;

    DoublyNode(int val) {
        value = val;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;

    void insertAtBeginning(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
    }

    void deleteAtEnd() {
        if (tail != null) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
        }
    }

    void printLinkedList() {
        DoublyNode current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
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
