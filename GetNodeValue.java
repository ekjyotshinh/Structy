class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class GetNodeValue {
    public static int getNodeValue(Node head, int index) {
        Node current = head;
        int i = 0;
        while (current != null) {
            if (i == index) {
                return current.val;
            }
            i++;
            current = current.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        // Create a linked list with some nodes
        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;

        // Test the get_node_value function
        int value = getNodeValue(node1, 1);
        System.out.println("Value at index 1: " + value); // Output: 20

        value = getNodeValue(node1, 3);
        System.out.println("Value at index 3: " + value); // Output: -1 (out of bounds)
    }
}