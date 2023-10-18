import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListExample2 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>(Arrays.asList());
        // add
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");

        // Now Iterating through the list in forward direction

        for(int i=0; i<ll.size(); i++){
            System.out.printf("%s ", ll.get(i));
        }


        // This was one way

        // Another way for linked list will be

        LinkedList<Integer> il = new LinkedList<Integer>();
        il.add(1);
        il.add(2);
        il.add(3);
        il.add(4);
        System.out.println("\n\n");
        for(int i=0; i<il.size(); i++){
            System.out.printf("%s ", il.get(i));
        }


        // Actually .toList is only used when we have a list and we want to convert it to a linked list
        // But here we are creating a linked list from scratch
        // So we can use Arrays.asList() method

        // Example:

        LinkedList<String> ll2 = new LinkedList<String>(Arrays.asList("A", "B", "C", "D"));

        // Printing in reverse order
        System.out.println("\n\n");
        for(int i = ll2.size()-1; i>=0; i--)
        {
            System.out.printf("%s ", ll2.get(i));
        }
    }
}
