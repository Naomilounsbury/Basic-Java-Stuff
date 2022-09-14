import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter zero to exit:");
        int num = scan.nextInt();
        while(num!=0){
            System.out.println("Enter zero to exit:");
            num =scan.nextInt();
        }
    }


}
