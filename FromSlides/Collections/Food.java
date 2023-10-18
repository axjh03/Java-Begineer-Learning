import java.util.ArrayList;
import java.util.Arrays;

public class Food{
    private ArrayList<Fruit> fruits = new ArrayList<>(
        Arrays.asList(
            new Fruit("Apple"),
            new Fruit("Banana"),
            new Fruit("Orange")
        )
    );
}
