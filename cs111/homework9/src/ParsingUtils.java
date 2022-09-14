public class ParsingUtils {
    public static void changeLetter(StringBuilder sb, char letter){
        String string=String.valueOf(letter);
        int counter=0;
        for(int i =0; i<sb.length(); i++){

            if(sb.charAt(i)==letter){
                sb.setCharAt(i,String.valueOf(sb.charAt(i)).toUpperCase().charAt(0));

            }
        }

    }
    public static void changeLetter(StringBuilder sb, String letter){

        int counter=0;
        for(int i =0; i<sb.length(); i++){
            for(int j =0; j< letter.length();j++){
                if(letter.charAt(j) == sb.charAt(i)){
                    sb.setCharAt(i,String.valueOf(sb.charAt(i)).toUpperCase().charAt(0));

                }
            }
        }
    }
}
