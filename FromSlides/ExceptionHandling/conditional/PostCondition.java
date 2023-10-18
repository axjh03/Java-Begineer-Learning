public class PostCondition{
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            throw new IllegalArgumentException("You must provide two arguments");
        }
        else
        {
            System.out.println("The arguments are: \n");
            for(String arg : args)
            {
                System.out.println(arg);
            }
        }
    }
}
 // System.Err vs System.out in Java

 