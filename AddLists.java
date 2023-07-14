class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AddLists {
    public Node addList(Node head1, Node head2) {
        Node dummyHead = new Node(-1);
        Node current = dummyHead;
        int carry = 0;
        while (head1 != null || head2 != null || carry != 0) {
            int num1, num2, sum;
            if (head1 != null) {
                num1 = head1.val;
            } else {
                num1 = 0;
            }
            if (head2 != null) {
                num2 = head2.val;
            } else {
                num2 = 0;
            }
            sum = num1 + num2 + carry;
            if (sum >= 10) {
                sum = sum % 10;
                carry = 1;
            } else {
                carry = 0;
            }
            current.next = new Node(sum);
            current = current.next;
            if (head1 != null) {
                head1 = head1.next;
            }
            if (head2 != null) {
                head2 = head2.next;
            }
        }
        return dummyHead.next;

    }

    public static void main(String[] args) {
        // Example usage
        AddLists solution = new AddLists();

        // Input: 621 + 354 = 975
        Node a1 = new Node(1);
        Node a2 = new Node(2);
        Node a3 = new Node(6);
        a1.next = a2;
        a2.next = a3;

        Node b1 = new Node(4);
        Node b2 = new Node(5);
        Node b3 = new Node(3);
        b1.next = b2;
        b2.next = b3;

        Node result = solution.addList(a1, b1);

        // Output: 975
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }

}
