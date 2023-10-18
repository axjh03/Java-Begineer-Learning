import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;

public class arrayDequeLIFOExample {
   public static void main(String[] args)
   {
        // Create an empty ArrayDeque
        // Same definition as Stack, implementation as ArrayList.

        ArrayDeque<Integer> lifo = new ArrayDeque<Integer>();
        Random random = new Random();
        for(int i = 0; i<5; i++)
        {
            lifo.push(random.nextInt(100));
        }

        // Iterate through the ArrayDeque elements.
        Iterator<Integer> iterator = lifo.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Pushing on top of the stack");

        // --------------------- Pushing on top of the stack ---------------------
        lifo.addFirst(34334);
        //  Why this while loop is not printing again? 
        //  Because the iterator is already at the end of the ArrayDeque.
        //  We need to create a new iterator.
        //  The iterator is not dynamic.
        //  It is not like a pointer.
        //  It is more like a snapshot of the ArrayDeque.
        
        // We can do that by creating a new iterator.
        iterator = lifo.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Removing the first element");
        lifo.removeFirst();
        iterator = lifo.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        while(!lifo.isEmpty())
        {
            System.out.println(lifo.pop());
        }

        iterator = lifo.iterator();

        try{
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }}
        catch(Exception e)
        {
            System.out.println("Empty ArrayDeque");
        }

        // --------------------- Pushing on end of the stack ---------------------
        System.out.println("Adding again in the stack after popping all");
        for(int i = 0; i<5; i++)
        {
            lifo.add(random.nextInt(100));
        }

        // Print the ArrayDeque
        iterator = lifo.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        lifo.addLast(322332);

        iterator = lifo.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

   }
}