import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many integers do you have? (Max 20)");
        int sum=0;
        int howMany=scan.nextInt();
        if(howMany<1||howMany>20){
            System.out.println("You must enter a number in between 1 and 20");
            System.exit(1);
        }
        int[] num =new int[howMany];

        for(int i=0;i<howMany; i++){
            System.out.println("Enter element for subscript "+i);
            num[i]=scan.nextInt();
        }
        System.out.println("Here are all of those numbers");
        for(int i=0;i<howMany; i++){
            System.out.println(num[i]);
            sum=sum+num[i];

        }
        System.out.println("The sum of these numbers is "+sum);

    }
}
