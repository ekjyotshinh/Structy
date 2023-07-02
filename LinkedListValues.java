import java.util.LinkedList;
import java.util.ArrayList;

public class LinkedListValues {
    public static String[] linkedListValues(Node head) {
        ArrayList<String> values = new ArrayList<>();
        Node current = head;
        while (current != null) {
            values.add(current.getNodeValue());
            current = current.next;
        }
    }
}