public class Sum {
    public static void main(String[] args) {
        for(String temp:args){
            System.out.println(temp);
        }
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double sum = num1+num2;
        System.out.println(sum);
    }
}
