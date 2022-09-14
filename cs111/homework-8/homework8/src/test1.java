import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("How many integers do you have? (Max 20)");
        int howMany=scan.nextInt();
        int[] num =new int[howMany];

        for(int i=0;i<howMany; i++){
            System.out.println("Enter element for subscript "+i);
            num[i]=scan.nextInt();
        }
        System.out.println("Here are all of those numbers");
        for(int i=0;i<howMany; i++){
            System.out.println(num[i]);
        }


    }
}
