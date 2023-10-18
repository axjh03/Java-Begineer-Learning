public class RepresentatingText2 {
    public static void printf(String format, Object... args) {System.out.printf(format, args);}
    public static void println(Object obj) {System.out.println(obj);}
    public static void print(Object obj) {System.out.print(obj);}

    public static void main(String[] args)
    {
        String fruit1 = "apple";
        String fruit2 = "apple";
        //  compare based on the ASCII values
        if(fruit1.compareTo(fruit2) < 0)
        {
            println(fruit2 +" is less than "+fruit1);
        }

        if(fruit1.compareTo(fruit2) > 0)
        {
            println(fruit2 + " is greater than " + fruit1);
        }


        // we can also compare string i.e by neglecting ASCII the value

        if(fruit1.compareToIgnoreCase(fruit2) < 0 ){
            print("Both are equal");
        }

        else if(fruit1.compareToIgnoreCase(fruit2) > 0){
            print("Both are not equal");
        }

        else{
            println("Error");
        }


        //.equals
        // or .equalsIgnoreCase

        if(fruit1.equals(fruit2))
        {
            println("Both fruits are equal even in non-ignored case");
        }

        if(fruit1.equalsIgnoreCase(fruit2))
        {
            println("Both fruits are equal even in ignored case");
        }
    }
}
