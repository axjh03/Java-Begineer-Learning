package FileIO;

import java.io.IOException;
import java.io.FileWriter; import java.io.FileReader;
import java.io.BufferedReader; import java.io.BufferedWriter;

class AppendFile{
    public static void main(String[] args) throws IOException
    {
        // Writing Files
        BufferedWriter bw = new BufferedWriter(new FileWriter(args[0], true));
        String lineToWrite = "AmericanMoney, money@dollars.com";
        bw.write(lineToWrite);
        bw.close();

        // Confirming / Reading Files
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String lineBuff;
        while((lineBuff = br.readLine())!=null)
        {
            System.out.println(lineBuff);
        }
    }
}