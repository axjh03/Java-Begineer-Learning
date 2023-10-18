eimport java.lang.Math; // For random

public class ArrayAndArrayList {
    public static void main(String[] args)
    {
        Integer[] myNum = {10,20,30,40,50}; // Manual writing
        for(int i = 0; i < myNum.length; i++ )
        {
            System.out.println(myNum[i]);
        }

        Integer[] array; // defined an integer
        array = new Integer[20]; // size of integer

        for(int i = 0; i<array.length; i++)
        {
            array[i] = (int)(5 +(Math.random() * 30));
        }

        for(int i = 0; i<array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }

        // Array List
        ArrayList<Integer> ali;
        ali = new ArrayList<>(); // no need to give size
        int amountToAdd = 20;
        //To add in the array we can just use any kind of loop
        for(int i = 0; i<20; i++)
        {
            ali.add((int)(5 +(Math.random() * 30)));
        }
        System.out.println("\n----------------------------");
        for(int i = 0; i<ali.size(); i++)
        {
            System.out.printf("%d ", ali.get(i));
        }
    }




}
