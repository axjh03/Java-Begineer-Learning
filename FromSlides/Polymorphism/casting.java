public class casting {
    public static void doAnimalStuff(animal Animal) {
        dog myDog = (dog)Animal; // Downcasting
        // We are saying 
        // "Hey, I know this is an animal, but I want to treat it like a dog. So let it be a dog animal."
        // This is called downcasting.
        // Now we can call .playDead() method on myDog object.
        myDog.playDead(); 
    }
    public static void main(String[] args){
        // Usually we see this
        // animal myAnimal = new animal();

        cat cat1 = new cat(); // we create a new dog object but cast it to an animal.

        // It works 
        doAnimalStuff(cat1); // We are sending a dog object but casting it to an animal object.
    } 
}
