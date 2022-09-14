import java.util.Scanner;

public class testSix {
    public static void main(String[] args) {
        System.out.println("== BMI Calculator ==");
        Scanner scan = new Scanner(System.in);
        System.out.println("Step 1: Enter height\n" + "Feet:");
        double feet= Double.parseDouble(scan.nextLine());
        System.out.println("Inches:" );
        double inches = Double.parseDouble(scan.nextLine());
        System.out.println("Step 2: Enter weight\n" +
                "Pounds:");
        double pounds=Double.parseDouble(scan.nextLine());
    double height =(feet*12)+inches;
    double bmi =(pounds/(height*height)*702);
    double overweightBmi =bmi+.1;
        if(bmi<18.5) {
            System.out.printf("BMI: %.1f, you are underweight.\n",bmi );
        }else if(bmi>18.5&&bmi<24.9){
            System.out.printf("BMI: %.1f, you are normal.\n", bmi);
        }else if(bmi>24.9&&bmi<29.9){
            System.out.printf("BMI: %.1f, you are overweight.\n", bmi);
        } else if(bmi>29.9){
        System.out.printf("BMI: %.1f, you are obese.\n", overweightBmi);
    }

    }
}
