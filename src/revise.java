import java.util.Scanner;
public class revise{
    public static void main(String[] args){
        // Data Types :
        int subjects = 4;
        double gpa = 3.4;
        boolean bool = true;
        char letter = 'B';
        String line = "This is a string";
        String FirstName, LastName;
        FirstName = "Aalok"; LastName = "Jha";

        // Printing those
        System.out.println(FirstName + " has a GPA of " + gpa + " and he took " + subjects + " subjects");

        // Taking Input
        // must import the java.util.Scanner
        // Capital and small letters matters in JAVA.


        // For integer
        System.out.println("What's the corrected number of subjects? ");
        Scanner input = new Scanner(System.in);
        subjects = input.nextInt();


        // For String
        System.out.println("What's the quote? ");
        Scanner quote = new Scanner(System.in);
        line = quote.nextLine();

        // For double
        System.out.println("What's the corrected GPA? ");
        Scanner GPA = new Scanner(System.in);
        gpa = GPA.nextDouble();

        // For char
        System.out.println("What's the corrected Letter Grade? ");
        Scanner grade = new Scanner(System.in);
        letter = grade.next().charAt(0); // Only way to get the char. There is no nextChar()


        // Printing
        System.out.println("Here is the corrected Data \n" + FirstName + " " + LastName + " has a GPA of " + gpa + " with a letter grade of " +"'"+letter+"'" + " that he achieved by taking " +subjects + " subjects "+ "\nAnd he quote :" + "'"+line+"'");

    }
}
