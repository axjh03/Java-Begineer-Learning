package FileIO; // The folder

import java.io.BufferedReader; import java.io.BufferedWriter;
import java.io.FileReader; import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class loadArray{

    public static void main(String[] args) throws IOException
    {


        ArrayList<Integer> intArray = new ArrayList<Integer>();
        BufferedReader br = new BufferedReader(new FileReader("main.txt"));
        String line;
        while((line=br.readLine()) !=null)
        {
            int toAddElement = Integer.parseInt(line);
            intArray.add(toAddElement);
        }

        for (int i = 0; i<intArray.size(); i++)
        {
            System.out.println(intArray.get(i));
        }
    }
}