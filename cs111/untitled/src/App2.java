import java.io.FileNotFoundException;

import java.util.Scanner;


public class App2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a filename");
        String fileTitle = scan.nextLine();
        FileStats file =new FileStats(fileTitle);
        System.out.println(fileTitle+" has "+file.getNumLines()+" lines");
        System.out.println("Enter some text");
        String text = scan.nextLine();



        System.out.println(file.getNumLinesThatContain(text)+" line(s) contain "+"\""+text+"\"");




    }
}
