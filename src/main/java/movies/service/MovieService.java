package movies.service;

import movies.data.MovieRepository;
import movies.model.Genre;
import movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

public class MovieService {
    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        return movieRepository.findAll().stream()
                .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(int length) {

        return movieRepository.findAll().stream()
                .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByName(String name) {

        return movieRepository.findAll().stream()
                .filter(movie -> movie.getName().contains(name)).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByTemplate(Movie template) {
        if (template.getMinutes() < 0) {
            throw new IllegalArgumentException("Not a valid length");
        }
        return movieRepository.findAll().stream()
                .filter(movie -> {
                    if (template.getId() == movie.getId()) {
                        return true;
                    }
                    return (template.getName() == null || movie.getName().contains(template.getName())) &&
                            (template.getMinutes() == null || movie.getMinutes() <= template.getMinutes()) &&
                            (template.getGenre() == null || movie.getGenre() == template.getGenre());

                }).collect(Collectors.toList());
    }
}
