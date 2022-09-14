import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {

    private String name;
    private int year;
    private String genre;
    public static ArrayList<Movie> loadsDatabase() throws FileNotFoundException {
        File file =new File("db.txt");
        int counter=0;
        Scanner inputFile = new Scanner(file);
        ArrayList<Movie> movies = new ArrayList();
        while (inputFile.hasNext()) {

            Movie movie= new Movie(inputFile.nextLine(),Integer.parseInt(inputFile.nextLine()), inputFile.nextLine());
            movies.add(movie);
        }
        return movies;

    }

    public Movie(String name, int year, String genre) {
        this.name = name;
        this.year = year;
        this.genre = genre;
    }

    public Movie() {
    }

    public boolean equals(String name){
        return this.name.equals(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", genre='" + genre + '\'' +
                '}';
    }
}
