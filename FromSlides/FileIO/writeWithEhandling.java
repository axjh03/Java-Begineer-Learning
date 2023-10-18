package FileIO;

import java.io.*;

class writeWithEhandling{
    public static void main(String[] args) throws IOException
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("file.xt"));
            bw.write("This is a new file");
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println("Operation Failed : \n"+e);
        }
    }
}