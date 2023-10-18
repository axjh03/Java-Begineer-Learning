import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        // Add some elements to the list
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");

        // Create a ListIterator
        ListIterator<String> iterator = names.listIterator();

        // Forward iteration
        System.out.println("Forward iteration:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward iteration
        System.out.println("\nBackward iteration:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // Modify elements while iterating
        System.out.println("\nModified iteration:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Charlie")) {
                // Modify "Charlie" to "Mallory"
                iterator.set("Mallory");
            }
            System.out.println(name);
        }

        // Print the modified list
        System.out.println("\nModified list:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
