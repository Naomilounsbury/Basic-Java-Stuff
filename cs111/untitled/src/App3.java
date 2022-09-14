import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name");
        String name =scan.nextLine();
        System.out.println("Enter score 1 or a negative number to exit");
        double score =Double.parseDouble(scan.nextLine());
        if(score<0){
            System.exit(1);
        }
        double score1 =0;
       TestScores testScores =new TestScores();
       testScores.setName(name);
       testScores.addTestScore(score);
       int counter=1;

           while (score >= 0 && score <= 100) {
               counter++;
               System.out.println("Enter score "+ counter+" or a negative number to exit");
               score = scan.nextDouble();
               if(score>=0&&score<=100) {
                   testScores.addTestScore(score);
               }

           }


        System.out.println("-- "+testScores.getName()+" --");
        System.out.println("Num tests taken: "+testScores.getNumTestsTaken());
        System.out.printf("Average: %.1f\n",testScores.getAverage());

    }

}
