public class deafultConstructorsUse {
    public static void main(String[] args) {
        deafultConstructors complex = new deafultConstructors();
        deafultConstructors complex2 = new deafultConstructors(1.0, 2.0);
        System.out.println("Non-deafult\n" + complex2.toString());
        System.out.println("Deafult\n"+complex.toString());
    }
}
