public class Example1{
    public static void main(String[] args){
        IntegerPrinter printer = new IntegerPrinter(5);
        printer.intprint();

        DoublePrinter dbprinter = new DoublePrinter(4.3);
        dbprinter.doubleprint();
    }

}