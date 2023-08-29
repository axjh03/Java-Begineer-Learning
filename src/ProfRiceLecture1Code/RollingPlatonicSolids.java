import java.lang.reflect.Array;
import java.util.Arrays;
public class RollingPlatonicSolids {
    public static void main(String[] args){
        String nl = System.lineSeparator();

        if(args.length !=2){
            System.err.println("usage : Java Roll #dice #sides");
            System.exit(-2);
        }


        int numSides = Integer.parseInt(args[1]);
        int numDice = Integer.parseInt(args[0]);

        int dice[] = new int[numDice];

        for(int i=0; i<numDice; ++i){
            dice[i] = i + (int) (numSides * Math.random());

        }
        Arrays.sort(dice);

        int sum=0;
        for (int d : dice){
            sum += d;
            System.out.print(" "+d);

        }

        System.out.println(nl + "Sum = " + sum );
        System.out.println(nl + "Average = " + ((double) sum / (double) numDice));


    }}
