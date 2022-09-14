import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) throws IOException {
        File file =new File("dictionary.txt");

        Scanner inputFile = new Scanner(file);
    List<String> dict = new ArrayList();
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            dict.add(line);
        }
        inputFile.close();
        Scanner scan =new Scanner(System.in);
        while(true) {


            System.out.println("Enter word to spellcheck (or exit to end)");
            String wordToSpellCheck = scan.nextLine();
            if (!wordToSpellCheck.equalsIgnoreCase("exit")) {

                if (dict.contains(wordToSpellCheck)) {
                    System.out.println(wordToSpellCheck + " is spelled correctly.");
                } else {
                    System.out.println(wordToSpellCheck + " is not spelled correctly.");
                }
            } else {

                System.out.println("Ending program...");
                System.exit(0);
            }

        }


    }


}

