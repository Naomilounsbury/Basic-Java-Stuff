import java.util.Scanner;

public class testOne {
    public static void main(String[] args){
        System.out.println("== One Year Interest Calculator ==");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How much money do you have?");
        double money = keyboard.nextDouble();
        System.out.println("What's the interest rate?");
        double interestRate = keyboard.nextDouble();
        double interest = money * (interestRate/100);
        double balance = money+interest;
        System.out.println("Interest earned: $"+interest);
        System.out.println("New balance: $"+balance);
    }
}
