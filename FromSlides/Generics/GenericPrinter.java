public class GenericPrinter<T> {
    T thingtoprint; // T could be any type. We don't know yet.

    public GenericPrinter(T thingtoprint){
        this.thingtoprint = thingtoprint;
    }

    public void printer(){
        System.out.println(thingtoprint);
    }

}
