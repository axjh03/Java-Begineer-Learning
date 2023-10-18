public class ExitWithAMessage {
    public static void main(String[] args)
    {
        if(args.length != 2)
        {
            System.err.println("You must provide two arguments");
            System.exit(1);
            // Status
            // 0 - means exiting without error
            // 1 or -1 or any non-zero value - means exiting with error
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
