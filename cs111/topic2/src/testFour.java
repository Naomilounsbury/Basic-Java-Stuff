import java.util.Scanner;

public class testFour {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter base and height separated by a space");
        int num1 = keyboard.nextInt();
        int num2 = keyboard.nextInt();


        double result = (1.0/2.0) * num1 * num2;
        System.out.println("Area: "+ result);
    }
}
