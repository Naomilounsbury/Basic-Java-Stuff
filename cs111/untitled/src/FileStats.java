import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class FileStats {
    private String fileName;

    public FileStats(String fileName) {
        this.fileName = fileName;
    }
    public int getNumLines() throws FileNotFoundException {
        File fileObject =new File(fileName);
        Scanner inputFile =new Scanner(fileObject);
        int numLines =0;
        while(inputFile.hasNext()){
            String line=inputFile.nextLine();
            numLines++;
        }
        inputFile.close();
        return numLines;
    }
    public int getNumLinesThatContain(String str) throws FileNotFoundException {
        File fileObject =new File(fileName);
        Scanner inputFile =new Scanner(fileObject);

        int numLines =0;
        while(inputFile.hasNext()){
            String line=inputFile.nextLine();
            if(line.toLowerCase().contains(str.toLowerCase())) {
                numLines++;
            }
        }
        inputFile.close();
        return numLines;
    }



}
