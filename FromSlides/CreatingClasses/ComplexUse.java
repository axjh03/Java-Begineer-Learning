public class ComplexUse {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(1.0, 2.0);
        Complex c3 = new Complex(4.0, 6.0);

        System.out.println("Not-Normal Adding\n");
        Complex Added3 = c2.add(c1);

        System.out.println(Added3);
        System.out.println(Added3.toString());
        
    }
}
