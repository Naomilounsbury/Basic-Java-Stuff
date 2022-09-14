import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a height");
        int height = Integer.parseInt(scan.nextLine());
        if(height<1){
            System.out.println("Height must be at least one.");
            System.exit(0);

        }
        for(int i=0;i<height;i++){
            for(int j=0;j<(i+1);j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
