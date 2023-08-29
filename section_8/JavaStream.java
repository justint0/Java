package section_8;

import java.util.ArrayList;
import java.util.stream.Collectors;

// Streams are wrappers around a data source, allowing us to operate with that data source and making bulk processing convenient

public class JavaStream {
  public static void main(String[] args) {

    // Create an ArrayList to hold movies
    ArrayList<Movie> movies = new ArrayList<>();

    movies.add(new Movie("Star Wars", "George Lucas", 1977, 9.3f));
    movies.add(new Movie("Pulp Fiction", "Quentin Tarantino", 1994, 8.7f));
    movies.add(new Movie("2001: A Space Odyssey", "Stanley Kubrick", 1968, 9.9f));
    movies.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", 2001, 9.4f));
    movies.add(new Movie("The Shining", "Stanley Kubrick", 1980, 7.8f));
    movies.add(new Movie("The Dark Knight Rises", "Christopher Nolan", 2012, 9.1f));

    // Filter, collect, and forEach methods chained
    ArrayList<Movie> oldMovies = movies.stream()
      .filter(movie -> movie.yearReleased < 2000)
      .collect(Collectors.toCollection(ArrayList::new));
    oldMovies.forEach(movie -> System.out.println(movie.title));
  }
}
