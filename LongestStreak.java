class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LongestStreak {
    public static int longestStreak(Node head) {
        Node current = head;
        int streak = 1;
        int max = -1;
        while (current.next != null) {
            Node next = current.next;
            if (current.val == next.val) {
                streak = 1 + streak;
            } else {
                streak = 1;
            }
            if (max < streak) {
                max = streak;
            }
            current = current.next;
        }
        return max;
    }

    public static void main(String[] args) {
        // Create the first linked list: 1 -> 1 -> 1 -> 1
        Node node1 = new Node(1);
        Node node2 = new Node(1);
        Node node3 = new Node(1);
        Node node4 = new Node(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create the second linked list: 1 -> 1 -> 1 -> 1 -> 1 -> 1 -> 11
        Node node5 = new Node(1);
        Node node6 = new Node(1);
        Node node7 = new Node(2);
        Node node8 = new Node(2);
        Node node9 = new Node(2);
        Node node10 = new Node(1);
        Node node11 = new Node(11);

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        System.out.println(longestStreak(node5));
    }
}
