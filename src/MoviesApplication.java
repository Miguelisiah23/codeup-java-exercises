import movies.Movie;
import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;


public class MoviesApplication {

    public static void printMovie(Movie[] arr) {
        for (Movie movie : arr) {
            System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
        }
    }

    public static void printMovie(Movie[] arr, String genre) {
        for (Movie movie : arr) {
            if (movie.getCategory().equalsIgnoreCase(genre)) {
                System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
            }
        }
    }
    public static void contBrowsing(Movie[] arr){
        Input input = new Input();
        String str = input.getString("Continue Browsing? [Y/N]");
        if(str.equalsIgnoreCase("y")){
            filterMovies(arr);
        }

    }

    public static void filterMovies(Movie[] arr) {
        Input input = new Input();
        System.out.println("0 to Exit\n1 to View all movies\n2 to view category 'Animated'\n3 to view category 'Drama'\n4 to view category 'Horror'\n5 to view category 'comedy'\n6 to view category 'Musical'\n7 to view category 'Scifi'\n8 to add a movie\n");
        int num = input.getInt("Make a selection");
        if (num >= 0 && num <= 8) {
            if (num == 1) {
                printMovie(arr);
                contBrowsing(arr);
            } else if (num == 2) {
                printMovie(arr, "animated");
                contBrowsing(arr);
            } else if (num == 3) {
                printMovie(arr, "drama");
                contBrowsing(arr);
            } else if (num == 4) {
                printMovie(arr, "horror");
                contBrowsing(arr);
            } else if (num == 5) {
                printMovie(arr, "comedy");
                contBrowsing(arr);
            } else if (num == 6) {
                printMovie(arr, "musical");
                contBrowsing(arr);
            } else if (num == 7) {
                printMovie(arr, "scifi");
                contBrowsing(arr);
            } else if (num == 8) {
                Input data = new Input();
                String mvTitle = data.getString("Add movie title:");
                String mvCategory = data.getString("Add a category:");
                Movie[] newMovieArr = addMovie(arr, mvTitle, mvCategory);
                System.out.println(Arrays.toString(newMovieArr));
                filterMovies(newMovieArr);
            } else if (num == 0) {

            }
        } else {
            filterMovies(arr);
        }
    }


    public static Movie[] addMovie(Movie[] arr, String movieTitle, String category) {
        Movie[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = new Movie(movieTitle, category);
        return newArr;
    }

    public static void main(String[] args) {
        Movie[] arr = findAll();
        filterMovies(arr);
    }
}
