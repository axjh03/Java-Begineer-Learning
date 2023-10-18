// It's exactly like try and except in Python

public class AreaException{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 100;
        String s = "Yo Yo";
        try
        {
            int c = a*b;
            System.out.println(c);
        }
        catch (Exception e)
        {
            System.out.println("Error");
            // System.exit(-1);
        }
        try
        {
            String wr = s + b;
            System.out.println(wr);
        }
        catch(Exception e)
        {
            System.out.println("Error");
            System.exit(-1);
        }

    }
}