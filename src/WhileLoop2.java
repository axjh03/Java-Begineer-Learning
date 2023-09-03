import java.util.Scanner;
public class WhileLoop2 {
    public static void main(String[] args){
        boolean condition = true;

        while(condition){
            String i = "0";
            String inpt; Scanner userInput = new Scanner(System.in);
            System.out.println("Input : ");
            inpt = userInput.nextLine();
            int newInteger = Integer.parseInt(inpt);

            if(inpt.equals(i)){
                condition = false;
            }
        }
    }
}
