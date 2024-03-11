package com.abcosta.jdbc.movie;

import com.abcosta.jdbc.Movie;
import com.abcosta.jdbc.excepetion.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieDao movieDao;

    public MovieService(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    public List<Movie> getMovies() {
        return movieDao.getMovies();
    }

    public void createMovie(Movie movie) {
        int result = movieDao.createMovie(movie);

        if (result != 1) {
            throw new IllegalStateException("something went wrong");
        }
    }

    public void deleteMovie(Integer id) {
        Optional<Movie> movies = movieDao.getMovieById(id);
        movies.ifPresentOrElse(movie -> {
            int result = movieDao.deleteMovie(id);
            if (result != 1) {
                throw new IllegalStateException("oops could not delete movie");
            }
        }, () -> {
            throw new NotFoundException(String.format("Movie with id %s not found", id));
        });
    }

    public Movie getMovieById(int id) {
        return movieDao.getMovieById(id)
                .orElseThrow(() -> new NotFoundException(String.format("Movie with id %s not found", id)));
    }
}
