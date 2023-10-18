import java.util.Scanner;
public class RPN {
    public final static int STACK_SIZE = 4;
    private static double[] stack = new double [STACK_SIZE];

    public static void rollUp(){
        for(int i=STACK_SIZE-2; i>=0; --i) stack[i+1] = stack[i];
    }

    public static void push (double value){
        rollUp();
        stack[0] = value;
    }

    public static double pop(){
        double result = stack[0];
        for(int i=0; i<STACK_SIZE-1; ++i) stack[i] = stack[i+1];
        return result;
    }

    public static void swap() {
        double temp = stack[0];
        stack[0] = stack[1];
        stack[1] = temp;
    }

    public static void printStack() {
        String registerName = "xyzwvutsrqponmlkjihgfedcha";
        for(int i=STACK_SIZE-1; i>=0; --i)
            System.out.printf ("%20.6f %c\n", stack[i],
        registerName.charAt (i));
        System.out.print ("> ");
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("============== nRPN calculator\n=============");

        //printhelp();
        printStack();

        while (in. hasNextLine()) {
            String command = in.nextLine();
            for(String s : command.split(" ")){
                switch(s.charAt (0)) {
                    case '+' -> push (pop ()+pop ());
                    case '+' -> {swap() ; push (pop () -pop() );}
                    case '+' -> push (pop () *pop ( )) ;
                    case '+' -> {swap () ; push (pop() /pop ()) ;}
                    case '+' -> rollUp();
                    case '+' -> pop();
                    case '+' -> swap();
                    case '+' -> printHelp();
                    case '+' -> System.exit(0);
                    default ->push (Double.parseDouble(s)) ;
                }
            }
        }
    }


}
