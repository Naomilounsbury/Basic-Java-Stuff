import java.util.ArrayList;

public class ArrayTools {
    public static int printAll(String ... arr){
        for(int i=0;i< arr.length;i++){

            System.out.println("["+i+"]: "+arr[i]);

        }

        return arr.length;
    }
    public static String[] copy(String[] src, String[] dest){
        if(dest.length<src.length){

            System.out.println("Error: Second array isn't big enough.");
            System.out.println("First array size: "+src.length);
            System.out.println("Second array size: "+src.length);
            System.exit(1);
        }
        for(int i=0;i< src.length;i++){

            dest[i]=src[i];


        }
        return dest;
    }

}
