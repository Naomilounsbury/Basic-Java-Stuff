public class test3 {
    public static void main(String[] args) {
        int counter=0;
        for(int i=0;counter<1000;i++){
            counter++;
            if(counter%5==0){
                System.out.println(-counter);
            }
            if(counter%5!=0){
                System.out.println(counter);
            }



        }

    }
}
