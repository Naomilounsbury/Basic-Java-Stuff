import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class test4 {


        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter filename");
           String filename =scan.nextLine();
           File file =new File(filename);
           if(file.exists()) {
               Scanner inputFile = new Scanner(file);
               int numbering = 0;
               while (inputFile.hasNext()) {
                   numbering++;
                   String line = inputFile.nextLine();
                   System.out.println(numbering + ": " + line);
               }

               inputFile.close();
           }else System.out.println("File not found");
        }
    }

