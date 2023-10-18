import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;

public class HashSetAndTreeSet {
    public static void main(String[] args) {
        // HashSet is a class that implements Set interface
        // It is used for storing unique elements in the set
        // It is collection of unsorted keys

        // TreeSet is a class that implements Set interface
        // It is used for storing unique elements in the set
        // It is collection of sorted keys

        // Creating a HashSet and TreeSet instance

        HashSet<String> intHashSet = new HashSet<String>();
        TreeSet<String> intTreeSet = new TreeSet<String>();

        // Adding elements to the HashSet and TreeSet
        intHashSet.add("Apple");
        intHashSet.add("Banana");
        intHashSet.add("Pineapple");
        intHashSet.add("Zebra");
        intHashSet.add("Pencil");
        intHashSet.add("Cat");
        intHashSet.add("Dog");

        intTreeSet.add("Apple");
        intTreeSet.add("Banana");
        intTreeSet.add("Pineapple");
        intTreeSet.add("Zebra");
        intTreeSet.add("Pencil");
        intTreeSet.add("Cat");
        intTreeSet.add("Dog");
    

        System.out.print("Words in HashSet: ");
        Iterator<String> it = intHashSet.iterator();

        // See it's not sorted
        while(it.hasNext()){
            System.out.print(it.next() + "\n");
        }

        
        System.out.print("\n\nWords in TreeSet: ");
        Iterator<String> it2 = intTreeSet.iterator();

        while(it2.hasNext()){
            System.out.print(it2.next() + "\n");
        }

        // We can either use iterator or for each loop
        // for each loop is more efficient
        // for each loop is also called enhanced for loop
        System.out.println("\n\nUsing for each loop: [Unsorted] HashSet ");
        for (String i : intHashSet) {
            System.out.println(i);
        }

        System.out.println("\n\nUsing for each loop: [Sorted] TreeSet ");
        for(String str : intTreeSet){
            System.out.println(str);
        }

    }
}