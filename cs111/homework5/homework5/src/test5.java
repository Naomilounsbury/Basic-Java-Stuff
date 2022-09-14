import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a positive, non-zero integer");
        int num = scan.nextInt();
        int savedNum =num;
        int sum=0;
        if(num>0){
            for(int i=0; i<num;num-- ){
                int num1 = num;
               sum+=num1;
                //System.out.println(num);

            }
            System.out.println("Sum of numbers from 1 to "+savedNum+" is "+sum);
        }else if(num==0){
            System.out.println("Hey, I said non-zero");
        }else if(num<0){
            System.out.println("Hey, I said positive");
        }else{
            System.out.println("Hey, I said integer");
        }
    }
}
