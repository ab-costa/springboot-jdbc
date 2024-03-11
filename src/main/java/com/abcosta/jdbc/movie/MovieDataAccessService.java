package com.abcosta.jdbc.movie;

import com.abcosta.jdbc.Movie;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovieDataAccessService implements MovieDao {
    @Override
    public List<Movie> getMovies() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public int createMovie(Movie movie) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public int deleteMovie(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public Optional<Movie> getMovieById(int id) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
