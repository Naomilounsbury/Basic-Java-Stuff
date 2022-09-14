import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        for(int counter=2;counter<num;counter++){
            if(num%counter==0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num=scan.nextInt();

        System.out.println("prime: "+isPrime(num) );

    }
}
