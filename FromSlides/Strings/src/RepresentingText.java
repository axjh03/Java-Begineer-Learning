public class RepresentingText {
    public static void main(String[] args)
    {
        //Byte String
        byte[] bstring = {'H', 'e', 'l', 'l', 'o'};
        for (byte b : bstring)
        {
            System.out.println((char)b);
        }

        for(byte Byte : bstring)
        {
            System.out.printf("%s", (char)Byte);
        }

        String ByteToString = new String(bstring); // converts the Byte string to normal string
        System.out.println("\n"+ByteToString);

        // String Builder

        StringBuilder sb = new StringBuilder("helllo");
        System.out.println(sb);

        String s = "This is a string";
        //.length()
        System.out.println(s.length());



        //.starts with and .endsWith
        String FirstName = "William"; String LastName = "Johnson";

        if(FirstName.startsWith("iam"))
        {
            System.out.println("It starts with 'iam' ");
        }
        else if(FirstName.startsWith("Will"))
        {
            System.out.println("It starts with 'Will' ");
        }
        if(LastName.endsWith("son"))
        {
            System.out.println("It ends with 'son'");
        }

        //

    }
}
