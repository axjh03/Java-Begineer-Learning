public class RepersentingText3 {
    public static void printf(String format, Object... args) {System.out.printf(format, args);}
    public static void println(Object obj) {System.out.println(obj);}
    public static void print(Object obj) {System.out.print(obj);}

    public static void main(String[] args){
    // Line Seperator

    String String1 = "I am %d years old!" + System.lineSeparator(); // this will get rid of /n /r/n different seperators in different devices
    int age = 25;
    String String2 = String.format(String1, age);
    print(String2);


    String s1 = "Hello, I am %s, I am %d years old and I am under %d." + System.lineSeparator();
    int under; String name;
    age = 20; under = 21; name = "Aalok";
    String s2 = String.format(s1, name, age, under); // the order mattters
    println(s2);
    }
}
