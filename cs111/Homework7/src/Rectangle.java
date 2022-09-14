import java.util.Scanner;

public class Rectangle {
    public static double getLength(Scanner keyboard){
        System.out.println("Enter length: ");
        double input;
        input= keyboard.nextDouble();
        return input;

    }
    public static double getWidth(Scanner keyboard){
        System.out.println("Enter width: ");
        double input;
        input= keyboard.nextDouble();
        return input;

    }
    public static double getArea(double length, double width){

    double area=length*width;
    return area;

    }
    public static void displayData(double length, double width){
        double area=length*width;
        System.out.println("-- Rectangle info --");
        System.out.printf("Length: %.1f\n",length);
        System.out.printf("Width: %.1f\n",width);
        System.out.printf("Area: %.1f\n",area);


    }


}
