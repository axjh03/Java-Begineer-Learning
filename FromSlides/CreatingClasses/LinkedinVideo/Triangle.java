// Constructor : A constructor is a special method or behaviour inside every class that creates and initializes instances


// We will use a class in the Triangle class to construct a triangle object and initialize Triangle instances.

// A constructor may or maynot take any inputs

// A constructor doesn't have a return type

// the "this" keyword is used to refer to the current object and help us make a distinction between the attribute variables and the parameter variables

// The "." dot operator is used to access the attributes

// How to use a constructor?
// We call it like a function.
// The only difference is that, we have to use "new" keyword to create a new instance of the class

 // EXAMPLE :
// Triangle t1 = new Triangle(3,4,5);


// When we create a class, we are creating a new way of storing a data.
//Here "Trianle" is a new data type now

public class Triangle{
    double length, breadth, height; // Attributes
    // Static Attributes or Static Class Variables
    
    public static int numSides = 3;  // this will be same for all the instances of the class

    // Constructor
    public Triangle(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // Behaviours
    public double Area(){
        return 0.5 * this.breadth * this.length;
    }

    //Static Behaviours or Static Methods
    public static double Area(double length, double breadth, double height)
    {
        return 0.5 * breadth * length;
    }

}
