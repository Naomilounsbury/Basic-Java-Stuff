
import java.util.Scanner;

import java.text.DecimalFormat;

public class testNine {
    public static void main(String[] args) {
        DecimalFormat myFormat = new DecimalFormat("###,###.###");


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of software packages to purchase");
        double num = Double.parseDouble(scan.nextLine());

        String percent = "%!";


        if(num<10){
            double price=num*99;
            System.out.printf("Total cost: $%.2f",price);
        }else if(num<20){
            double preDiscount =num*99;
            String preDiscounted= myFormat.format(preDiscount);
            double discount =num*99*.2;
            double price = preDiscount-discount;
            System.out.printf("Since you purchased %.0f packages, you earned a discount of 20%s\nPre-discount total: $%s0\nTotal cost: $%.2f", num, percent, preDiscount, price);
        }else if(num<50){
            double preDiscount =num*99;
            String preDiscounted= myFormat.format(preDiscount);
            double discount =num*99*.3;
            double price = preDiscount-discount;
            System.out.printf("Since you purchased %.0f packages, you earned a discount of 30%s\nPre-discount total: $%s0\nTotal cost: $%.2f", num, percent, preDiscounted, price);
        }else if(num<100){
            double preDiscount =num*99;
            String preDiscounted= myFormat.format(preDiscount);
            double discount =num*99*.4;
            double price = preDiscount-discount;
            System.out.printf("Since you purchased %.0f packages, you earned a discount of 40%s\nPre-discount total: $%s0\nTotal cost: $%.2f", num, percent, preDiscounted, price);
        }else if(num>=100){
            double preDiscount =num*99;
            String preDiscounted= myFormat.format(preDiscount);
            double discount =num*99*.5;
            double price = preDiscount-discount;
            System.out.printf("Since you purchased %.0f packages, you earned a discount of 50%s\nPre-discount total: $%s\nTotal cost: $%.2f", num, percent, preDiscounted, price);
        }

    }
}
