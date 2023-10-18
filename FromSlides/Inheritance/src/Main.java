// SuperClass
class Animal {
    String AnimalName;

    public Animal(String name) {
        this.AnimalName = name;
    }

    public void eat() {
        System.out.print(AnimalName + " is eating.");
    }

    public void sleep() {
        System.out.println(AnimalName + " is sleeping");
    }
}

//SubClass

class Dog extends Animal{
    //Consturctor // Always needed
    public Dog(String name){// The parameters here go to super class's constructors
        super(name);
        // super() in Java is used to call the constructor of the superclass, allowing you to initialize inherited variables or perform superclass-specific setup in the subclass's constructor. In the given example, super("Buddy") initializes the name variable in the Animal superclass when creating a Dog object with the name "Buddy."Ω
    }
    //Created our own function
    public void bark(){
        System.out.println(AnimalName+" is barking");
    }
}

class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void meou()
    {
        System.out.println(AnimalName + " MEOWWWWW");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Kutta");
        Cat Kitty = new Cat("BenCHo");
        myDog.eat(); //now we can use the other functions
        myDog.sleep();
        Kitty.sleep();
        Kitty.meou();

    }
}

