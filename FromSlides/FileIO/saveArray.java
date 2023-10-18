package Arrays;

import java.util.ArrayList;
import java.util.Random;
import java.io.BufferedReader; import java.io.FileReader;
import java.io.BufferedWriter; import java.io.FileWriter;
import java.io.IOException;

public class saveArray{

    public static void main(String[] args) throws IOException{
        Random random = new Random();
        // Making a new integer Array
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for(int i=0; i<4; i++)
        {
            intArray.add(random.nextInt(2424));
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(args[0], true));
        for(int i=0; i<intArray.size();i++)
        {
            bw.write(Integer.toString(intArray.get(i)));
            bw.write("\n");
        }
        bw.close();
    }
}