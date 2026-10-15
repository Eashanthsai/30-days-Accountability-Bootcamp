class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class MergeTwoSortedLists {
    static Node merge(Node first, Node second) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (first != null && second != null) {
            if (first.data <= second.data) {
                tail.next = first;
                first = first.next;
            } else {
                tail.next = second;
                second = second.next;
            }
            tail = tail.next;
        }

        if (first != null) {
            tail.next = first;
        } else {
            tail.next = second;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        first.next = new Node(3);
        first.next.next = new Node(5);

        Node second = new Node(2);
        second.next = new Node(4);
        second.next.next = new Node(6);

        System.out.print("First list: ");
        printList(first);
        System.out.print("Second list: ");
        printList(second);

        Node result = merge(first, second);

        System.out.print("Merged list: ");
        printList(result);
    }
}
