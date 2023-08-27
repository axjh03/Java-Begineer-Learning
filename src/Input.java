import java.util.Scanner;
public class Input {
    public static void main(String[] arg){
        double GPA = 3.7;
        String FirstName, LastName;
        FirstName ="Aalok"; LastName = "Jha";
        System.out.println("What do you want to change the GPA to? ");
        Scanner input = new Scanner(System.in);
        GPA = input.nextDouble();
        System.out.println("What do you want to change the fist name to? ");
        Scanner newName = new Scanner(System.in);
        FirstName = newName.nextLine();
        System.out.println("What do you want to change the last name to? ");
        newName = new Scanner(System.in);
        LastName = newName.nextLine();
        System.out.println("The GPA of " + FirstName + " " + LastName + " is " + GPA + ".");
    }
}
