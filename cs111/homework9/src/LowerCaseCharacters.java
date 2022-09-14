import java.util.Scanner;

public class LowerCaseCharacters {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a String");
        String theString =scan.nextLine();
        int counter=0;
        for(int i=0; i<theString.length();i++){
            if(Character.isLowerCase(theString.charAt(i))){
                counter++;
            }

        }
        System.out.println("Number of lower case characters: "+ counter);

    }
}
