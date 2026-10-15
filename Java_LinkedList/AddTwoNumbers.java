class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class AddTwoNumbers {
    static Node addNumbers(Node first, Node second) {
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;

        while (first != null || second != null || carry != 0) {
            int sum = carry;

            if (first != null) {
                sum += first.data;
                first = first.next;
            }

            if (second != null) {
                sum += second.data;
                second = second.next;
            }

            carry = sum / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
        }

        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node first = new Node(2);
        first.next = new Node(4);
        first.next.next = new Node(3);

        Node second = new Node(5);
        second.next = new Node(6);
        second.next.next = new Node(4);

        System.out.print("First number (reverse order): ");
        printList(first);

        System.out.print("Second number (reverse order): ");
        printList(second);

        Node result = addNumbers(first, second);

        System.out.print("Sum (reverse order): ");
        printList(result);
    }
}
