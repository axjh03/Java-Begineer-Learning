class Engine {
    private String engineType;

    public Engine(String type) {
        engineType = type;
    }

    public String getEngineType() {
        return engineType;
    }
}

class Car {
    private String carModel;
    private Engine engine;  // Composition

    public Car(String model, String engineType) {
        carModel = model;
        engine = new Engine(engineType);  // Car creates an Engine as part of itself.
    }

    public String getCarModel() {
        return carModel;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class Composition {
    public static void main(String[] args) {
        // Create a Car object, which includes an Engine.
        Car sedan = new Car("Sedan", "V6");

        // Access and print car and engine information.
        System.out.println("Car Model: " + sedan.getCarModel());
        System.out.println("Engine Type: " + sedan.getEngine().getEngineType());
    }
}
