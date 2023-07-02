class Node {
    String val;
    Node next;

    public Node(String val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListFind {
    public static boolean linkedListFind(Node head, String target) {
        Node current = head;
        while (current != null) {
            if (current.val.equals(target)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node a = new Node("a");
        Node b = new Node("b");
        Node c = new Node("c");
        Node d = new Node("d");
        a.next = b;
        b.next = c;
        c.next = d;

        System.out.println(linkedListFind(a, "c")); // Output: true
        System.out.println(linkedListFind(a, "d")); // Output: true
        System.out.println(linkedListFind(a, "q")); // Output: false
    }
}
