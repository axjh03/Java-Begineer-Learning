public class Cat extends Animal{
    String Name;
    @Override
    public String toString(String Name, int Age) {
        return Name+" is "+Age+" years old.";
    }
}