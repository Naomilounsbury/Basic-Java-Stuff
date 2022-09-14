import java.util.List;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Check your lottery numbers here!");
        System.out.println("Enter number 1:");
        int num1 =scan.nextInt();
        while(num1<1||num1>99){
            System.out.println("Must be between 1 and 99");
            System.out.println("Enter number 1:");
            num1 =scan.nextInt();
        }
        System.out.println("Enter number 2:");
        int num2 =scan.nextInt();
        while(num2<1||num2>99){
            System.out.println("Must be between 1 and 99");
            System.out.println("Enter number 2:");
            num2 =scan.nextInt();
        }
        System.out.println("Enter number 3:");
        int num3 =scan.nextInt();
        while(num3<1||num3>99){
            System.out.println("Must be between 1 and 99");
            System.out.println("Enter number 3:");
            num3 =scan.nextInt();
        }
        System.out.println("Enter number 4:");
        int num4 =scan.nextInt();
        while(num4<1||num4>99){
            System.out.println("Must be between 1 and 99");
            System.out.println("Enter number 4:");
            num4 =scan.nextInt();
        }
        System.out.println("Enter number 5:");
        int num5 =scan.nextInt();
        while(num5<1||num5>99){
            System.out.println("Must be between 1 and 99");
            System.out.println("Enter number 5:");
            num5 =scan.nextInt();
        }

    int[] lotArr ={num1,num2,num3,num4,num5};
    int matching=0;
    for(int i=0;i<5;i++){

        if(lotArr[i]==8){
            matching++;
        }
        if(lotArr[i]==13){
            matching++;
        }
        if(lotArr[i]==27){
            matching++;
        }
        if(lotArr[i]==53){
            matching++;
        }
        if(lotArr[i]==54){
            matching++;
        }


    }
        System.out.println("All set. The winning numbers were: 8 13 27 53 54");
        if(matching==5){
            System.out.println("WOW! Grand prize winner!");
        }else if(matching==0){
            System.out.println("Well, you didn't win. You got 0 matching number(s)");
        }else{
            System.out.println("Well, you didn't win. You got "+(matching)+" matching number(s)");
        }
    }




}
