package FileIO;

import java.io.BufferedReader; import java.io.BufferedWriter;
import java.io.FileReader; import java.io.FileWriter;
import java.io.IOException;

class WriteFile{
    public static void main(String[] args) throws IOException
    {

        //Writing a new patrons to anyfile that is passed in argument 1
        BufferedWriter BW = new BufferedWriter(new FileWriter((args[0])));
        String filename = args[0];
        String lineToWrite = "AmericanMoney, money@dollars.com";
        BW.append(lineToWrite);
        BW.close(); // MUST CLOSE otherwise data will be lost

        // Reading that file
        BufferedReader br = new BufferedReader(new FileReader(args[0]));
        String line;
        while((line=br.readLine()) != null){
            System.out.println(line);
        }
        BW.close();

    }
}