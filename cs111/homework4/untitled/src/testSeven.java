import java.util.Scanner;

public class testSeven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int num=Integer.parseInt(scan.nextLine());
        if(num==1){
            System.out.println("I");
        }else if(num==2){
            System.out.println("II");

        }else if(num==3){
            System.out.println("III");

        }else if(num==4){
            System.out.println("IV");

        }else if(num==5){
            System.out.println("V");

        }else if(num==6){
            System.out.println("VI");

        }else if(num==7){
            System.out.println("VII");

        }else if(num==8){
            System.out.println("VIII");

        }else if(num==9){
            System.out.println("IX");

        }else if(num==10){
            System.out.println("X");

        }else System.out.println("That's not between 1 and 10");

    }
}
