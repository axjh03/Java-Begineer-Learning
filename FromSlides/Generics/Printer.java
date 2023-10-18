public class Printer<T extends Animal> // This is called Bounded Generics 
{ 
    T thingtoprint;

    public Printer(T thingtoprint)
    {
        this.thingtoprint = thingtoprint;
    }

    public void printer()
    {
        thingtoprint.eat(); // We can 
        // System.out.println(thingtoprint); // Will not work because we have not implemented toString() method in Animal.java
    }
}
