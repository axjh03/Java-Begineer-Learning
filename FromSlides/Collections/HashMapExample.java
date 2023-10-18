import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {
    public static void main(String[] args)
    {
        // Creeating a HashMap and TreeMap instance
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        // HashMap can only have <H, V> only 2 parameters
        // TreeMap can have <H, V> only 2 parameters
        // These will not work if we try to add more than 2 parameters
        // like : 
        // HashMap<Integer, String, String> hm = new HashMap<Integer,String,String>();

        hm.put(1,"Samsung");
        hm.put(2,"Apple");
        hm.put(3,"OnePlus");
        hm.put(4,"Xiaomi");
        hm.put(5,"Realme");
        hm.put(40,"Nokia");

        System.out.println("HashMap element at index 2 : "+hm.get(2));

        // Checking if a key exists in the HashMap
        int keyToCheck = 40;
        if (hm.containsKey(keyToCheck)) {
            System.out.println("Key " + keyToCheck + " exists in the HashMap.");
        } else {
            System.out.println("Key " + keyToCheck + " does not exist in the HashMap.");
        }


        // Now let's see TreeMap

        for(Integer i : hm.keySet())
        {
            System.out.printf("key :%d  | Value = %s \n",i,hm.get(i));
        }

        // Using iterator
        Iterator<Integer> it = hm.keySet().iterator();

        while(it.hasNext())
        {
            Integer key = it.next();
            System.out.printf("key :%d  | Value = %s \n",key,hm.get(key));
        }

    }}
