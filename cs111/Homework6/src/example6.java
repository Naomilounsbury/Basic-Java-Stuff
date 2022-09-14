import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class example6 {
    public static void main(String[] args) throws IOException {
        FileWriter fwriter =new FileWriter("test.txt", true);
        PrintWriter outputFile= new PrintWriter(fwriter);
        outputFile.println("can you see this?");
        outputFile.println("HElloWorld");
        outputFile.println("test");
        outputFile.close();

    }
}
