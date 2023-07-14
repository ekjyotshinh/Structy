class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class InsertNode {

    public static Node insertNode(Node head, int value, int index) {
        if (index == 0) {
            Node newHead = new Node(value);
            newHead.next = head;
            return newHead;
        }
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index - 1) {
                Node add = new Node(value);
                add.next = current.next;
                current.next = add;
                break;
            }
            current = current.next;
            count++;
        }
        return head;
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

        Node addList = insertNode(node5, 19, 4); // 11 should be removed

        Node current = addList;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
