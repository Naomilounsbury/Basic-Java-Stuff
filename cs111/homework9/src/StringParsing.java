
import java.util.Scanner;



public class StringParsing {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter ingredients");
        String theString =scan.nextLine();
        String[] newString = theString.split("[>:]");
        for(String s:newString){
            System.out.println(s.trim());

        }
    }
}
