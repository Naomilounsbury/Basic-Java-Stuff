import java.util.Scanner;

public class testFive {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = keyboard.nextLine();

        System.out.println("Enter an age");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("Enter a city");
        String city = keyboard.nextLine();

        System.out.println("Enter the name of a college");
        String college = keyboard.nextLine();

        System.out.println("Enter a profession");
        String profession = keyboard.nextLine();

        System.out.println("Enter an animal");
        String animal = keyboard.nextLine();

        System.out.println("Enter a pet name");
        String petName = keyboard.nextLine();


        int finishCollege = age+4;



        System.out.println("Here's your story");
        System.out.println("There was once someone named "+name+" who lived in "+city+".");


        System.out.println("At the age of "+age+", "+name+" went to college at "+college+".");
        System.out.println("After 4 years, "+name+" was "+finishCollege+".");
        System.out.println(name+" then graduated and went to work as a "+profession+".");
        System.out.println("Then, "+name+" adopted a(n) "+animal+" named "+petName+".");
        System.out.println("They both lived happily ever after!");

    }
}
