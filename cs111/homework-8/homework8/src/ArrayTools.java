import java.util.ArrayList;

public class ArrayTools {
    public static int printAll(String ... arr){
        for(int i=0;i< arr.length;i++){

            System.out.println("["+i+"]: "+arr[i]);

        }

        return arr.length;
    }
    public static String[] copy(String[] arr, String[] arr1){
        if(arr1.length<arr.length){

            System.out.println("Error: Second array isn't big enough.");
            System.exit(1);
        }
            for(int i=0;i< arr.length;i++){

                arr1[i]=arr[i];
                System.out.println(arr1.length);

            }
            return arr1;
    }
    public static String[] filter(String[] arr){

        for(int i=0;i<arr.length; i++){
            if(arr[i].length()>5){
                arr[i]=arr[i].toUpperCase()+" <-- Longer than five letters";
            }

        }
        return arr;
    }
}
