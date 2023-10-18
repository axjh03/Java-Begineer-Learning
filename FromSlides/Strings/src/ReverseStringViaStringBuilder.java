public class ReverseStringViaStringBuilder
{
    public static void println(Object obj)
    {
        System.out.println(obj);
    }
    public static String ReverseStringViaStringBuilder(String inputString)
    {
        StringBuilder sb = new StringBuilder(inputString);
        return sb.reverse().toString();
    }

    public static void main(String[] args)
    {
        String inString = "NIGHTINGALE";
        String outString;
        outString = ReverseStringViaStringBuilder(inString);
        println(outString);
    }
}