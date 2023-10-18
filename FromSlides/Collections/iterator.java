import java.util.Iterator;
import java.util.ArrayDeque;

public class iterator {
    public static void main(String[] args)
    {
        // creating an instance
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        ad.add(13);
        ad.push(34); 

        // add or push is same
        // addFirst() and push() are same
        // addLast() and add() are same
        // addFirst() and addLast() are same
        // LOL :D 
        System.out.println(ad);

        // Now let's create an iterator

        Iterator<Integer> it = ad.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
            it.remove(); // The .remove() removes the element last returned by the iterator i.e .next()
        }

        System.out.println("\n\n");
        ad.push(332324);
        // since old iterator points at the end of the arrayDeque
        // we need to create a new iterator
        it= ad.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
