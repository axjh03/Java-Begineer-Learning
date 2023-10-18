public class ReverseStringTime
{
    public static void println(Object obj)
    {
        System.out.println(obj);
    }

    public static String ReverseString(String s)
    {
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }
    public static String ReverseStringViaStringBuilder(String inputString)
    {
        StringBuilder sb = new StringBuilder(inputString);
        return sb.reverse().toString();
    }


    public static void main(String[] args)
    {
        String s1 = "123456789087654323456789098765rewertyuygfhhjfcngjfhcnbfgjhcntfjghcnvfjghcnv"; String s2;
        long startTime = System.nanoTime();
        s2 = ReverseString(s1);
        long endTime = System.nanoTime();
        System.out.println("Elapsed time from for loop: " + (endTime - startTime)/(1000000000) + " seconds");

        startTime = System.nanoTime();
        s2 = ReverseStringViaStringBuilder(s1);
        endTime = System.nanoTime();
        System.out.println("Elapsed time from StringBuilder: " + (endTime - startTime)/(1000000000) + " seconds");

    }
}
