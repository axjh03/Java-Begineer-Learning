package FileIO; // The folder

// We only need to import the Readers because we are reading
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


class ReadFile{
    // IOException is needed for FileReader
    public static void main(String[] args) throws IOException {
        try
        {
            BufferedReader BufferVar = new BufferedReader(new FileReader((args[0])));
            String line;
            while((line=BufferVar.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.out.println("Error :"+e);
        }
    }
}
