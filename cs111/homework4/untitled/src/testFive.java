
import java.util.Scanner;

public class testFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number");
        double num2 = scan.nextDouble();

        System.out.println("Enter a menu option");
        System.out.println("[1] Add");
        System.out.println("[2] Subtract");
        System.out.println("[3] Multiply");
        System.out.println("[4] Divide");
        int operation = scan.nextInt();

        if (operation == 1) {
            System.out.printf(num1 + " + " + num2 + " = %.1f\n", (num1 + num2));
        } else if (operation == 2) {
            System.out.printf("%.1f - %.1f = %.1f\n",num1,num2,(num1-num2));
        } else if (operation == 3) {
            System.out.printf(num1 + " * " + num2 + " = %.1f\n", (num1 * num2));

        } else if (operation == 4 && num2 == 0) {
            System.out.println("If division is selected the second number cannot be zero");
    }else if(operation==4) {
        System.out.printf(num1 + " / " + num2 + " = %.1f\n", (num1 / num2));
    }else {
            System.out.println("Invalid menu option");

    }
    }
}
