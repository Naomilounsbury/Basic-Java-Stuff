import java.util.Scanner;

public class Validate {
    public static String getName(Scanner keyboard){
    String input;
    do{
        System.out.println("Enter a name. The name must be in between 5 and 15 characters.");
        input=keyboard.nextLine();
    }while(input.length()<5||input.length()>15);

    return input;

    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name = Validate.getName(keyboard);
        System.out.println("Validated name: " + name);

    }
}
