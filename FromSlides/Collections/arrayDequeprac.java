import java.util.ArrayDeque;
import java.util.Iterator;

public class arrayDequeprac{
    public static void main(String[] args)
    {
        // Defining an Array Deque
        ArrayDeque<Double> db = new ArrayDeque<Double>();

        db.push(4.3); db.push(3.2); db.push(3.9);

        // Create an Iterator 
        Iterator<Double> it = db.iterator();
        
        // Now itertaing through the ArrayDeque

        while(it.hasNext()){
            System.out.println(it.next());
        }

        
    }
}