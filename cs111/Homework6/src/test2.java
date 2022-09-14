import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many dollars will you spend?");
        int dollars = Integer.parseInt(scan.nextLine());
        int coffees =0;
        int free=0;
        int stars=0;
        int firstDollars=dollars;


        while(dollars<=0){
            System.out.println("How many dollars will you spend?");
            dollars = Integer.parseInt(scan.nextLine());
 }
        while(dollars>=7) {
            dollars = dollars - 7;
            free++;
            stars++;
            if (stars == 7) {
                free++;
                stars = 1;
            }
        }

        int dollarsRemaining=dollars;
        if(dollarsRemaining+stars>=7){
            free++;
            stars=(dollarsRemaining+stars)%7+1;
        }else{
            stars=dollars+stars;
        }
        coffees = firstDollars+free;


//        if(dollars<7){
//            coffees =dollars;
//            stars=dollars;
//            System.out.printf("Coffees: %d\nStars remaining: %d\n",coffees,stars);
//        }

//        else if(dollars>=7){
//            coffees=dollars+numberToAdd;
//           stars=dollars%7;
//            int checking =dollars%7+stars;
//            if(checking>7){
//                coffees=coffees+1;
//                stars=coffees%7;
//            }



            System.out.printf("Coffees: %d\nStars remaining: %d\n",coffees,stars);
        }



//





}
