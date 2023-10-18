public class ReversingString {

    public static String ReverseString(String s)
    {
        String result = "";
        for (int i = s.length()-1; i >= 0; i--) {
            result = result + s.charAt(i);
        }
        return result;
    }

    public static void println(Object obj)
    {
        System.out.println(obj);
    }

    public static void main(String[] args)
    {
        String s1 = "NIGHTINGALE";
        String s2;
        s2 = ReverseString(s1);
        println(s1);
        println("\nReversed:\n"+s2);
    }


}