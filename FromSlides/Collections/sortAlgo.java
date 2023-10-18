import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortAlgo {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>
        (
            Arrays.asList(10,30,24,6,53,456,345)
        );

        System.out.println("Before sort"+ arr);
        Collections.sort(arr);
        System.out.println("After sort"+ arr);
        Collections.shuffle(arr);
        System.out.println("After shuffle"+ arr);

        // Let's sort it and see the reverse
        Collections.sort(arr);
        Collections.reverse(arr);
        System.out.println("After reverse"+ arr);
        System.out.println("Max element"+ Collections.max(arr));
        System.out.println("Min element"+ Collections.min(arr));
        // Binary Search
        System.out.println(Collections.binarySearch(arr, 456));

    }
}
