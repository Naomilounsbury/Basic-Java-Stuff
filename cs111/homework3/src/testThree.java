import java.util.Scanner;

public class testThree {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's your favorite city?");
        String text = keyboard.nextLine();
        char firstLetter = text.charAt(0);
        int index = text.length();
        String upperCase = text.toUpperCase();
        String lowerCase = text.toLowerCase();
        //char lastLetter = charAt(index);
        System.out.println("Number of characters: " + index);
        System.out.println("First character: " + firstLetter);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        //System.out.println(index);
    }
}
