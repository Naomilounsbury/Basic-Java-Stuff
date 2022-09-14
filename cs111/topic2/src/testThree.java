import java.util.Scanner;

public class testThree {  public static void main(String[] args){
    Scanner keyboard= new Scanner(System.in);

    System.out.println("Enter an integer");
    int num1 = keyboard.nextInt();


    int mod = num1 % 2;
    System.out.print(num1+" mod 2 = "+mod);
}
}
