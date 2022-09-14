import java.util.Scanner;

public class Store {
    public static double calculateRetail(double wholesale, double markup){
       double percentage =markup*.01;
       double addedMoney=percentage*wholesale;
        return wholesale+addedMoney;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter wholesale price and markup percentage");
        double wholesale =scan.nextDouble();
        double markup =scan.nextDouble();
        System.out.printf("%.2f",calculateRetail(wholesale,markup));

    }
}
