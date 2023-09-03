import java.util.Scanner;
public class MultipleChoiceQuestion {
    public static void print(String text) {
        System.out.println(text);
    }

    public static void main(String[] args){
        String userInput; boolean alive = true; int counter = 0;
        Scanner inpt = new Scanner(System.in);
        print("Welcome to 3/3 MCQ\nTHere are three question\n\n");
        while(alive){
            print("  Question : What is 2+2? ");
            print("\n\t1.) 4" +
                    "\n\t2.) 2" +
                    "\n\t3.) 1" +
                    "\n\t4.) 9");
            print("Your Choice : ");
            userInput = inpt.nextLine();
            if(userInput.equals("1")){
                print("Correct Answer"); alive = false;
            }
            else if(counter==2){
                print("Attempts remaining ("+counter+"/3)\n");
                print("Ran out of choices");
                break;
            }
            else{
                print("\ntry again");
                ++counter;
                print("Attempts remaining ("+counter+"/3)\n");
            }
        }
    }
}
