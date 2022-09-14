import java.util.Scanner;

public class testTwo {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter an integer");
        double num1 = keyboard.nextDouble();


        double sum = num1 + 1.0;
        System.out.println(num1+" + 1.0 = "+sum);
    }
}
