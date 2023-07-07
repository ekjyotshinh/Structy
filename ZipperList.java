class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ZipperList {
    public static Node zipperLists(Node head1, Node head2) {
        Node finalAns = new Node(-1);
        Node current = finalAns;

        while (head1 != null || head2 != null) {
            if (head1 != null) {
                current.next = head1;
                head1 = head1.next;
                current = current.next;
            }
            if (head2 != null) {
                current.next = head2;
                head2 = head2.next;
                current = current.next;
            }
        }
        return finalAns.next;
    }

    public static void main(String[] args) {
        // Create the first linked list: 1 -> 2 -> 3 -> 4
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        // Create the second linked list: 5 -> 6 -> 7 -> 8 -> 9 -> 10 -> 11
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        Node node10 = new Node(10);
        Node node11 = new Node(11);

        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;

        Node zipperedHead = zipperLists(node1, node5);

        // zippered linked list: 1 -> 5 -> 2 -> 6 -> 3 -> 7 -> 4 ->8 -> 9 -> 10 -> 11
        Node current = zipperedHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
