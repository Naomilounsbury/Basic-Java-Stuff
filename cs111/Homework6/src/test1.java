

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an ending value");
        int endingValue = Integer.parseInt(scan.nextLine());
        System.out.println("Count up or down?");
        String upOrDown = scan.nextLine();

        int sumOfNumbers = 0;
        while (!upOrDown.equalsIgnoreCase("up") && !upOrDown.equalsIgnoreCase("down")) {
            System.out.println("Count up or down?");
            upOrDown = scan.nextLine();
        }

            if (endingValue >= 0) {
                if (upOrDown.compareToIgnoreCase("up") == 0) {

                    for (int i = 1; i <= endingValue; i++) {
                        sumOfNumbers = sumOfNumbers + i;
                        System.out.printf("%5d%5d%5d\n", i, i + 10, i + 100);


                    }


                } else if (upOrDown.compareToIgnoreCase("down") == 0) {
                    for (int i = -1; i >= 0 - endingValue; i--) {
                        sumOfNumbers = sumOfNumbers + i;
                        System.out.printf("%5d%5d%5d\n", i, i + 10, i + 100);


                    }
                }
            }

        }

    }



//        for (int j = -1; j <= endingValue; j--) {
//        sumOfNumbers = sumOfNumbers + j;
//        System.out.printf("%5d%5d%5d\n", j, j + 10, j + 100);