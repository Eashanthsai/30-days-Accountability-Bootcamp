class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class PalindromeLinkedList {
    static boolean isPalindrome(Node head) {
        int[] values = new int[1000];
        int count = 0;

        while (head != null) {
            values[count] = head.data;
            count++;
            head = head.next;
        }

        int left = 0;
        int right = count - 1;

        while (left < right) {
            if (values[left] != values[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        System.out.println("Is palindrome: " + isPalindrome(head));
    }
}
