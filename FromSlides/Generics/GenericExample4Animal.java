public class GenericExample4Animal{
    public static void main(String[] args){
        Printer<Animal> animalprinter =  new Printer<Animal>(new Animal("Aalok", 49));
        // animalprinter.printer("IDK what to print");
        // The method printer() in the type Printer<Animal> is not applicable for the arguments (String)Java(67108979)
        animalprinter.printer();
    }
}