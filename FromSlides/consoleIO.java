public class consoleIO{
    public static void main(String[] args){
        java.io.Console console = System.console(); // Get the console
        int a = 42;
        console.printf("As easy as this %d", a);
        String s = console.readLine("Don't you really think? ");
        console.printf("You really think this %s ??\n", s);  
    }
}