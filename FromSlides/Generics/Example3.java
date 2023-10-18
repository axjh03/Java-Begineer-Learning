import java.math.BigInteger;

public class Example3 {

    public static <T> void print(T thingtoprint){
        System.out.println(thingtoprint);
    }
    public static void main(String[] args){
        print(243);
        print("HOLA");
        print(3.1416);
    }
}
