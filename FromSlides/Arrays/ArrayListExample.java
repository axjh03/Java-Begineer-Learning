package Arrays;

import java.util.ArrayList;
import java.util.Random;


public class ArrayListExample{
    public static void main(String[] args){
        Random random = new Random();
        // Making a new integer Array
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        intArray.add(35);
        for(int i=0; i<4; i++)
        {
            intArray.add(random.nextInt(2424));
        }

        System.out.printf("The length of the ArrayList is %d.\n", intArray.size());
        System.out.println(intArray.get(4));
        System.out.println(intArray);
        System.out.println("Another way : ");
        for ( int i = 0; i<intArray.size(); i++)
        {
            System.out.println(intArray.get(i));

        }
        System.out.println(intArray.set(4, 67968387));
        System.out.println(intArray);
    }
}