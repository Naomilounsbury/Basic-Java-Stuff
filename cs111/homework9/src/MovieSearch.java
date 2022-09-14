import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieSearch {


        public static void main(String[] args) throws IOException {
           Scanner scan =new Scanner(System.in);
           ArrayList<Movie> movieDb= Movie.loadsDatabase();

//           System.out.println("Movie search by characters. Enter two characters.");
//           String charactersToSearch = scan.nextLine();
//            System.out.println("Movies that start with "+charactersToSearch);
//           findMatchingMovie(movieDb,charactersToSearch);
//            System.out.println("Movie search by year range. Enter two years.");
//            int firstYearToSearch = scan.nextInt();
//            int secondYearToSearch = scan.nextInt();
//            System.out.println("Movies with short names that were released between "+firstYearToSearch+" and "+secondYearToSearch);
//            findMatchingYear(movieDb, firstYearToSearch,secondYearToSearch);
            System.out.println("Similar title finder. Enter a movie name.");
            String titleToSearch = scan.nextLine();

            System.out.println("Here are the 3 movies that are listed before the one you entered");
            findSimilarMovie(movieDb, titleToSearch);

        }
        public static void findMatchingMovie( ArrayList<Movie> movieDb, String charactersToSeach){
            int numMatches =0;

            for (Movie movie : movieDb) {

                if(movie.getName().length()>=2){
                    if (movie.getName().substring(0,2).equals(charactersToSeach)) {

                        System.out.println(movie.getName());
                        numMatches++;
                    }
                }
                }
            if(numMatches==0){
                System.out.println("No matching movies found!");
            }else System.out.println("Number of matches: "+numMatches);



    }
    public static void findMatchingYear( ArrayList<Movie> movieDb, int year, int twoYear){
        int numMatches =0;

        for (Movie movie : movieDb) {

            if(movie.getYear()>=year&&movie.getYear()<=twoYear){
                if(movie.getName().length()<6){
                    System.out.println(movie.getName());
                    numMatches++;
                }

            }
        }
        if(numMatches==0){
            System.out.println("No matching movies found!");
        }else System.out.println("Number of matches: "+numMatches);



    }
    public static void findSimilarMovie( ArrayList<Movie> movieDb, String titleToSearch){

        int theIndex =0;
        int theSecondId =0;
        int theThirdId =0;
        int theFirstMovie =0;
        String name1 =null;
        String name2 =null;
        String name3 =null;

        for (Movie movie : movieDb) {
            if (titleToSearch.equals(movie.getName())) {
                    theIndex=movieDb.indexOf(movie);
                    break;
            }

            }
        name1=movieDb.get(theIndex-1).getName();

        name2=movieDb.get(theIndex-2).getName();

        name3=movieDb.get(theIndex-3).getName();
        System.out.println(name3);
        System.out.println(name2);
        System.out.println(name1);
        }


    }



