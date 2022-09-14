public class Exam {
    public static double getAverage(double d1, double d2, double d3, double d4, double d5){
        double average =(d1+d2+d3+d4+d5)/5;
        return average;
    }
    public static char determineGrade(double avg){
        if(avg<60){
            return 'F';
        } else if (avg<70) {
            return 'D';


        } else if (avg<80) {
            return 'C';
        }else if(avg<90){
            return 'B';

        }else{
            return 'A';
        }
    }
}
