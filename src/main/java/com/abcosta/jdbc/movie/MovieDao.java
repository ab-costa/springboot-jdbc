package com.abcosta.jdbc.movie;

import com.abcosta.jdbc.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDao {
    List<Movie> getMovies();
    int createMovie(Movie movie);
    int deleteMovie(int id);
    Optional<Movie> getMovieById(int id);
}
