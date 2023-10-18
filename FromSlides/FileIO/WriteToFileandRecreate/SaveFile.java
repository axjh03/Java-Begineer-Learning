package FileIO.WriteToFileandRecreate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

public class SaveFile{

    public String name;
    public BigInteger ph;
    public double GPA;
    public boolean PASS;
    public SaveFile(String name, BigInteger ph, double GPA, boolean PASS)
    {
        this.name = name;
        this.ph = ph;
        this.GPA = GPA;
        this.PASS = PASS;
    }

    @Override
    public String toString()
    {
       String rtrn =  (name+"\n"+ph+"\n"+GPA+"\n"+PASS);
       return rtrn;
    }

    public void save(BufferedWriter bw) throws IOException
    {
        bw.write(name+'\n');
        bw.write(""+ ph +'\n');
        bw.write(""+ GPA+'\n');
        bw.write(""+PASS+'\n');
    }

    public static void main(String[] args) throws IOException
    {
        SaveFile savefile = new SaveFile("Aalok", new BigInteger("9443241987"), 4.3, true);
        System.out.println(savefile.toString());
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        savefile.save(writer);
        writer.close(); // Must close after writing

    }
}
