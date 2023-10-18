import java.util.TreeMap;
import java.util.Iterator;

public class TreeMapExample {
    public static void main(String[] args)
    {
        // Creating an Tree Map instance
        TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

        tm.put(0,"America");
        tm.put(1,"India");
        tm.put(2,"China");
        tm.put(100,"Russia");
        tm.put(4,"Japan");
        tm.put(410,"Australia");
        tm.put(6,"Germany");
        tm.put(66,"France");
        tm.put(4,"Italy");
        tm.put(4,"New country");

        // Iterating through the TreeMap using for loop
        for(Integer key : tm.keySet())
        {
            System.out.printf("Key : %d | Value : %s \n",key,tm.get(key));
        }

        System.out.println("\n\n");

        // Iterating through the TreeMap using iterator

        Iterator <Integer> it = tm.keySet().iterator();

        while(it.hasNext())
        {
            Integer key = it.next();
            System.out.printf("Key : %d | Value : %s \n",key,tm.get(key));
        }

    }
    // why as japan discareded and italy is printed

    // TreeMap is a class that implements Map interface
    // It is used for storing unique elements in the set
    // It is collection of sorted keys
    // TreeMap is sorted according to the natural ordering of its keys

}
