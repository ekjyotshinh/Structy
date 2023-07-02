class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class SumList {
    public static int sum_list(Node head) {
        int totalSum = 0;
        Node current = head;

        while (current != null) {
            totalSum += current.val;
            current = current.next;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        Node x = new Node(38);
        Node y = new Node(4);
        x.next = y;

        Node z = new Node(100);

        System.out.println(sum_list(x)); // Output: 42
        System.out.println(sum_list(z)); // Output: 100
    }
}
