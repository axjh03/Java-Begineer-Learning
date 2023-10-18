public class Example2Generic {
    public static void main(String[] args){
        GenericPrinter<Integer> IntPrinter = new GenericPrinter<Integer>(5324);
        IntPrinter.printer();

        GenericPrinter<String> StrPrint = new GenericPrinter<String>("HOLA");
        StrPrint.printer();

    }
}
