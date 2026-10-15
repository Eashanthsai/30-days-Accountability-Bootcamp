class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class LinkedListCycle {
    static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        first.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Cycle present: " + hasCycle(first));

        fourth.next = second;
        System.out.println("Cycle present after connecting last node to node 2: "
                + hasCycle(first));
    }
}
