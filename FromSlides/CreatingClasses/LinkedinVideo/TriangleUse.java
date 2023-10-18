public class TriangleUse{
    public static void main(String[] args){
        // Create a new instance of the class
        Triangle triangleA = new Triangle(2,4,5);
        Triangle triangleB = new Triangle(3,4,5);

        // Call the Area method
        // Aera() is a instance method
        double AreaA = triangleA.Area();
        double AreaB = triangleB.Area();

        // Static Method
        double AreaC = Triangle.Area(3,4,5); // Static method
        //Can't use AreaC static method  because it is not a static method

        // Print the Areas
        System.out.println("Area of triangleA is : " + AreaA);
        System.out.println("Area of triangleB is : " + AreaB);
        System.out.println("Area of triangleC is : " + AreaC);

        // We can even access the attributes of the class
        System.out.println("Length of triangleA is : " + triangleA.length);
    }
}