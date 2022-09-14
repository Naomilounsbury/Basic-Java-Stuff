import java.util.Scanner;

public class testTwo {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter some text");
        String text = keyboard.nextLine();
        char firstLetter = text.charAt(0);
        int index = text.length()-1;
        char lastLetter = text.charAt(index);
        //char lastLetter = charAt(index);
        System.out.println("You entered: " + text);
        System.out.println("First letter: " + firstLetter);
        System.out.println("Last letter: " + lastLetter);
        //System.out.println(index);
    }
}
