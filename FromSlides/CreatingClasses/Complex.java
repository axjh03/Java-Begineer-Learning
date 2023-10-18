public class Complex {
    
    public Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    double real, imaginary; // we can write this anywhere in the class

    // Deafult constructor, chaining to the other constructor
    public Complex()
    {
        this(0.0,0.0);
    }
     
    public Complex add(Complex Parameter1){
        return new Complex(Parameter1.real, Parameter1.imaginary);
    }
    public String toString(){
        return "("+real+"+"+imaginary+"i)";
    }
}
