import java.util.Scanner;

public class testOne {
    public static void main(String[] args){
        Scanner keyboard= new Scanner(System.in);

        System.out.println("Enter an integer");
        int num1 = keyboard.nextInt();


        int sum = num1 + 1;
        System.out.println(num1+" + 1 = "+sum);
    }
}
