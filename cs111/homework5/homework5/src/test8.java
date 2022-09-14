import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Which direction would you like to move?");
        System.out.println("[8] North");
        System.out.println("[4] West");
        System.out.println("[2] South");
        System.out.println("[6] East");
        System.out.println("[0] Exit");
        int num = scan.nextInt();
        while(num!=0){
            switch(num){
                case 8:
                    System.out.println("You moved north.");
                    break;
                case 4:
                    System.out.println("You moved west.");
                    break;
                case 6:
                    System.out.println("You moved east.");
                    break;
                case 2:
                    System.out.println("You moved south.");
                    break;
                case 0:
                    break;
        }
            System.out.println("Which direction would you like to move?");
            System.out.println("[8] North");
            System.out.println("[4] West");
            System.out.println("[2] South");
            System.out.println("[6] East");
            System.out.println("[0] Exit");
        num=scan.nextInt();
        }
    }
}
