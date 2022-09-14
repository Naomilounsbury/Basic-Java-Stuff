public class test6 {

        public static void main(String[] args) {
            int counter=99;
            for(int i=0;counter<=100&&counter>2;i--){
                int count =counter--;
                System.out.println(count+" bottles of Pepsi on the wall, "+count+" bottles of Pepsi.");
                int newCount =count-1;
                System.out.println("Take one down, pass it around, "+newCount+" bottles of Pepsi on the wall.");

            }
            System.out.println(2+" bottles of Pepsi on the wall, 2 bottles of Pepsi.");
            System.out.println("Take one down, pass it around, 1 bottle of Pepsi on the wall.");
            System.out.println(1+" bottle of Pepsi on the wall, 1 bottle of Pepsi.");
            System.out.println("Take one down, pass it around, 0 bottles of Pepsi on the wall.");
        }


}
