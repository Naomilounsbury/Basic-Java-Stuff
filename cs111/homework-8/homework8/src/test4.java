import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five names");

        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter friend " + (i + 1));
            names[i] = scan.nextLine();
        }
        System.out.println("Here are all of those names");
        for (int i = 0; i < 5; i++) {
            System.out.println("Friend "+(i+1)+" is "+names[i]);

        }
        System.out.println("Which friend is your best friend? (Enter an integer)");
        int num = scan.nextInt();
        num=num-1;
        System.out.println(names[num]+"? Yes, "+names[num]+" is awesome");
    }

}
