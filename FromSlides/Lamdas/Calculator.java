public class Calculator{

    // Create in Interface for the operation
    interface IntegerOperation
    {
        int operation(int a, int b); // The operation could be anything we want it to be.
    }

    public int doOperation(int a, int b, IntegerOperation op)
    {
        return op.operation(a, b);
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int result = calc.doOperation(5, 6, (a,b)-> a+b); // This is the lambda expression
        System.out.println("The addiion of 5 and 6 is " + result);

        System.out.printf("The subtraction of 9 and 1 is %d\n",calc.doOperation(9, 1, (a,b)-> a-b));
    }
}