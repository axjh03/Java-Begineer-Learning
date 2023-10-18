package Arrays;

import java.util.Arrays;
import java.util.concurrent.SynchronousQueue;

public class Array{

    public static void main(String[] args)
    {
        // Creating a integer array
        Integer[] intArray = {24,345,46,57,453,23,35,46,46};

        //Printing the size of the array
        System.out.println(intArray.length);

        // Printing one specific index of Array
        System.out.println(intArray[3]);
        intArray[0] = 23;
        System.out.println(Arrays.toString(intArray));

        // Looping through the array and printing each element as a string
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }
}