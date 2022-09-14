import java.util.Scanner;

public class testFive {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = keyboard.nextInt();
        System.out.println("Enter second number");
        int num2 = keyboard.nextInt();
        int numAddOne = num2+num2;
        int numAddTwo = numAddOne+num2;
        int numAddThree = numAddTwo+num2;
        int numAddFour = numAddThree+num2;

        int result = num1 + num2;
        int result1 = num1 + numAddOne;
        int result2 = num1 + numAddTwo;
        int result3 = num1 + numAddThree;
        int result4 = num1 + numAddFour;
        System.out.println(num1+" + "+num2+" = "+ result);
        System.out.println(num1+" + "+numAddOne+" = "+ result1);
        System.out.println(num1+" + "+numAddTwo+" = "+ result2);
        System.out.println(num1+" + "+numAddThree+" = "+ result3);
        System.out.println(num1+" + "+numAddFour+" = "+ result4);

    }
}
