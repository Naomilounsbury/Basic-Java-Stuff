import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class example7 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter outputFile =new PrintWriter("example7.txt");
        for(char c1 ='a';c1<='z';c1++){

            for(char c2 ='a';c2<='z';c2++){
                for(char c3 ='a';c3<='z';c3++){

                    outputFile.println("result"+c1+c2+c3);
                }
            }

        }
        outputFile.close();
    }


}
