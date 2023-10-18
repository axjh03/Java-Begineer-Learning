public class consoleIO2{
    public static void main(String[] args){
        java.io.Console console = System.console();

        console.printf("Enter a string? ");
        String one = console.readLine();
        System.out.printf("Your line : %s", one);
        // or

        System.out.println("\nSecond code");
        String two = console.readLine("Enter another line? ");
        System.out.printf("Your line : %s", two);
    }
}