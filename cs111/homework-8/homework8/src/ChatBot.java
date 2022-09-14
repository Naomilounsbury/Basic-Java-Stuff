public class ChatBot {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("Nothing to say?");
        }else if(args[0].equalsIgnoreCase("how")){
            System.out.println("Fine, but could use some more power.");
        }else if(args[0].equalsIgnoreCase("what")) {
            System.out.println(args[args.length-1]+" I'm only interested in transistors.");
        }else{
            System.out.println("I didn't understand that.");
        }

    }
}
