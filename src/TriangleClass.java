public class TriangleClass {
    // Classes are like BluePrints
    // Behaviours are functions inside a class and is also sometimes called a method

    // An instance is a object created from a class

    // How to create instances? Use Constructors

    // Constructions may or may not take inputs
    double base, height, sideLenOne, sideLenTwo, sideLenThree; // accessible throughout the class
    public TriangleClass(double base, double height, double sideLenOne, double sideLenTwo, double SideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = SideLenThree;
    }

    //We call it like any other function

    //behaviour

    public double findArea(){
        return (this.base * this.height)/2;
    }
}
