import java.util.Scanner;

public class testEight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of seconds");
        int num = Integer.parseInt(scan.nextLine());
        if (num < 60) {
            System.out.println(num + " second(s)");
        } else if (num < 3600) {
            int minutes = num / 60;
            int seconds = num % 60;
            if(minutes!=0)
            System.out.println(minutes + " minute(s)");
            if(seconds!=0)
            System.out.println(seconds + " second(s)");
        } else if (num < 86400) {
            int minutes = num / 60;

            int hours = minutes / 60;
            int remain = minutes % 60;
            int min = remain % 60;

            int seconds = num % 60 % 60;
            if(hours!=0){
                System.out.println(hours + " hour(s)");
            }
            if(min!=0)
            System.out.println(min + " minute(s)");
            if(seconds!=0)
            System.out.println(seconds + " second(s)");

        } else if (num >= 86400) {
            int minutes = num / 60;

            int hours = minutes / 60;
            int days = hours / 24;
            int dayRemain = hours % 24;
            int hour = dayRemain % 60;
            int remain = minutes % 60;
            int min = remain % 60;


            int seconds = num%60;

            System.out.println(days + " day(s)");
            if(hour!=0)
            System.out.println(hour + " hour(s)");
            if(min!=0)
            System.out.println(min + " minute(s)");
            if(seconds!=0)
            System.out.println(seconds + " second(s)");

        }
    }
}
