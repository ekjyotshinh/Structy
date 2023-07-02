import java.util.ArrayList;

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListValues {
    public static String[] linkedListValues(Node head) {
        ArrayList<String> values = new ArrayList<>();
        Node current = head;
        while (current != null) {
            values.add(String.valueOf(current.val));
            current = current.next;
        }
        return values.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Node x = new Node(38);
        Node y = new Node(4);
        x.next = y;

        Node z = new Node(100);

        String[] xValues = linkedListValues(x);
        for (String value : xValues) {
            System.out.print(value + " "); // Output: 38 4
        }
        System.out.println();

        String[] zValues = linkedListValues(z);
        for (String value : zValues) {
            System.out.print(value + " "); // Output: 100
        }
        System.out.println();
    }
}
