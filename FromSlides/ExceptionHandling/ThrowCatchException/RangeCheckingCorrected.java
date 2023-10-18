public class RangeCheckingCorrected {
    public static void main(String[] args)
    {
        String[] OneDArray = {"a", "b", "c", "d", "e"};
        try{
        for(int i=0; i<25; i++)
        {
            System.out.println(OneDArray[i]);
        }
    }
    catch(Exception e)
    {
        System.out.println("Out of range, Please make i<25 to i<5");
        System.exit(-1);
    }
}
}
