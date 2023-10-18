package FileIO.WriteToFileandRecreate;

import java.io.BufferedWriter; import java.io.BufferedReader;
import java.io.FileReader; import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class ReadfromFile
{
    public static void read(String filename, SaveFile var1) throws IOException
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            String name = br.readLine();

            // It is what it is for BigInteger
            BigInteger ph = new BigInteger(br.readLine());

            // Everything will be a string and hence we need to typecast it
            double gpa = Double.parseDouble(br.readLine());
            boolean pass = Boolean.parseBoolean(br.readLine());


            // SaveFile object
             var1 = new SaveFile(name, ph, gpa, pass);
        }

        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws IOException
    {
        SaveFile var1 = null;
        read("file.txt", var1);
        System.out.println(var1);
    }
}
