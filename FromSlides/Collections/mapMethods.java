import java.util.HashMap;

public class mapMethods {
    public static void main(String[] args)
    {
    HashMap <Integer, String> hm = new HashMap<Integer, String>();
    hm.put(1, "Samsung");
    hm.put(2, "Apple");
    hm.put(3, "OnePlus");

    HashMap <String, Integer> hm2 = new HashMap<String, Integer>();
    hm2.put("Samsung", 1);
    hm2.put("Apple", 2);
    hm2.put("OnePlus", 3);

    System.out.println(hm);

    String ValueFromIndex = hm.get(1);
    System.out.println("Index 1 : "+ValueFromIndex);
        // I.e the first is what we use as the key and the second is what we use as the value
    Integer ValueFromIndex2 = hm2.get("Apple");
    System.out.println("Index Apple : "+ValueFromIndex2);


    //.empty() method
    boolean isEmpty = hm.isEmpty();
    System.out.println("Is HashMap empty? " + isEmpty);

    //.size() method
    int size = hm.size();
    System.out.println("Size of hm: " + size);

    

    hm.remove(1, "Samsung");
    System.out.println(hm);

    // .clear() method
    hm.clear();
    System.out.println("Cleared HashMap: " + hm);
     //.empty() method
    isEmpty = hm.isEmpty();
    System.out.println("Is HashMap empty? " + isEmpty);


    // Creating a new HashMap with existing collection
    // using Collection(Collection<? extends E> c)
    HashMap<String, Integer> hm3 = new HashMap<String, Integer>(hm2);
    System.out.println("New HashMap: " + hm3);
    }

    
    
}
