class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class ReverseLinkedList {
    static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.print("Original list: ");
        printList(head);

        head = reverse(head);

        System.out.print("Reversed list: ");
        printList(head);
    }
}
