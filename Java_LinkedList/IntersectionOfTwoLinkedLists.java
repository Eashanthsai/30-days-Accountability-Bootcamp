class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class IntersectionOfTwoLinkedLists {
    static Node getIntersection(Node first, Node second) {
        Node a = first;
        Node b = second;

        while (a != b) {
            if (a == null) {
                a = second;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = first;
            } else {
                b = b.next;
            }
        }

        return a;
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);

        Node first = new Node(3);
        first.next = new Node(7);
        first.next.next = common;

        Node second = new Node(99);
        second.next = common;

        Node intersection = getIntersection(first, second);

        if (intersection == null) {
            System.out.println("No intersection");
        } else {
            System.out.println("Intersection starts at node: " + intersection.data);
        }
    }
}
