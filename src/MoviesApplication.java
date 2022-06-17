import movies.Movie;
import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;


public class MoviesApplication {
    public static void filterMovies(Movie[] arr) {
        Input input = new Input();
        System.out.println("0 to Exit\n1 to View all movies\n2 to view category 'Animated'\n3 to view category 'Drama'\n4 to view category 'Horror'\n5 to view category 'comedy'\n6 to view category 'Musical'\n7 to view category 'Scifi'\n8 to add a movie\n");
        int num = input.getInt("Make a selection");
        if (num >= 0 && num <= 8) {
            if (num == 1) {
                for (Movie movie : arr) {
                    System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                }
            } else if (num == 2) {
                for (Movie movie : arr) {
                    if (movie.getCategory().equalsIgnoreCase("animated")) {
                        System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (num == 3) {
                for (Movie movie : arr) {
                    if (movie.getCategory().equalsIgnoreCase("drama")) {
                        System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (num == 4) {
                for (Movie movie : arr) {
                    if (movie.getCategory().equalsIgnoreCase("horror")) {
                        System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (num == 5) {
                for (Movie movie : arr) {
                    if (movie.getCategory().equalsIgnoreCase("comedy")) {
                        System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (num == 6) {
                for (Movie movie : arr) {
                    if (movie.getCategory().equalsIgnoreCase("musical")) {
                        System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (num == 7) {
                for (Movie movie : arr) {
                    if (movie.getCategory().equalsIgnoreCase("scifi")) {
                        System.out.printf("%s - %s%n", movie.getName(), movie.getCategory());
                    }
                }
            } else if (num == 8) {
                Input data = new Input();
                String mvTitle = data.getString("Add movie title:");
                String mvCategory = data.getString("Add a category:");
                Movie[] newMovieArr = addMovie(arr, mvTitle, mvCategory);
                System.out.println(newMovieArr);
                filterMovies(newMovieArr);
            }
        } else if (num == 0) {

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
