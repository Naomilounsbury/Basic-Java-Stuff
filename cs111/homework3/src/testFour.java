import java.util.Scanner;

public class testFour {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many batches of cookies do you want?");
        int numOfBatches = keyboard.nextInt();
        int numOfCookies = numOfBatches * 48;
        System.out.println(numOfBatches+" batches? That's " + numOfCookies +" cookies.");
        System.out.println("Alright, here is what you need");
        double sugar = numOfBatches*1.5;
        double butter = numOfBatches;
        double flour = numOfBatches*2.75;

        System.out.println(sugar+" cups of sugar");
        System.out.println(butter+" cup of butter");
        System.out.println(flour+" cups of flour");

    }
}
