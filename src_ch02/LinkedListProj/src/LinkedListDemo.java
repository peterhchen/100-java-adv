import java.util.*;
public class LinkedListDemo {
    public static void main (String[] args) {
        // Create a linked list
        LinkedList ll = new LinkedList();
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("F");
        ll.addFirst("A");
        ll.addLast("Z");
        ll.add(1, "A2");
        System.out.println ("Linked List Content: " + ll);
        //remove element 'F'
        ll.remove("F");
        ll.remove(2);
        System.out.println ("After deletion: " + ll);

    }
}
