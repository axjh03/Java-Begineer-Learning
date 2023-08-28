// Fortune Teller example

// If statement
import java.util.Scanner;
public class ControlFlow {
    public static void main(String[] args){
        System.out.println("Pick a number between 1 and 10. ");
        Scanner Input; int num;
        Input = new Scanner(System.in); num = Input.nextInt();

        if (num < 5){
            System.out.println("Bad Luck");
        }
        else{
            System.out.println("Good");
        }
    }
}
