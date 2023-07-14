class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class CreateLinkedList {
    public static Node createLinkedList(int[] values) {
        Node head = new Node(-1);
        Node current = head;
        for (int i : values) {
            current.val = values[i];
            current = current.next;
        }
        return head.next;
    }

    public static void main(String[] args) {

    }
}
