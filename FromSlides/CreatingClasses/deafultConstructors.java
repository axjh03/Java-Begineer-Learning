public class deafultConstructors{

    double real, imaginary;
    // #1
    // The file should have been "Complex.java"
    public deafultConstructors(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    // deafult Constructor
    // #2
    public deafultConstructors(){
        this(0.0, 0.0);
    }

    // The #2 chains to #1.

    public String toString(){
        return "("+real+"+"+imaginary+"i)";
    }
}